package metamodelessessor.aet

import de.cau.cs.se.software.evaluation.jobs.AbstractHypergraphAnalysisJob
import de.cau.cs.se.software.evaluation.views.AnalysisResultModelProvider
import java.util.HashSet
import java.util.Map
import metamodelessessor.aet.transformation.TransformationDependenciesToHypergraph
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Shell

class MetamodelDependenciesAnalysisJob extends AbstractHypergraphAnalysisJob {

	val Map<String,HashSet<String>> adjacencyTable

	new(Map<String,HashSet<String>> adjacencyTable, IProject project, Shell shell) {
		super(project, shell)
		this.adjacencyTable = adjacencyTable
	}

	override protected run(IProgressMonitor monitor) {

		val result = AnalysisResultModelProvider.INSTANCE
		result.clearValues

		val transformation = new TransformationDependenciesToHypergraph(monitor)
		transformation.generate(adjacencyTable)
		val hypergraph = transformation.result
		
		result.addResult(project.name, "number of modules", hypergraph.modules.size)
		result.addResult(project.name, "number of nodes", hypergraph.nodes.size)
		result.addResult(project.name, "number of edges", hypergraph.edges.size)

		calculateSize(hypergraph, monitor, result)

		result.hypergraph = hypergraph
		updateView()
		
		monitor.done()
		Status.OK_STATUS
	}

}
