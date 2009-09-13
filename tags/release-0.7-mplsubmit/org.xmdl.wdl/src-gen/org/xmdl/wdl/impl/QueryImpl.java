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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmdl.wdl.Entity;
import org.xmdl.wdl.Query;
import org.xmdl.wdl.QueryFilter;
import org.xmdl.wdl.QueryOrder;
import org.xmdl.wdl.QueryParameter;
import org.xmdl.wdl.WdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.xmdl.wdl.impl.QueryImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query
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
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<QueryParameter> parameters;

  /**
   * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilters()
   * @generated
   * @ordered
   */
  protected EList<QueryFilter> filters;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected static final int OFFSET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffset()
   * @generated
   * @ordered
   */
  protected int offset = OFFSET_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrders()
   * @generated
   * @ordered
   */
  protected EList<QueryOrder> orders;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
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
    return WdlPackage.Literals.QUERY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.QUERY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectResolvingEList<Entity>(Entity.class, this, WdlPackage.QUERY__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QueryParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<QueryParameter>(QueryParameter.class, this, WdlPackage.QUERY__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QueryFilter> getFilters()
  {
    if (filters == null)
    {
      filters = new EObjectContainmentEList<QueryFilter>(QueryFilter.class, this, WdlPackage.QUERY__FILTERS);
    }
    return filters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.QUERY__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOffset()
  {
    return offset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffset(int newOffset)
  {
    int oldOffset = offset;
    offset = newOffset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WdlPackage.QUERY__OFFSET, oldOffset, offset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QueryOrder> getOrders()
  {
    if (orders == null)
    {
      orders = new EObjectContainmentEList<QueryOrder>(QueryOrder.class, this, WdlPackage.QUERY__ORDERS);
    }
    return orders;
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
      case WdlPackage.QUERY__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case WdlPackage.QUERY__FILTERS:
        return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
      case WdlPackage.QUERY__ORDERS:
        return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
      case WdlPackage.QUERY__NAME:
        return getName();
      case WdlPackage.QUERY__ENTITIES:
        return getEntities();
      case WdlPackage.QUERY__PARAMETERS:
        return getParameters();
      case WdlPackage.QUERY__FILTERS:
        return getFilters();
      case WdlPackage.QUERY__MAX:
        return getMax();
      case WdlPackage.QUERY__OFFSET:
        return getOffset();
      case WdlPackage.QUERY__ORDERS:
        return getOrders();
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
      case WdlPackage.QUERY__NAME:
        setName((String)newValue);
        return;
      case WdlPackage.QUERY__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
      case WdlPackage.QUERY__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends QueryParameter>)newValue);
        return;
      case WdlPackage.QUERY__FILTERS:
        getFilters().clear();
        getFilters().addAll((Collection<? extends QueryFilter>)newValue);
        return;
      case WdlPackage.QUERY__MAX:
        setMax((Integer)newValue);
        return;
      case WdlPackage.QUERY__OFFSET:
        setOffset((Integer)newValue);
        return;
      case WdlPackage.QUERY__ORDERS:
        getOrders().clear();
        getOrders().addAll((Collection<? extends QueryOrder>)newValue);
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
      case WdlPackage.QUERY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WdlPackage.QUERY__ENTITIES:
        getEntities().clear();
        return;
      case WdlPackage.QUERY__PARAMETERS:
        getParameters().clear();
        return;
      case WdlPackage.QUERY__FILTERS:
        getFilters().clear();
        return;
      case WdlPackage.QUERY__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case WdlPackage.QUERY__OFFSET:
        setOffset(OFFSET_EDEFAULT);
        return;
      case WdlPackage.QUERY__ORDERS:
        getOrders().clear();
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
      case WdlPackage.QUERY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WdlPackage.QUERY__ENTITIES:
        return entities != null && !entities.isEmpty();
      case WdlPackage.QUERY__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case WdlPackage.QUERY__FILTERS:
        return filters != null && !filters.isEmpty();
      case WdlPackage.QUERY__MAX:
        return max != MAX_EDEFAULT;
      case WdlPackage.QUERY__OFFSET:
        return offset != OFFSET_EDEFAULT;
      case WdlPackage.QUERY__ORDERS:
        return orders != null && !orders.isEmpty();
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
    result.append(", max: ");
    result.append(max);
    result.append(", offset: ");
    result.append(offset);
    result.append(')');
    return result.toString();
  }

} //QueryImpl
