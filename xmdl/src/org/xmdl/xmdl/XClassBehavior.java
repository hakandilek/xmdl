/**
 * hd
 *
 * $Id$
 */
package org.xmdl.xmdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XClass Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xmdl.xmdl.XmdlPackage#getXClassBehavior()
 * @model
 * @generated
 */
public enum XClassBehavior implements Enumerator {
	/**
	 * The '<em><b>PERSISTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSISTED_VALUE
	 * @generated
	 * @ordered
	 */
	PERSISTED(0, "PERSISTED", "PERSISTED"),

	/**
	 * The '<em><b>VIRTUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL(1, "VIRTUAL", "VIRTUAL"),

	/**
	 * The '<em><b>EMBEDDABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBEDDABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EMBEDDABLE(2, "EMBEDDABLE", "EMBEDDABLE");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The '<em><b>PERSISTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERSISTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSISTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSISTED_VALUE = 0;

	/**
	 * The '<em><b>VIRTUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_VALUE = 1;

	/**
	 * The '<em><b>EMBEDDABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMBEDDABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMBEDDABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMBEDDABLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>XClass Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XClassBehavior[] VALUES_ARRAY = new XClassBehavior[] {
			PERSISTED, VIRTUAL, EMBEDDABLE, };

	/**
	 * A public read-only list of all the '<em><b>XClass Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XClassBehavior> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XClass Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XClassBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XClassBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XClass Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XClassBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XClassBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XClass Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XClassBehavior get(int value) {
		switch (value) {
		case PERSISTED_VALUE:
			return PERSISTED;
		case VIRTUAL_VALUE:
			return VIRTUAL;
		case EMBEDDABLE_VALUE:
			return EMBEDDABLE;
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
	private XClassBehavior(int value, String name, String literal) {
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

} //XClassBehavior
