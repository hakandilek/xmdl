/**
 * <copyright>
 * </copyright>
 *
 * $Id: BParameterNature.java,v 1.1 2006/01/16 11:33:44 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BParameter Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chrome.xmdlbo.XmdlboPackage#getBParameterNature()
 * @model
 * @generated
 */
public final class BParameterNature extends AbstractEnumerator {
	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN = 1;

	/**
	 * The '<em><b>OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUT = 2;

	/**
	 * The '<em><b>IN OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_OUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_OUT = 3;

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @generated
	 * @ordered
	 */
	public static final BParameterNature IN_LITERAL = new BParameterNature(IN, "IN");

	/**
	 * The '<em><b>OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT
	 * @generated
	 * @ordered
	 */
	public static final BParameterNature OUT_LITERAL = new BParameterNature(OUT, "OUT");

	/**
	 * The '<em><b>IN OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_OUT
	 * @generated
	 * @ordered
	 */
	public static final BParameterNature IN_OUT_LITERAL = new BParameterNature(IN_OUT, "IN_OUT");

	/**
	 * An array of all the '<em><b>BParameter Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BParameterNature[] VALUES_ARRAY =
		new BParameterNature[] {
			IN_LITERAL,
			OUT_LITERAL,
			IN_OUT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>BParameter Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BParameter Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BParameterNature get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BParameterNature result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BParameter Nature</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BParameterNature get(int value) {
		switch (value) {
			case IN: return IN_LITERAL;
			case OUT: return OUT_LITERAL;
			case IN_OUT: return IN_OUT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BParameterNature(int value, String name) {
		super(value, name);
	}

} //BParameterNature
