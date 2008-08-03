/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlPackage.java,v 1.13 2006/02/15 15:29:59 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xmdl.xmdl.XmdlFactory
 * @model kind="package"
 * @generated
 */
public interface XmdlPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "hd";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xmdl.org/xmdl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.xmdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmdlPackage eINSTANCE = org.xmdl.xmdl.impl.XmdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XAttributeImpl <em>XAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XAttributeImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAttribute()
	 * @generated
	 */
	int XATTRIBUTE = 5;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XBase <em>XBase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XBase
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXBase()
	 * @generated
	 */
	int XBASE = 8;

	/**
	 * The number of structural features of the '<em>XBase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBASE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XClassImpl <em>XClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XClassImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXClass()
	 * @generated
	 */
	int XCLASS = 2;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XPackageImpl <em>XPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XPackageImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXPackage()
	 * @generated
	 */
	int XPACKAGE = 1;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XProjectImpl <em>XProject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XProjectImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXProject()
	 * @generated
	 */
	int XPROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROJECT__NAME = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROJECT__PACKAGES = XBASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XProject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROJECT_FEATURE_COUNT = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__NAME = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__PROJECT = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__CLASSES = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__ENUMERATIONS = XBASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE_FEATURE_COUNT = XBASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__NAME = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__CLASS_NAME = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__XPACKAGE = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__SUPER_TYPES = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__ATTRIBUTES = XBASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__METHODS = XBASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comparable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__COMPARABLE = XBASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__BEHAVIOR = XBASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>XClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS_FEATURE_COUNT = XBASE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XMethodImpl <em>XMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XMethodImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXMethod()
	 * @generated
	 */
	int XMETHOD = 6;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XParameterImpl <em>XParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XParameterImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXParameter()
	 * @generated
	 */
	int XPARAMETER = 7;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XExceptionImpl <em>XException</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XExceptionImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXException()
	 * @generated
	 */
	int XEXCEPTION = 10;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XType <em>XType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XType
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXType()
	 * @generated
	 */
	int XTYPE = 9;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XModel <em>XModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XModel
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXModel()
	 * @generated
	 */
	int XMODEL = 11;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XEnumerationImpl <em>XEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XEnumerationImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXEnumeration()
	 * @generated
	 */
	int XENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION__NAME = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION__CLASS_NAME = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION__XPACKAGE = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION__LITERALS = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION__DEFAULT_LITERAL = XBASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION_FEATURE_COUNT = XBASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XEnumerationLiteralImpl <em>XEnumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XEnumerationLiteralImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXEnumerationLiteral()
	 * @generated
	 */
	int XENUMERATION_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION_LITERAL__ENUMERATION = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION_LITERAL__NAME = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION_LITERAL__VALUE = XBASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XEnumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUMERATION_LITERAL_FEATURE_COUNT = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__NAME = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__LENGTH = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__DEFAULT_VALUE = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__XCLASS = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__TYPE = XBASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__ASSOCIATION_TYPE = XBASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Association Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__ASSOCIATION_BEHAVIOUR = XBASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__OPPOSITE = XBASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__NAVIGABLE = XBASE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>XAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE_FEATURE_COUNT = XBASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__INDEX = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__NAME = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XClass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__XCLASS = XBASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__TYPE = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__PARAMETERS = XBASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD__EXCEPTIONS = XBASE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_FEATURE_COUNT = XBASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMETER__METHOD = XBASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMETER__NAME = XBASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMETER__TYPE = XBASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPARAMETER_FEATURE_COUNT = XBASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPE__CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>XType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEXCEPTION__JAVA_CLASS = XBASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XException</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEXCEPTION_FEATURE_COUNT = XBASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODEL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XVisitor <em>XVisitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XVisitor
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXVisitor()
	 * @generated
	 */
	int XVISITOR = 12;

	/**
	 * The number of structural features of the '<em>XVisitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XVisitorBaseImpl <em>XVisitor Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XVisitorBaseImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXVisitorBase()
	 * @generated
	 */
	int XVISITOR_BASE = 13;

	/**
	 * The number of structural features of the '<em>XVisitor Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVISITOR_BASE_FEATURE_COUNT = XVISITOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.impl.XMDLModelImpl <em>XMDL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.impl.XMDLModelImpl
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXMDLModel()
	 * @generated
	 */
	int XMDL_MODEL = 14;

	/**
	 * The number of structural features of the '<em>XMDL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMDL_MODEL_FEATURE_COUNT = XMODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XAssociationType <em>XAssociation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XAssociationType
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAssociationType()
	 * @generated
	 */
	int XASSOCIATION_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XAssociationBehaviour
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAssociationBehaviour()
	 * @generated
	 */
	int XASSOCIATION_BEHAVIOUR = 16;

	/**
	 * The meta object id for the '{@link org.xmdl.xmdl.XClassBehavior <em>XClass Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmdl.xmdl.XClassBehavior
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXClassBehavior()
	 * @generated
	 */
	int XCLASS_BEHAVIOR = 17;

	/**
	 * The meta object id for the '<em>IPath</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IPath
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getIPath()
	 * @generated
	 */
	int IPATH = 18;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getURI()
	 * @generated
	 */
	int URI = 19;

	/**
	 * The meta object id for the '<em>Resource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 20;

	/**
	 * The meta object id for the '<em>Comparable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 21;

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAttribute</em>'.
	 * @see org.xmdl.xmdl.XAttribute
	 * @generated
	 */
	EClass getXAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getName()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getLength()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getDefaultValue()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_DefaultValue();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XAttribute#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>XClass</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getXClass()
	 * @see #getXAttribute()
	 * @generated
	 */
	EReference getXAttribute_XClass();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdl.XAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getType()
	 * @see #getXAttribute()
	 * @generated
	 */
	EReference getXAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getAssociationType()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_AssociationType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#getAssociationBehaviour <em>Association Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Behaviour</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getAssociationBehaviour()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_AssociationBehaviour();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdl.XAttribute#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.xmdl.xmdl.XAttribute#getOpposite()
	 * @see #getXAttribute()
	 * @generated
	 */
	EReference getXAttribute_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XAttribute#isNavigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigable</em>'.
	 * @see org.xmdl.xmdl.XAttribute#isNavigable()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_Navigable();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XClass</em>'.
	 * @see org.xmdl.xmdl.XClass
	 * @generated
	 */
	EClass getXClass();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XClass#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>XPackage</em>'.
	 * @see org.xmdl.xmdl.XClass#getXPackage()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_XPackage();

	/**
	 * Returns the meta object for the reference list '{@link org.xmdl.xmdl.XClass#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.xmdl.xmdl.XClass#getSuperTypes()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.xmdl.xmdl.XClass#getAttributes()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.xmdl.xmdl.XClass#getMethods()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_Methods();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XClass#isComparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparable</em>'.
	 * @see org.xmdl.xmdl.XClass#isComparable()
	 * @see #getXClass()
	 * @generated
	 */
	EAttribute getXClass_Comparable();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XClass#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see org.xmdl.xmdl.XClass#getBehavior()
	 * @see #getXClass()
	 * @generated
	 */
	EAttribute getXClass_Behavior();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPackage</em>'.
	 * @see org.xmdl.xmdl.XPackage
	 * @generated
	 */
	EClass getXPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XPackage#getName()
	 * @see #getXPackage()
	 * @generated
	 */
	EAttribute getXPackage_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XPackage#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see org.xmdl.xmdl.XPackage#getProject()
	 * @see #getXPackage()
	 * @generated
	 */
	EReference getXPackage_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.xmdl.xmdl.XPackage#getClasses()
	 * @see #getXPackage()
	 * @generated
	 */
	EReference getXPackage_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XPackage#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see org.xmdl.xmdl.XPackage#getEnumerations()
	 * @see #getXPackage()
	 * @generated
	 */
	EReference getXPackage_Enumerations();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XProject <em>XProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XProject</em>'.
	 * @see org.xmdl.xmdl.XProject
	 * @generated
	 */
	EClass getXProject();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XProject#getName()
	 * @see #getXProject()
	 * @generated
	 */
	EAttribute getXProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XProject#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.xmdl.xmdl.XProject#getPackages()
	 * @see #getXProject()
	 * @generated
	 */
	EReference getXProject_Packages();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XBase <em>XBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBase</em>'.
	 * @see org.xmdl.xmdl.XBase
	 * @generated
	 */
	EClass getXBase();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XMethod <em>XMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMethod</em>'.
	 * @see org.xmdl.xmdl.XMethod
	 * @generated
	 */
	EClass getXMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XMethod#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.xmdl.xmdl.XMethod#getIndex()
	 * @see #getXMethod()
	 * @generated
	 */
	EAttribute getXMethod_Index();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XMethod#getName()
	 * @see #getXMethod()
	 * @generated
	 */
	EAttribute getXMethod_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XMethod#getXClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>XClass</em>'.
	 * @see org.xmdl.xmdl.XMethod#getXClass()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_XClass();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdl.XMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xmdl.xmdl.XMethod#getType()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.xmdl.xmdl.XMethod#getParameters()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XMethod#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.xmdl.xmdl.XMethod#getExceptions()
	 * @see #getXMethod()
	 * @generated
	 */
	EReference getXMethod_Exceptions();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XParameter <em>XParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XParameter</em>'.
	 * @see org.xmdl.xmdl.XParameter
	 * @generated
	 */
	EClass getXParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XParameter#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see org.xmdl.xmdl.XParameter#getMethod()
	 * @see #getXParameter()
	 * @generated
	 */
	EReference getXParameter_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XParameter#getName()
	 * @see #getXParameter()
	 * @generated
	 */
	EAttribute getXParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdl.XParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.xmdl.xmdl.XParameter#getType()
	 * @see #getXParameter()
	 * @generated
	 */
	EReference getXParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XException <em>XException</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XException</em>'.
	 * @see org.xmdl.xmdl.XException
	 * @generated
	 */
	EClass getXException();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XException#getJavaClass <em>Java Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class</em>'.
	 * @see org.xmdl.xmdl.XException#getJavaClass()
	 * @see #getXException()
	 * @generated
	 */
	EAttribute getXException_JavaClass();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XType <em>XType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XType</em>'.
	 * @see org.xmdl.xmdl.XType
	 * @generated
	 */
	EClass getXType();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XType#getName()
	 * @see #getXType()
	 * @generated
	 */
	EAttribute getXType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XType#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.xmdl.xmdl.XType#getClassName()
	 * @see #getXType()
	 * @generated
	 */
	EAttribute getXType_ClassName();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XModel <em>XModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XModel</em>'.
	 * @see org.xmdl.xmdl.XModel
	 * @generated
	 */
	EClass getXModel();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XVisitor <em>XVisitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XVisitor</em>'.
	 * @see org.xmdl.xmdl.XVisitor
	 * @generated
	 */
	EClass getXVisitor();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XVisitorBase <em>XVisitor Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XVisitor Base</em>'.
	 * @see org.xmdl.xmdl.XVisitorBase
	 * @generated
	 */
	EClass getXVisitorBase();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XMDLModel <em>XMDL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMDL Model</em>'.
	 * @see org.xmdl.xmdl.XMDLModel
	 * @generated
	 */
	EClass getXMDLModel();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XEnumeration <em>XEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEnumeration</em>'.
	 * @see org.xmdl.xmdl.XEnumeration
	 * @generated
	 */
	EClass getXEnumeration();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XEnumeration#getXPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>XPackage</em>'.
	 * @see org.xmdl.xmdl.XEnumeration#getXPackage()
	 * @see #getXEnumeration()
	 * @generated
	 */
	EReference getXEnumeration_XPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xmdl.xmdl.XEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.xmdl.xmdl.XEnumeration#getLiterals()
	 * @see #getXEnumeration()
	 * @generated
	 */
	EReference getXEnumeration_Literals();

	/**
	 * Returns the meta object for the reference '{@link org.xmdl.xmdl.XEnumeration#getDefaultLiteral <em>Default Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Literal</em>'.
	 * @see org.xmdl.xmdl.XEnumeration#getDefaultLiteral()
	 * @see #getXEnumeration()
	 * @generated
	 */
	EReference getXEnumeration_DefaultLiteral();

	/**
	 * Returns the meta object for class '{@link org.xmdl.xmdl.XEnumerationLiteral <em>XEnumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEnumeration Literal</em>'.
	 * @see org.xmdl.xmdl.XEnumerationLiteral
	 * @generated
	 */
	EClass getXEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.xmdl.xmdl.XEnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration</em>'.
	 * @see org.xmdl.xmdl.XEnumerationLiteral#getEnumeration()
	 * @see #getXEnumerationLiteral()
	 * @generated
	 */
	EReference getXEnumerationLiteral_Enumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XEnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xmdl.xmdl.XEnumerationLiteral#getName()
	 * @see #getXEnumerationLiteral()
	 * @generated
	 */
	EAttribute getXEnumerationLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.xmdl.xmdl.XEnumerationLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.xmdl.xmdl.XEnumerationLiteral#getValue()
	 * @see #getXEnumerationLiteral()
	 * @generated
	 */
	EAttribute getXEnumerationLiteral_Value();

	/**
	 * Returns the meta object for enum '{@link org.xmdl.xmdl.XAssociationType <em>XAssociation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XAssociation Type</em>'.
	 * @see org.xmdl.xmdl.XAssociationType
	 * @generated
	 */
	EEnum getXAssociationType();

	/**
	 * Returns the meta object for enum '{@link org.xmdl.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XAssociation Behaviour</em>'.
	 * @see org.xmdl.xmdl.XAssociationBehaviour
	 * @generated
	 */
	EEnum getXAssociationBehaviour();

	/**
	 * Returns the meta object for enum '{@link org.xmdl.xmdl.XClassBehavior <em>XClass Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XClass Behavior</em>'.
	 * @see org.xmdl.xmdl.XClassBehavior
	 * @generated
	 */
	EEnum getXClassBehavior();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IPath <em>IPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IPath</em>'.
	 * @see org.eclipse.core.runtime.IPath
	 * @model instanceClass="org.eclipse.core.runtime.IPath"
	 * @generated
	 */
	EDataType getIPath();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
	EDataType getResource();

	/**
	 * Returns the meta object for data type '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable"
	 * @generated
	 */
	EDataType getComparable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmdlFactory getXmdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XProjectImpl <em>XProject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XProjectImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXProject()
		 * @generated
		 */
		EClass XPROJECT = eINSTANCE.getXProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPROJECT__NAME = eINSTANCE.getXProject_Name();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPROJECT__PACKAGES = eINSTANCE.getXProject_Packages();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XPackageImpl <em>XPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XPackageImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXPackage()
		 * @generated
		 */
		EClass XPACKAGE = eINSTANCE.getXPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPACKAGE__NAME = eINSTANCE.getXPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPACKAGE__PROJECT = eINSTANCE.getXPackage_Project();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPACKAGE__CLASSES = eINSTANCE.getXPackage_Classes();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPACKAGE__ENUMERATIONS = eINSTANCE
				.getXPackage_Enumerations();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XClassImpl <em>XClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XClassImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXClass()
		 * @generated
		 */
		EClass XCLASS = eINSTANCE.getXClass();

		/**
		 * The meta object literal for the '<em><b>XPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCLASS__XPACKAGE = eINSTANCE.getXClass_XPackage();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCLASS__SUPER_TYPES = eINSTANCE.getXClass_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCLASS__ATTRIBUTES = eINSTANCE.getXClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCLASS__METHODS = eINSTANCE.getXClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Comparable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCLASS__COMPARABLE = eINSTANCE.getXClass_Comparable();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCLASS__BEHAVIOR = eINSTANCE.getXClass_Behavior();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XEnumerationImpl <em>XEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XEnumerationImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXEnumeration()
		 * @generated
		 */
		EClass XENUMERATION = eINSTANCE.getXEnumeration();

		/**
		 * The meta object literal for the '<em><b>XPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XENUMERATION__XPACKAGE = eINSTANCE
				.getXEnumeration_XPackage();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XENUMERATION__LITERALS = eINSTANCE
				.getXEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Default Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XENUMERATION__DEFAULT_LITERAL = eINSTANCE
				.getXEnumeration_DefaultLiteral();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XEnumerationLiteralImpl <em>XEnumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XEnumerationLiteralImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXEnumerationLiteral()
		 * @generated
		 */
		EClass XENUMERATION_LITERAL = eINSTANCE.getXEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XENUMERATION_LITERAL__ENUMERATION = eINSTANCE
				.getXEnumerationLiteral_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XENUMERATION_LITERAL__NAME = eINSTANCE
				.getXEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XENUMERATION_LITERAL__VALUE = eINSTANCE
				.getXEnumerationLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XAttributeImpl <em>XAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XAttributeImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAttribute()
		 * @generated
		 */
		EClass XATTRIBUTE = eINSTANCE.getXAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__NAME = eINSTANCE.getXAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__LENGTH = eINSTANCE.getXAttribute_Length();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__DEFAULT_VALUE = eINSTANCE
				.getXAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>XClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATTRIBUTE__XCLASS = eINSTANCE.getXAttribute_XClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATTRIBUTE__TYPE = eINSTANCE.getXAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__ASSOCIATION_TYPE = eINSTANCE
				.getXAttribute_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Association Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__ASSOCIATION_BEHAVIOUR = eINSTANCE
				.getXAttribute_AssociationBehaviour();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATTRIBUTE__OPPOSITE = eINSTANCE.getXAttribute_Opposite();

		/**
		 * The meta object literal for the '<em><b>Navigable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XATTRIBUTE__NAVIGABLE = eINSTANCE.getXAttribute_Navigable();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XMethodImpl <em>XMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XMethodImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXMethod()
		 * @generated
		 */
		EClass XMETHOD = eINSTANCE.getXMethod();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMETHOD__INDEX = eINSTANCE.getXMethod_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMETHOD__NAME = eINSTANCE.getXMethod_Name();

		/**
		 * The meta object literal for the '<em><b>XClass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__XCLASS = eINSTANCE.getXMethod_XClass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__TYPE = eINSTANCE.getXMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__PARAMETERS = eINSTANCE.getXMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD__EXCEPTIONS = eINSTANCE.getXMethod_Exceptions();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XParameterImpl <em>XParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XParameterImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXParameter()
		 * @generated
		 */
		EClass XPARAMETER = eINSTANCE.getXParameter();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPARAMETER__METHOD = eINSTANCE.getXParameter_Method();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XPARAMETER__NAME = eINSTANCE.getXParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPARAMETER__TYPE = eINSTANCE.getXParameter_Type();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XBase <em>XBase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XBase
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXBase()
		 * @generated
		 */
		EClass XBASE = eINSTANCE.getXBase();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XType <em>XType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XType
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXType()
		 * @generated
		 */
		EClass XTYPE = eINSTANCE.getXType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTYPE__NAME = eINSTANCE.getXType_Name();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTYPE__CLASS_NAME = eINSTANCE.getXType_ClassName();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XExceptionImpl <em>XException</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XExceptionImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXException()
		 * @generated
		 */
		EClass XEXCEPTION = eINSTANCE.getXException();

		/**
		 * The meta object literal for the '<em><b>Java Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XEXCEPTION__JAVA_CLASS = eINSTANCE.getXException_JavaClass();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XModel <em>XModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XModel
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXModel()
		 * @generated
		 */
		EClass XMODEL = eINSTANCE.getXModel();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XVisitor <em>XVisitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XVisitor
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXVisitor()
		 * @generated
		 */
		EClass XVISITOR = eINSTANCE.getXVisitor();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XVisitorBaseImpl <em>XVisitor Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XVisitorBaseImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXVisitorBase()
		 * @generated
		 */
		EClass XVISITOR_BASE = eINSTANCE.getXVisitorBase();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.impl.XMDLModelImpl <em>XMDL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.impl.XMDLModelImpl
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXMDLModel()
		 * @generated
		 */
		EClass XMDL_MODEL = eINSTANCE.getXMDLModel();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XAssociationType <em>XAssociation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XAssociationType
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAssociationType()
		 * @generated
		 */
		EEnum XASSOCIATION_TYPE = eINSTANCE.getXAssociationType();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XAssociationBehaviour
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXAssociationBehaviour()
		 * @generated
		 */
		EEnum XASSOCIATION_BEHAVIOUR = eINSTANCE.getXAssociationBehaviour();

		/**
		 * The meta object literal for the '{@link org.xmdl.xmdl.XClassBehavior <em>XClass Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmdl.xmdl.XClassBehavior
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getXClassBehavior()
		 * @generated
		 */
		EEnum XCLASS_BEHAVIOR = eINSTANCE.getXClassBehavior();

		/**
		 * The meta object literal for the '<em>IPath</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IPath
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getIPath()
		 * @generated
		 */
		EDataType IPATH = eINSTANCE.getIPath();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Resource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getResource()
		 * @generated
		 */
		EDataType RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em>Comparable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see org.xmdl.xmdl.impl.XmdlPackageImpl#getComparable()
		 * @generated
		 */
		EDataType COMPARABLE = eINSTANCE.getComparable();

	}

} //XmdlPackage
