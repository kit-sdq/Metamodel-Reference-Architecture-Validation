package metamodelessessor.aet.transformation

import de.cau.cs.se.software.evaluation.hypergraph.HypergraphFactory
import de.cau.cs.se.software.evaluation.hypergraph.ModelElementTrace
import de.cau.cs.se.software.evaluation.hypergraph.ModularHypergraph
import de.cau.cs.se.software.evaluation.hypergraph.Module
import de.cau.cs.se.software.evaluation.hypergraph.Node
import de.cau.cs.se.software.evaluation.transformation.AbstractTransformation
import java.util.HashMap
import java.util.HashSet
import java.util.Set
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

import static extension de.cau.cs.se.software.evaluation.transformation.HypergraphCreationFactory.*

class TransformationEClassesToHypergraph extends AbstractTransformation<Set<EClass>, ModularHypergraph> {

	val boolean transformReferences
	val boolean transformInheritance

	new(IProgressMonitor monitor, boolean transformReferences, boolean transformInheritance) {
		super(monitor)
		this.transformReferences = transformReferences
		this.transformInheritance = transformInheritance
	}

	override generate(Set<EClass> classes) {
		result = HypergraphFactory.eINSTANCE.createModularHypergraph

		val nodeMap = new HashMap<EClass, Node>()

		/** packages */
		resolvePackages(classes)

		/** classes */
		result.modules.forEach [ module |
			getClassesOfModule(module).forEach [
				if (classes.contains(it)) {
					nodeMap.put(it, result.createNode(module, module.name + "." + it.name, it))
				}
			]
		]

		val borderNodeMap = new HashMap<EClass, Node>()

		if (transformReferences) {
			nodeMap.values.forEach [ sourceNode |
				// references to edges
				getReferencesOfNode(sourceNode).forEach [ reference |
					val targetClass = reference.EReferenceType
					if (targetClass !== null) {
						if (targetClass.EPackage === null) {
							println("Broken reference: " + targetClass)
						} else {
							var targetNode = getOrCreateNode(targetClass, nodeMap, borderNodeMap)
							val genType = reference.EGenericType
							if (genType !== null) {
								// get all type arguments which are set to EClasses (and not to type params)
								val fixedTypeArgs = genType.ETypeArguments.filter[it.EClassifier !== null].map [
									it.EClassifier as EClass // TODO: hack cast
								]
								val fixedTypeArgNodes = fixedTypeArgs.map[getOrCreateNode(it, nodeMap, borderNodeMap)]

								// create a hyperedge with the super class and all classes which were referenced by type args
								val nodes = new HashSet(fixedTypeArgs.length)
								nodes.addAll(fixedTypeArgNodes)
								nodes.add(sourceNode)
								nodes.add(targetNode)
								createHyperedge(result, nodes, "reference: " + reference.name + '<' + fixedTypeArgs.map [
									name + ','
								] + '>', genType)
							} else {
								createEdge(result, sourceNode, targetNode, "reference: " + reference.name, reference)
							}
						}
					}
				]

				// type param bounds to edges
				sourceNode.EClass.ETypeParameters.forEach [ typeParam |
					typeParam.EBounds.forEach [ genericType |
						val targetClass = genericType.EClassifier as EClass // TODO: hack cast
						var targetNode = getOrCreateNode(targetClass, nodeMap, borderNodeMap)
						createEdge(result, sourceNode, targetNode, "<? extends " + targetClass.name + '>', genericType)
					]
				]
			]
		}

		if (transformInheritance) {
			nodeMap.values.forEach [ sourceNode |
				val sourceClass = sourceNode.getEClass
				val genSuperClasses = sourceClass.EGenericSuperTypes

				// generic inheritance to hyperedge
				genSuperClasses.forEach [ genSuper |
					val EClass superClass = genSuper.EClassifier as EClass // TODO: hack cast
					if (superClass.EPackage !== null) {
						var targetNode = getOrCreateNode(superClass, nodeMap, borderNodeMap)

						// get all type arguments which are set to EClasses (and not to type params)
						val fixedTypeArgs = genSuper.ETypeArguments.filter [
							it.EClassifier !== null && it.EClassifier instanceof EClass /* TODO: hack */
						].map [
							it.EClassifier as EClass // TODO: hack cast
						]
						val fixedTypeArgNodes = fixedTypeArgs.map[getOrCreateNode(it, nodeMap, borderNodeMap)]

						// create a hyperedge with the super class and all classes which were referenced by type args
						val nodes = new HashSet(fixedTypeArgs.length)
						nodes.addAll(fixedTypeArgNodes)
						nodes.add(targetNode)
						nodes.add(sourceNode)
						val edgeName = sourceClass.name + "->" + superClass.name + '<' + fixedTypeArgs.map[name + ','] +
							'>'
						createHyperedge(result, nodes, edgeName, genSuper)
					} else {
						println("Broken inheritance: " + superClass)
					}
				]
			]
		}

		result
	}

	private def Node getOrCreateNode(EClass targetClass, HashMap<EClass, Node> nodeMap,
		HashMap<EClass, Node> borderNodeMap) {
		var targetNode = nodeMap.get(targetClass)
		if (targetNode === null)
			targetNode = borderNodeMap.get(targetClass)
		if (targetNode === null) {
			// class is a new bordering class
			val module = moduleOf(targetClass)
			targetNode = result.createNode(module, module.name + "." + targetClass.name, targetClass)
			borderNodeMap.put(targetClass, targetNode)
		}
		targetNode
	}

	private def moduleOf(EClass eClass) {
		for (module : result.modules)
			if (module.getClassesOfModule.exists[otherClass|eClass == otherClass])
				return module
		val ePackage = eClass.EPackage
		return result.createModule(ePackage.determineName, ePackage)
	}

	private def getClassesOfModule(Module module) {
		((module.derivedFrom as ModelElementTrace).element as EPackage).EClassifiers.filter(EClass)
	}

	protected def getReferencesOfNode(Node sourceNode) {
		sourceNode.EClass.EReferences
	}

	protected def getInheritancesOfNode(Node sourceNode) {
		sourceNode.EClass.ESuperTypes
	}

	protected def EClass getEClass(Node node) {
		(node.derivedFrom as ModelElementTrace).element as EClass
	}

	private def void resolvePackages(Set<EClass> classes) {
		val packages = new HashSet<EPackage>();
		classes.forEach [
			val ePackage = it.EPackage
			if (packages.add(ePackage))
				result.createModule(ePackage.determineName, ePackage)
		]
	}

	/**
	 * Create full qualified package name.
	 */
	private def String determineName(EPackage ePackage) {
		if (ePackage.ESuperPackage !== null)
			ePackage.ESuperPackage.determineName + "." + ePackage.name
		else
			ePackage.name
	}

	override workEstimate(Set<EClass> input) {
		1 + // resolvePackages
		1 + // classes
		1 // references
	}

}
