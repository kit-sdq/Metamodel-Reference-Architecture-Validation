package metamodelessessor.aet.transformation

import de.cau.cs.se.software.evaluation.hypergraph.HypergraphFactory
import de.cau.cs.se.software.evaluation.hypergraph.ModularHypergraph
import de.cau.cs.se.software.evaluation.transformation.AbstractTransformation
import java.util.HashSet
import java.util.Map
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EcoreFactory

import static extension de.cau.cs.se.software.evaluation.transformation.HypergraphCreationFactory.*

class TransformationDependenciesToHypergraph extends AbstractTransformation<Map<String, HashSet<String>>, ModularHypergraph> {

	new(IProgressMonitor monitor) {
		super(monitor)
	}

	override generate(Map<String, HashSet<String>> adjacencyTable) {
		result = HypergraphFactory.eINSTANCE.createModularHypergraph
		val dummy = EcoreFactory.eINSTANCE.createEObject

		val globalModule = result.createModule("", dummy)

		adjacencyTable.keySet.forEach [ moduleName |
			result.createNode(globalModule, ' ' + moduleName, dummy)
		]

		adjacencyTable.forEach [ moduleName, dependencies |
			val sourceNode = result.nodes.findFirst[node|node.name.equals(' ' + moduleName)]
			dependencies.forEach [ dependencyName |
				val targetNode = result.nodes.findFirst[node|node.name.equals(' ' + dependencyName)]
				if (targetNode === null) {
					if (!dependencyName.equalsIgnoreCase("ecore"))
						println("WARNING: There is no target node for the dependency from " + moduleName + " to " + dependencyName)
				} else {
					result.createEdge(sourceNode, targetNode, "depends", dummy)
				}
			]
		]

		result
	}

	override workEstimate(Map<String, HashSet<String>> input) {
		3
	}
}
