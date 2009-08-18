/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.Query#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getMax <em>Max</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.xmdl.wdl.Query#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
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
   * @see org.xmdl.wdl.WdlPackage#getQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Query#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' reference list.
   * The list contents are of type {@link org.xmdl.wdl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' reference list.
   * @see org.xmdl.wdl.WdlPackage#getQuery_Entities()
   * @model
   * @generated
   */
  EList<Entity> getEntities();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.QueryParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getQuery_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<QueryParameter> getParameters();

  /**
   * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.QueryFilter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filters</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getQuery_Filters()
   * @model containment="true"
   * @generated
   */
  EList<QueryFilter> getFilters();

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see org.xmdl.wdl.WdlPackage#getQuery_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Query#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

  /**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see #setOffset(int)
   * @see org.xmdl.wdl.WdlPackage#getQuery_Offset()
   * @model
   * @generated
   */
  int getOffset();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Query#getOffset <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' attribute.
   * @see #getOffset()
   * @generated
   */
  void setOffset(int value);

  /**
   * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.QueryOrder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orders</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getQuery_Orders()
   * @model containment="true"
   * @generated
   */
  EList<QueryOrder> getOrders();

} // Query
