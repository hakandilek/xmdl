/**
 * <copyright>
 * </copyright>
 *
 */
package org.xmdl.wdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xmdl.wdl.Attribute;
import org.xmdl.wdl.Embed;
import org.xmdl.wdl.Entity;
import org.xmdl.wdl.EnumLiteral;
import org.xmdl.wdl.JAVAID;
import org.xmdl.wdl.Model;
import org.xmdl.wdl.Project;
import org.xmdl.wdl.SimpleType;
import org.xmdl.wdl.Type;
import org.xmdl.wdl.WdlFactory;
import org.xmdl.wdl.WdlPackage;

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
      case WdlPackage.ENUM: return createEnum();
      case WdlPackage.ENUM_LITERAL: return createEnumLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public org.xmdl.wdl.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral createEnumLiteral()
  {
    EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
    return enumLiteral;
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
