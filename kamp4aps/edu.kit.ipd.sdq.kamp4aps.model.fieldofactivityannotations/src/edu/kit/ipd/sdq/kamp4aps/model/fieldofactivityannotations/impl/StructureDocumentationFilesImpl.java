/**
 */
package edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.DocumentationSpecification;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.KAMP4aPSFieldofactivityannotationsPackage;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.MainteneanceDocumentation;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.OperatorInstructions;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.StructureDocumentationFiles;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocExternal;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.TrainingDocIntern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Documentation Files</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getMainteneance <em>Mainteneance</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getTrainingIntern <em>Training Intern</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getTrainingExternal <em>Training External</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.impl.StructureDocumentationFilesImpl#getDocumentedStructure <em>Documented Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureDocumentationFilesImpl extends MinimalEObjectImpl.Container implements StructureDocumentationFiles {
	/**
	 * The cached value of the '{@link #getMainteneance() <em>Mainteneance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainteneance()
	 * @generated
	 * @ordered
	 */
	protected EList<MainteneanceDocumentation> mainteneance;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatorInstructions> instructions;

	/**
	 * The cached value of the '{@link #getTrainingIntern() <em>Training Intern</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingIntern()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingDocIntern> trainingIntern;

	/**
	 * The cached value of the '{@link #getTrainingExternal() <em>Training External</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingExternal()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingDocExternal> trainingExternal;

	/**
	 * The cached value of the '{@link #getDocumentedStructure() <em>Documented Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure documentedStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDocumentationFilesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KAMP4aPSFieldofactivityannotationsPackage.Literals.STRUCTURE_DOCUMENTATION_FILES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MainteneanceDocumentation> getMainteneance() {
		if (mainteneance == null) {
			mainteneance = new EObjectContainmentWithInverseEList<MainteneanceDocumentation>(MainteneanceDocumentation.class, this, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE, KAMP4aPSFieldofactivityannotationsPackage.MAINTENEANCE_DOCUMENTATION__PARENT);
		}
		return mainteneance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatorInstructions> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentWithInverseEList<OperatorInstructions>(OperatorInstructions.class, this, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS, KAMP4aPSFieldofactivityannotationsPackage.OPERATOR_INSTRUCTIONS__PARENT);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainingDocIntern> getTrainingIntern() {
		if (trainingIntern == null) {
			trainingIntern = new EObjectContainmentWithInverseEList<TrainingDocIntern>(TrainingDocIntern.class, this, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN, KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_INTERN__PARENT);
		}
		return trainingIntern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainingDocExternal> getTrainingExternal() {
		if (trainingExternal == null) {
			trainingExternal = new EObjectContainmentWithInverseEList<TrainingDocExternal>(TrainingDocExternal.class, this, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL, KAMP4aPSFieldofactivityannotationsPackage.TRAINING_DOC_EXTERNAL__PARENT);
		}
		return trainingExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationSpecification getParent() {
		if (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT) return null;
		return (DocumentationSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DocumentationSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(DocumentationSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION, DocumentationSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getDocumentedStructure() {
		if (documentedStructure != null && documentedStructure.eIsProxy()) {
			InternalEObject oldDocumentedStructure = (InternalEObject)documentedStructure;
			documentedStructure = (Structure)eResolveProxy(oldDocumentedStructure);
			if (documentedStructure != oldDocumentedStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE, oldDocumentedStructure, documentedStructure));
			}
		}
		return documentedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetDocumentedStructure() {
		return documentedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentedStructure(Structure newDocumentedStructure) {
		Structure oldDocumentedStructure = documentedStructure;
		documentedStructure = newDocumentedStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE, oldDocumentedStructure, documentedStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMainteneance()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructions()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingIntern()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTrainingExternal()).basicAdd(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DocumentationSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				return ((InternalEList<?>)getMainteneance()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return ((InternalEList<?>)getTrainingIntern()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return ((InternalEList<?>)getTrainingExternal()).basicRemove(otherEnd, msgs);
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				return eInternalContainer().eInverseRemove(this, KAMP4aPSFieldofactivityannotationsPackage.DOCUMENTATION_SPECIFICATION__STRUCTURE_DOCUMENTATION, DocumentationSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				return getMainteneance();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return getInstructions();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return getTrainingIntern();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return getTrainingExternal();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				return getParent();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE:
				if (resolve) return getDocumentedStructure();
				return basicGetDocumentedStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				getMainteneance().addAll((Collection<? extends MainteneanceDocumentation>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends OperatorInstructions>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				getTrainingIntern().addAll((Collection<? extends TrainingDocIntern>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				getTrainingExternal().addAll((Collection<? extends TrainingDocExternal>)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)newValue);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE:
				setDocumentedStructure((Structure)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				getMainteneance().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				getTrainingIntern().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				getTrainingExternal().clear();
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				setParent((DocumentationSpecification)null);
				return;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE:
				setDocumentedStructure((Structure)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__MAINTENEANCE:
				return mainteneance != null && !mainteneance.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_INTERN:
				return trainingIntern != null && !trainingIntern.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__TRAINING_EXTERNAL:
				return trainingExternal != null && !trainingExternal.isEmpty();
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__PARENT:
				return getParent() != null;
			case KAMP4aPSFieldofactivityannotationsPackage.STRUCTURE_DOCUMENTATION_FILES__DOCUMENTED_STRUCTURE:
				return documentedStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureDocumentationFilesImpl
