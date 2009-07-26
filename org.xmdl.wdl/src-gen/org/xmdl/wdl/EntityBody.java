/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.EntityBody#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.EntityBody#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link org.xmdl.wdl.EntityBody#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getEntityBody()
 * @model
 * @generated
 */
public interface EntityBody extends Entity, Embed
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xmdl.wdl.WdlPackage#getEntityBody_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.EntityBody#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entity</em>' reference.
   * @see #setSuperEntity(Entity)
   * @see org.xmdl.wdl.WdlPackage#getEntityBody_SuperEntity()
   * @model
   * @generated
   */
  Entity getSuperEntity();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.EntityBody#getSuperEntity <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Entity</em>' reference.
   * @see #getSuperEntity()
   * @generated
   */
  void setSuperEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getEntityBody_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // EntityBody
