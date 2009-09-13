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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdl.wdl.Model#getProject <em>Project</em>}</li>
 *   <li>{@link org.xmdl.wdl.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xmdl.wdl.Model#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdl.wdl.WdlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see org.xmdl.wdl.WdlPackage#getModel_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link org.xmdl.wdl.Model#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link org.xmdl.wdl.Query}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see org.xmdl.wdl.WdlPackage#getModel_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQueries();

} // Model
