/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository#getComponentCorrelation <em>Component Correlation</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getDeploymentContextRepository()
 * @model
 * @generated
 */
public interface DeploymentContextRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Correlation</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Correlation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Correlation</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextPackage#getDeploymentContextRepository_ComponentCorrelation()
	 * @see edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.ComponentCorrelation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ComponentCorrelation> getComponentCorrelation();

} // DeploymentContextRepository
