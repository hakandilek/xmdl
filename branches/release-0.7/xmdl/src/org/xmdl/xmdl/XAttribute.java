package org.xmdl.xmdl;

/**
 * @model 
 */
public interface XAttribute extends XBase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * @model
	 */
	public String getName();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	public int getLength();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * @model
	 */
	public Object getDefaultValue();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Object value);

	/**
	 * @model opposite="attributes" 
	 */
	public XClass getXClass();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getXClass <em>XClass</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XClass</em>' container reference.
	 * @see #getXClass()
	 * @generated
	 */
	void setXClass(XClass value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(XType)
	 * @see org.xmdl.xmdl.XmdlPackage#getXAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	XType getType();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(XType value);

	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * The default value is <code>"OneToOne"</code>.
	 * The literals are from the enumeration {@link org.xmdl.xmdl.XAssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see org.xmdl.xmdl.XAssociationType
	 * @see #setAssociationType(XAssociationType)
	 * @see org.xmdl.xmdl.XmdlPackage#getXAttribute_AssociationType()
	 * @model default="OneToOne"
	 * @generated
	 */
	XAssociationType getAssociationType();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see org.xmdl.xmdl.XAssociationType
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(XAssociationType value);

	/**
	 * Returns the value of the '<em><b>Association Behaviour</b></em>' attribute.
	 * The default value is <code>"aggregation"</code>.
	 * The literals are from the enumeration {@link org.xmdl.xmdl.XAssociationBehaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Behaviour</em>' attribute.
	 * @see org.xmdl.xmdl.XAssociationBehaviour
	 * @see #setAssociationBehaviour(XAssociationBehaviour)
	 * @see org.xmdl.xmdl.XmdlPackage#getXAttribute_AssociationBehaviour()
	 * @model default="aggregation"
	 * @generated
	 */
	XAssociationBehaviour getAssociationBehaviour();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getAssociationBehaviour <em>Association Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Behaviour</em>' attribute.
	 * @see org.xmdl.xmdl.XAssociationBehaviour
	 * @see #getAssociationBehaviour()
	 * @generated
	 */
	void setAssociationBehaviour(XAssociationBehaviour value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(XAttribute)
	 * @see org.xmdl.xmdl.XmdlPackage#getXAttribute_Opposite()
	 * @model
	 * @generated
	 */
	XAttribute getOpposite();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(XAttribute value);

	/**
	 * Returns the value of the '<em><b>Navigable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable</em>' attribute.
	 * @see #setNavigable(boolean)
	 * @see org.xmdl.xmdl.XmdlPackage#getXAttribute_Navigable()
	 * @model default="false"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * Sets the value of the '{@link org.xmdl.xmdl.XAttribute#isNavigable <em>Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigable</em>' attribute.
	 * @see #isNavigable()
	 * @generated
	 */
	void setNavigable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isReference();

	int compareTo(Object o);
}
