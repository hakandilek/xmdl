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

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XAssociation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chrome.xmdl.XmdlPackage#getXAssociationType()
 * @model
 * @generated
 */
public enum XAssociationType implements Enumerator {
	/**
	 * The '<em><b>One To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_ONE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE_LITERAL(0, "OneToOne", "OneToOne"), /**
	 * The '<em><b>One To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_TO_MANY
	 * @generated
	 * @ordered
	 */
	ONE_TO_MANY_LITERAL(1, "OneToMany", "OneToMany"), /**
	 * The '<em><b>Many To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_ONE
	 * @generated
	 * @ordered
	 */
	MANY_TO_ONE_LITERAL(2, "ManyToOne", "ManyToOne"), /**
	 * The '<em><b>Many To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY_TO_MANY
	 * @generated
	 * @ordered
	 */
	MANY_TO_MANY_LITERAL(3, "ManyToMany", "ManyToMany");

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
	public static final List<XAssociationType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XAssociation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XAssociationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XAssociation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XAssociationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XAssociationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XAssociation Type</b></em>' literal with the specified integer value.
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
	private XAssociationType(int value, String name, String literal) {
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

	public XAssociationType oppositeType() {
		switch (value) {
		case ONE_TO_ONE:
			return ONE_TO_ONE_LITERAL;
		case ONE_TO_MANY:
			return MANY_TO_ONE_LITERAL;
		case MANY_TO_ONE:
			return ONE_TO_MANY_LITERAL;
		case MANY_TO_MANY:
			return MANY_TO_MANY_LITERAL;
		default:
			return ONE_TO_ONE_LITERAL;
		}
	}

}
