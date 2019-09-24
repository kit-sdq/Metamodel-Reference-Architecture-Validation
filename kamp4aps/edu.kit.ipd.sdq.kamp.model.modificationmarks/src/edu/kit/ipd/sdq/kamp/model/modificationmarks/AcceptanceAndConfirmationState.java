/**
 */
package edu.kit.ipd.sdq.kamp.model.modificationmarks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Acceptance And Confirmation State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage#getAcceptanceAndConfirmationState()
 * @model
 * @generated
 */
public enum AcceptanceAndConfirmationState implements Enumerator {
	/**
	 * The '<em><b>NODECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODECISION_VALUE
	 * @generated
	 * @ordered
	 */
	NODECISION(0, "NODECISION", "NODECISION"),

	/**
	 * The '<em><b>CONFIRMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(1, "CONFIRMED", "CONFIRMED"),

	/**
	 * The '<em><b>EXCLUDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDED(2, "EXCLUDED", "EXCLUDED");

	/**
	 * The '<em><b>NODECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NODECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODECISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODECISION_VALUE = 0;

	/**
	 * The '<em><b>CONFIRMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIRMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 1;

	/**
	 * The '<em><b>EXCLUDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Acceptance And Confirmation State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcceptanceAndConfirmationState[] VALUES_ARRAY =
		new AcceptanceAndConfirmationState[] {
			NODECISION,
			CONFIRMED,
			EXCLUDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Acceptance And Confirmation State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcceptanceAndConfirmationState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Acceptance And Confirmation State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptanceAndConfirmationState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcceptanceAndConfirmationState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acceptance And Confirmation State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptanceAndConfirmationState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcceptanceAndConfirmationState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acceptance And Confirmation State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AcceptanceAndConfirmationState get(int value) {
		switch (value) {
			case NODECISION_VALUE: return NODECISION;
			case CONFIRMED_VALUE: return CONFIRMED;
			case EXCLUDED_VALUE: return EXCLUDED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AcceptanceAndConfirmationState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AcceptanceAndConfirmationState
