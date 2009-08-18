/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xmdl.wdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WdlFactoryImpl extends EFactoryImpl implements WdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WdlFactory init()
  {
    try
    {
      WdlFactory theWdlFactory = (WdlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xmdl.org/WDL"); 
      if (theWdlFactory != null)
      {
        return theWdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WdlPackage.MODEL: return createModel();
      case WdlPackage.PROJECT: return createProject();
      case WdlPackage.TYPE: return createType();
      case WdlPackage.SIMPLE_TYPE: return createSimpleType();
      case WdlPackage.JAVAID: return createJAVAID();
      case WdlPackage.ENTITY: return createEntity();
      case WdlPackage.EMBED: return createEmbed();
      case WdlPackage.ATTRIBUTE: return createAttribute();
      case WdlPackage.ENUMERATION: return createEnumeration();
      case WdlPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case WdlPackage.QUERY: return createQuery();
      case WdlPackage.QUERY_PARAMETER: return createQueryParameter();
      case WdlPackage.QUERY_FILTER: return createQueryFilter();
      case WdlPackage.QUERY_ORDER: return createQueryOrder();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WdlPackage.ATTRIBUTE_MANY_REFERENCE:
        return createAttributeManyReferenceFromString(eDataType, initialValue);
      case WdlPackage.QUERY_ORDER_TYPE:
        return createQueryOrderTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WdlPackage.ATTRIBUTE_MANY_REFERENCE:
        return convertAttributeManyReferenceToString(eDataType, instanceValue);
      case WdlPackage.QUERY_ORDER_TYPE:
        return convertQueryOrderTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JAVAID createJAVAID()
  {
    JAVAIDImpl javaid = new JAVAIDImpl();
    return javaid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Embed createEmbed()
  {
    EmbedImpl embed = new EmbedImpl();
    return embed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryParameter createQueryParameter()
  {
    QueryParameterImpl queryParameter = new QueryParameterImpl();
    return queryParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryFilter createQueryFilter()
  {
    QueryFilterImpl queryFilter = new QueryFilterImpl();
    return queryFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOrder createQueryOrder()
  {
    QueryOrderImpl queryOrder = new QueryOrderImpl();
    return queryOrder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeManyReference createAttributeManyReferenceFromString(EDataType eDataType, String initialValue)
  {
    AttributeManyReference result = AttributeManyReference.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeManyReferenceToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOrderType createQueryOrderTypeFromString(EDataType eDataType, String initialValue)
  {
    QueryOrderType result = QueryOrderType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQueryOrderTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WdlPackage getWdlPackage()
  {
    return (WdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WdlPackage getPackage()
  {
    return WdlPackage.eINSTANCE;
  }

} //WdlFactoryImpl
