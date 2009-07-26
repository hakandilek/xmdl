/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.EntityBody;
import org.xmdl.wdl.WdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.wdl.impl.EntityBodyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.EntityBodyImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.EntityBodyImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBodyImpl extends EntityImpl implements EntityBody
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperEntity()
   * @generated
   * @ordered
   */
  protected Entity superEntity;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WdlPackage.Literals.ENTITY_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.ENTITY_BODY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSuperEntity()
  {
    if (superEntity != null && superEntity.eIsProxy())
    {
      InternalEObject oldSuperEntity = (InternalEObject)superEntity;
      superEntity = (Entity)eResolveProxy(oldSuperEntity);
      if (superEntity != oldSuperEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WdlPackage.ENTITY_BODY__SUPER_ENTITY, oldSuperEntity, superEntity));
      }
    }
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuperEntity()
  {
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperEntity(Entity newSuperEntity)
  {
    Entity oldSuperEntity = superEntity;
    superEntity = newSuperEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.ENTITY_BODY__SUPER_ENTITY, oldSuperEntity, superEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, WdlPackage.ENTITY_BODY__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WdlPackage.ENTITY_BODY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WdlPackage.ENTITY_BODY__NAME:
        return getName();
      case WdlPackage.ENTITY_BODY__SUPER_ENTITY:
        if (resolve) return getSuperEntity();
        return basicGetSuperEntity();
      case WdlPackage.ENTITY_BODY__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WdlPackage.ENTITY_BODY__NAME:
        setName((String)newValue);
        return;
      case WdlPackage.ENTITY_BODY__SUPER_ENTITY:
        setSuperEntity((Entity)newValue);
        return;
      case WdlPackage.ENTITY_BODY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WdlPackage.ENTITY_BODY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WdlPackage.ENTITY_BODY__SUPER_ENTITY:
        setSuperEntity((Entity)null);
        return;
      case WdlPackage.ENTITY_BODY__ATTRIBUTES:
        getAttributes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WdlPackage.ENTITY_BODY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WdlPackage.ENTITY_BODY__SUPER_ENTITY:
        return superEntity != null;
      case WdlPackage.ENTITY_BODY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityBodyImpl
