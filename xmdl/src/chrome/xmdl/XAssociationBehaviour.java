/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package chrome.xmdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XAssociation Behaviour</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage#getXAssociationBehaviour()
 * @model
 * @generated
 */
public final class XAssociationBehaviour extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The '<em><b>Aggregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_LITERAL
	 * @model name="aggregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION = 0;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_LITERAL
	 * @model name="composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION = 1;

	/**
	 * The '<em><b>Aggregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION
	 * @generated
	 * @ordered
	 */
	public static final XAssociationBehaviour AGGREGATION_LITERAL = new XAssociationBehaviour(
			AGGREGATION, "aggregation");

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @generated
	 * @ordered
	 */
	public static final XAssociationBehaviour COMPOSITION_LITERAL = new XAssociationBehaviour(
			COMPOSITION, "composition");

	/**
	 * An array of all the '<em><b>XAssociation Behaviour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XAssociationBehaviour[] VALUES_ARRAY = new XAssociationBehaviour[] {
			AGGREGATION_LITERAL, COMPOSITION_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>XAssociation Behaviour</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XAssociation Behaviour</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationBehaviour get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XAssociationBehaviour result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XAssociation Behaviour</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationBehaviour get(int value) {
		switch (value) {
		case AGGREGATION:
			return AGGREGATION_LITERAL;
		case COMPOSITION:
			return COMPOSITION_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private XAssociationBehaviour(int value, String name) {
		super(value, name);
	}

} //XAssociationBehaviour
