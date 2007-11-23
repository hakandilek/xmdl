/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlPackage.java,v 1.13 2006/02/15 15:29:59 tr001\tr1d2643 Exp $
 */
package chrome.xmdl;

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
 * @see chrome.xmdl.XmdlFactory
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
    String eNS_URI = "http://chrome/xmdl.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "chrome.xmdl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XmdlPackage eINSTANCE = chrome.xmdl.impl.XmdlPackageImpl.init();

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XAttributeImpl <em>XAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XAttributeImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXAttribute()
     * @generated
     */
    int XATTRIBUTE = 5;

    /**
     * The meta object id for the '{@link chrome.xmdl.XBase <em>XBase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XBase
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXBase()
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
     * The meta object id for the '{@link chrome.xmdl.impl.XClassImpl <em>XClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XClassImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXClass()
     * @generated
     */
    int XCLASS = 2;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XPackageImpl <em>XPackage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XPackageImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXPackage()
     * @generated
     */
    int XPACKAGE = 1;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XProjectImpl <em>XProject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XProjectImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXProject()
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
     * The number of structural features of the '<em>XClass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XCLASS_FEATURE_COUNT = XBASE_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XMethodImpl <em>XMethod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XMethodImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXMethod()
     * @generated
     */
    int XMETHOD = 6;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XParameterImpl <em>XParameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XParameterImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXParameter()
     * @generated
     */
    int XPARAMETER = 7;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XExceptionImpl <em>XException</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XExceptionImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXException()
     * @generated
     */
    int XEXCEPTION = 10;

    /**
     * The meta object id for the '{@link chrome.xmdl.XType <em>XType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XType
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXType()
     * @generated
     */
    int XTYPE = 9;

    /**
     * The meta object id for the '{@link chrome.xmdl.XModel <em>XModel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XModel
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXModel()
     * @generated
     */
    int XMODEL = 11;

    /**
     * The meta object id for the '{@link chrome.xmdl.impl.XEnumerationImpl <em>XEnumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XEnumerationImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXEnumeration()
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
     * The meta object id for the '{@link chrome.xmdl.impl.XEnumerationLiteralImpl <em>XEnumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XEnumerationLiteralImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXEnumerationLiteral()
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
     * The meta object id for the '{@link chrome.xmdl.XVisitor <em>XVisitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XVisitor
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXVisitor()
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
     * The meta object id for the '{@link chrome.xmdl.impl.XVisitorBaseImpl <em>XVisitor Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.impl.XVisitorBaseImpl
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXVisitorBase()
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
     * The meta object id for the '{@link chrome.xmdl.XAssociationType <em>XAssociation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XAssociationType
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXAssociationType()
     * @generated
     */
    int XASSOCIATION_TYPE = 14;

    /**
     * The meta object id for the '{@link chrome.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see chrome.xmdl.XAssociationBehaviour
     * @see chrome.xmdl.impl.XmdlPackageImpl#getXAssociationBehaviour()
     * @generated
     */
    int XASSOCIATION_BEHAVIOUR = 15;

    /**
     * The meta object id for the '<em>IPath</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.runtime.IPath
     * @see chrome.xmdl.impl.XmdlPackageImpl#getIPath()
     * @generated
     */
    int IPATH = 16;

    /**
     * The meta object id for the '<em>URI</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.URI
     * @see chrome.xmdl.impl.XmdlPackageImpl#getURI()
     * @generated
     */
    int URI = 17;

    /**
     * The meta object id for the '<em>Resource</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.resource.Resource
     * @see chrome.xmdl.impl.XmdlPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 18;

    /**
     * The meta object id for the '<em>Comparable</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Comparable
     * @see chrome.xmdl.impl.XmdlPackageImpl#getComparable()
     * @generated
     */
    int COMPARABLE = 19;

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XAttribute <em>XAttribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XAttribute</em>'.
     * @see chrome.xmdl.XAttribute
     * @generated
     */
    EClass getXAttribute();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XAttribute#getName()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see chrome.xmdl.XAttribute#getLength()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_Length();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see chrome.xmdl.XAttribute#getDefaultValue()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_DefaultValue();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XAttribute#getXClass <em>XClass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>XClass</em>'.
     * @see chrome.xmdl.XAttribute#getXClass()
     * @see #getXAttribute()
     * @generated
     */
    EReference getXAttribute_XClass();

    /**
     * Returns the meta object for the reference '{@link chrome.xmdl.XAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see chrome.xmdl.XAttribute#getType()
     * @see #getXAttribute()
     * @generated
     */
    EReference getXAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#getAssociationType <em>Association Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association Type</em>'.
     * @see chrome.xmdl.XAttribute#getAssociationType()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_AssociationType();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#getAssociationBehaviour <em>Association Behaviour</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association Behaviour</em>'.
     * @see chrome.xmdl.XAttribute#getAssociationBehaviour()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_AssociationBehaviour();

    /**
     * Returns the meta object for the reference '{@link chrome.xmdl.XAttribute#getOpposite <em>Opposite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Opposite</em>'.
     * @see chrome.xmdl.XAttribute#getOpposite()
     * @see #getXAttribute()
     * @generated
     */
    EReference getXAttribute_Opposite();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XAttribute#isNavigable <em>Navigable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Navigable</em>'.
     * @see chrome.xmdl.XAttribute#isNavigable()
     * @see #getXAttribute()
     * @generated
     */
    EAttribute getXAttribute_Navigable();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XClass <em>XClass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XClass</em>'.
     * @see chrome.xmdl.XClass
     * @generated
     */
    EClass getXClass();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XClass#getXPackage <em>XPackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>XPackage</em>'.
     * @see chrome.xmdl.XClass#getXPackage()
     * @see #getXClass()
     * @generated
     */
    EReference getXClass_XPackage();

    /**
     * Returns the meta object for the reference list '{@link chrome.xmdl.XClass#getSuperTypes <em>Super Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Super Types</em>'.
     * @see chrome.xmdl.XClass#getSuperTypes()
     * @see #getXClass()
     * @generated
     */
    EReference getXClass_SuperTypes();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XClass#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see chrome.xmdl.XClass#getAttributes()
     * @see #getXClass()
     * @generated
     */
    EReference getXClass_Attributes();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XClass#getMethods <em>Methods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Methods</em>'.
     * @see chrome.xmdl.XClass#getMethods()
     * @see #getXClass()
     * @generated
     */
    EReference getXClass_Methods();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XClass#isComparable <em>Comparable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comparable</em>'.
     * @see chrome.xmdl.XClass#isComparable()
     * @see #getXClass()
     * @generated
     */
    EAttribute getXClass_Comparable();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XPackage <em>XPackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XPackage</em>'.
     * @see chrome.xmdl.XPackage
     * @generated
     */
    EClass getXPackage();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XPackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XPackage#getName()
     * @see #getXPackage()
     * @generated
     */
    EAttribute getXPackage_Name();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XPackage#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Project</em>'.
     * @see chrome.xmdl.XPackage#getProject()
     * @see #getXPackage()
     * @generated
     */
    EReference getXPackage_Project();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XPackage#getClasses <em>Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classes</em>'.
     * @see chrome.xmdl.XPackage#getClasses()
     * @see #getXPackage()
     * @generated
     */
    EReference getXPackage_Classes();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XPackage#getEnumerations <em>Enumerations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enumerations</em>'.
     * @see chrome.xmdl.XPackage#getEnumerations()
     * @see #getXPackage()
     * @generated
     */
    EReference getXPackage_Enumerations();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XProject <em>XProject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XProject</em>'.
     * @see chrome.xmdl.XProject
     * @generated
     */
    EClass getXProject();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XProject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XProject#getName()
     * @see #getXProject()
     * @generated
     */
    EAttribute getXProject_Name();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XProject#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see chrome.xmdl.XProject#getPackages()
     * @see #getXProject()
     * @generated
     */
    EReference getXProject_Packages();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XBase <em>XBase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XBase</em>'.
     * @see chrome.xmdl.XBase
     * @generated
     */
    EClass getXBase();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XMethod <em>XMethod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMethod</em>'.
     * @see chrome.xmdl.XMethod
     * @generated
     */
    EClass getXMethod();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XMethod#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Index</em>'.
     * @see chrome.xmdl.XMethod#getIndex()
     * @see #getXMethod()
     * @generated
     */
    EAttribute getXMethod_Index();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XMethod#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XMethod#getName()
     * @see #getXMethod()
     * @generated
     */
    EAttribute getXMethod_Name();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XMethod#getXClass <em>XClass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>XClass</em>'.
     * @see chrome.xmdl.XMethod#getXClass()
     * @see #getXMethod()
     * @generated
     */
    EReference getXMethod_XClass();

    /**
     * Returns the meta object for the reference '{@link chrome.xmdl.XMethod#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see chrome.xmdl.XMethod#getType()
     * @see #getXMethod()
     * @generated
     */
    EReference getXMethod_Type();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XMethod#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see chrome.xmdl.XMethod#getParameters()
     * @see #getXMethod()
     * @generated
     */
    EReference getXMethod_Parameters();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XMethod#getExceptions <em>Exceptions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exceptions</em>'.
     * @see chrome.xmdl.XMethod#getExceptions()
     * @see #getXMethod()
     * @generated
     */
    EReference getXMethod_Exceptions();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XParameter <em>XParameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XParameter</em>'.
     * @see chrome.xmdl.XParameter
     * @generated
     */
    EClass getXParameter();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XParameter#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Method</em>'.
     * @see chrome.xmdl.XParameter#getMethod()
     * @see #getXParameter()
     * @generated
     */
    EReference getXParameter_Method();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XParameter#getName()
     * @see #getXParameter()
     * @generated
     */
    EAttribute getXParameter_Name();

    /**
     * Returns the meta object for the reference '{@link chrome.xmdl.XParameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see chrome.xmdl.XParameter#getType()
     * @see #getXParameter()
     * @generated
     */
    EReference getXParameter_Type();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XException <em>XException</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XException</em>'.
     * @see chrome.xmdl.XException
     * @generated
     */
    EClass getXException();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XException#getJavaClass <em>Java Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Java Class</em>'.
     * @see chrome.xmdl.XException#getJavaClass()
     * @see #getXException()
     * @generated
     */
    EAttribute getXException_JavaClass();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XType <em>XType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XType</em>'.
     * @see chrome.xmdl.XType
     * @generated
     */
    EClass getXType();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XType#getName()
     * @see #getXType()
     * @generated
     */
    EAttribute getXType_Name();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XType#getClassName <em>Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class Name</em>'.
     * @see chrome.xmdl.XType#getClassName()
     * @see #getXType()
     * @generated
     */
    EAttribute getXType_ClassName();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XModel <em>XModel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XModel</em>'.
     * @see chrome.xmdl.XModel
     * @generated
     */
    EClass getXModel();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XVisitor <em>XVisitor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XVisitor</em>'.
     * @see chrome.xmdl.XVisitor
     * @generated
     */
    EClass getXVisitor();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XVisitorBase <em>XVisitor Base</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XVisitor Base</em>'.
     * @see chrome.xmdl.XVisitorBase
     * @generated
     */
    EClass getXVisitorBase();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XEnumeration <em>XEnumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XEnumeration</em>'.
     * @see chrome.xmdl.XEnumeration
     * @generated
     */
    EClass getXEnumeration();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XEnumeration#getXPackage <em>XPackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>XPackage</em>'.
     * @see chrome.xmdl.XEnumeration#getXPackage()
     * @see #getXEnumeration()
     * @generated
     */
    EReference getXEnumeration_XPackage();

    /**
     * Returns the meta object for the containment reference list '{@link chrome.xmdl.XEnumeration#getLiterals <em>Literals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literals</em>'.
     * @see chrome.xmdl.XEnumeration#getLiterals()
     * @see #getXEnumeration()
     * @generated
     */
    EReference getXEnumeration_Literals();

    /**
     * Returns the meta object for the reference '{@link chrome.xmdl.XEnumeration#getDefaultLiteral <em>Default Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Default Literal</em>'.
     * @see chrome.xmdl.XEnumeration#getDefaultLiteral()
     * @see #getXEnumeration()
     * @generated
     */
    EReference getXEnumeration_DefaultLiteral();

    /**
     * Returns the meta object for class '{@link chrome.xmdl.XEnumerationLiteral <em>XEnumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XEnumeration Literal</em>'.
     * @see chrome.xmdl.XEnumerationLiteral
     * @generated
     */
    EClass getXEnumerationLiteral();

    /**
     * Returns the meta object for the container reference '{@link chrome.xmdl.XEnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Enumeration</em>'.
     * @see chrome.xmdl.XEnumerationLiteral#getEnumeration()
     * @see #getXEnumerationLiteral()
     * @generated
     */
    EReference getXEnumerationLiteral_Enumeration();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XEnumerationLiteral#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see chrome.xmdl.XEnumerationLiteral#getName()
     * @see #getXEnumerationLiteral()
     * @generated
     */
    EAttribute getXEnumerationLiteral_Name();

    /**
     * Returns the meta object for the attribute '{@link chrome.xmdl.XEnumerationLiteral#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see chrome.xmdl.XEnumerationLiteral#getValue()
     * @see #getXEnumerationLiteral()
     * @generated
     */
    EAttribute getXEnumerationLiteral_Value();

    /**
     * Returns the meta object for enum '{@link chrome.xmdl.XAssociationType <em>XAssociation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>XAssociation Type</em>'.
     * @see chrome.xmdl.XAssociationType
     * @generated
     */
    EEnum getXAssociationType();

    /**
     * Returns the meta object for enum '{@link chrome.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>XAssociation Behaviour</em>'.
     * @see chrome.xmdl.XAssociationBehaviour
     * @generated
     */
    EEnum getXAssociationBehaviour();

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
         * The meta object literal for the '{@link chrome.xmdl.impl.XProjectImpl <em>XProject</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XProjectImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXProject()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XPackageImpl <em>XPackage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XPackageImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXPackage()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XClassImpl <em>XClass</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XClassImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXClass()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XEnumerationImpl <em>XEnumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XEnumerationImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXEnumeration()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XEnumerationLiteralImpl <em>XEnumeration Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XEnumerationLiteralImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXEnumerationLiteral()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XAttributeImpl <em>XAttribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XAttributeImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXAttribute()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XMethodImpl <em>XMethod</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XMethodImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXMethod()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XParameterImpl <em>XParameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XParameterImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXParameter()
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
         * The meta object literal for the '{@link chrome.xmdl.XBase <em>XBase</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XBase
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXBase()
         * @generated
         */
        EClass XBASE = eINSTANCE.getXBase();

        /**
         * The meta object literal for the '{@link chrome.xmdl.XType <em>XType</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XType
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXType()
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
         * The meta object literal for the '{@link chrome.xmdl.impl.XExceptionImpl <em>XException</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XExceptionImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXException()
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
         * The meta object literal for the '{@link chrome.xmdl.XModel <em>XModel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XModel
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXModel()
         * @generated
         */
        EClass XMODEL = eINSTANCE.getXModel();

        /**
         * The meta object literal for the '{@link chrome.xmdl.XVisitor <em>XVisitor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XVisitor
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXVisitor()
         * @generated
         */
        EClass XVISITOR = eINSTANCE.getXVisitor();

        /**
         * The meta object literal for the '{@link chrome.xmdl.impl.XVisitorBaseImpl <em>XVisitor Base</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.impl.XVisitorBaseImpl
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXVisitorBase()
         * @generated
         */
        EClass XVISITOR_BASE = eINSTANCE.getXVisitorBase();

        /**
         * The meta object literal for the '{@link chrome.xmdl.XAssociationType <em>XAssociation Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XAssociationType
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXAssociationType()
         * @generated
         */
        EEnum XASSOCIATION_TYPE = eINSTANCE.getXAssociationType();

        /**
         * The meta object literal for the '{@link chrome.xmdl.XAssociationBehaviour <em>XAssociation Behaviour</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see chrome.xmdl.XAssociationBehaviour
         * @see chrome.xmdl.impl.XmdlPackageImpl#getXAssociationBehaviour()
         * @generated
         */
        EEnum XASSOCIATION_BEHAVIOUR = eINSTANCE.getXAssociationBehaviour();

        /**
         * The meta object literal for the '<em>IPath</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.core.runtime.IPath
         * @see chrome.xmdl.impl.XmdlPackageImpl#getIPath()
         * @generated
         */
        EDataType IPATH = eINSTANCE.getIPath();

        /**
         * The meta object literal for the '<em>URI</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.common.util.URI
         * @see chrome.xmdl.impl.XmdlPackageImpl#getURI()
         * @generated
         */
        EDataType URI = eINSTANCE.getURI();

        /**
         * The meta object literal for the '<em>Resource</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.resource.Resource
         * @see chrome.xmdl.impl.XmdlPackageImpl#getResource()
         * @generated
         */
        EDataType RESOURCE = eINSTANCE.getResource();

        /**
         * The meta object literal for the '<em>Comparable</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Comparable
         * @see chrome.xmdl.impl.XmdlPackageImpl#getComparable()
         * @generated
         */
        EDataType COMPARABLE = eINSTANCE.getComparable();

    }

} //XmdlPackage
