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
 * A representation of the literals of the enumeration '<em><b>XAssociation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage#getXAssociationType()
 * @model
 * @generated
 */
public final class XAssociationType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The '<em><b>One To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE_LITERAL
	 * @model name="OneToOne"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE = 0;

	/**
	 * The '<em><b>One To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One To Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY_LITERAL
	 * @model name="OneToMany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_MANY = 1;

	/**
	 * The '<em><b>Many To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many To One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_ONE_LITERAL
	 * @model name="ManyToOne"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TO_ONE = 2;

	/**
	 * The '<em><b>Many To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Many To Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY_LITERAL
	 * @model name="ManyToMany"
	 * @generated
	 * @ordered
	 */
	public static final int MANY_TO_MANY = 3;

	/**
	 * The '<em><b>One To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE
	 * 
	 * @ordered
	 */
	public static final XAssociationType ONE_TO_ONE_LITERAL = new XAssociationType(
			ONE_TO_ONE, "OneToOne", ONE_TO_ONE);

	/**
	 * The '<em><b>One To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY
	 * 
	 * @ordered
	 */
	public static final XAssociationType ONE_TO_MANY_LITERAL = new XAssociationType(
			ONE_TO_MANY, "OneToMany", MANY_TO_ONE);

	/**
	 * The '<em><b>Many To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_ONE
	 * 
	 * @ordered
	 */
	public static final XAssociationType MANY_TO_ONE_LITERAL = new XAssociationType(
			MANY_TO_ONE, "ManyToOne", ONE_TO_MANY);

	/**
	 * The '<em><b>Many To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY
	 * 
	 * @ordered
	 */
	public static final XAssociationType MANY_TO_MANY_LITERAL = new XAssociationType(
			MANY_TO_MANY, "ManyToMany", MANY_TO_MANY);

	/**
	 * An array of all the '<em><b>XAssociation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XAssociationType[] VALUES_ARRAY = new XAssociationType[] {
			ONE_TO_ONE_LITERAL, ONE_TO_MANY_LITERAL, MANY_TO_ONE_LITERAL,
			MANY_TO_MANY_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>XAssociation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XAssociation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XAssociationType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XAssociation Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationType get(int value) {
		switch (value) {
		case ONE_TO_ONE:
			return ONE_TO_ONE_LITERAL;
		case ONE_TO_MANY:
			return ONE_TO_MANY_LITERAL;
		case MANY_TO_ONE:
			return MANY_TO_ONE_LITERAL;
		case MANY_TO_MANY:
			return MANY_TO_MANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	private XAssociationType(int value, String name) {
		super(value, name);
		oppositeTypeValue = ONE_TO_ONE;
		throw new UnsupportedOperationException(
				"This constructor should not be used");
	}

	private final int oppositeTypeValue;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	private XAssociationType(int value, String name, int oppositeTypeValue) {
		super(value, name);
		this.oppositeTypeValue = oppositeTypeValue;
	}

	public XAssociationType oppositeType() {
		return get(oppositeTypeValue);
	}

} //XAssociationType
