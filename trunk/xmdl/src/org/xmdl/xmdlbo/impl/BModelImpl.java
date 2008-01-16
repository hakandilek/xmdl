/**
 * <copyright>
 * </copyright>
 *
 * $Id: BModelImpl.java,v 1.3 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlbo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdlbo.BModel;
import org.xmdl.xmdlbo.BPackage;
import org.xmdl.xmdlbo.XmdlboPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdlbo.impl.BModelImpl#getXProject <em>XProject</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BModelImpl#getXModel <em>XModel</em>}</li>
 *   <li>{@link org.xmdl.xmdlbo.impl.BModelImpl#getBPackages <em>BPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BModelImpl extends EObjectImpl implements BModel {
	/**
	 * The cached value of the '{@link #getXProject() <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXProject()
	 * @generated
	 * @ordered
	 */
	protected XProject xProject;

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
	 * The default value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected static final String XMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected String xModel = XMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBPackages() <em>BPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<BPackage> bPackages;

	public BModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlboPackage.Literals.BMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getXProject() {
		if (xProject != null && xProject.eIsProxy()) {
			InternalEObject oldXProject = (InternalEObject)xProject;
			xProject = (XProject)eResolveProxy(oldXProject);
			if (xProject != oldXProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlboPackage.BMODEL__XPROJECT, oldXProject, xProject));
			}
		}
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject basicGetXProject() {
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXProject(XProject newXProject) {
		XProject oldXProject = xProject;
		xProject = newXProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BMODEL__XPROJECT, oldXProject, xProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXModel() {
		return xModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXModel(String newXModel) {
		String oldXModel = xModel;
		xModel = newXModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlboPackage.BMODEL__XMODEL, oldXModel, xModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPackage> getBPackages() {
		if (bPackages == null) {
			bPackages = new EObjectContainmentWithInverseEList<BPackage>(BPackage.class, this, XmdlboPackage.BMODEL__BPACKAGES, XmdlboPackage.BPACKAGE__MODEL);
		}
		return bPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__BPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBPackages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__BPACKAGES:
				return ((InternalEList<?>)getBPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__XPROJECT:
				if (resolve) return getXProject();
				return basicGetXProject();
			case XmdlboPackage.BMODEL__NAME:
				return getName();
			case XmdlboPackage.BMODEL__XMODEL:
				return getXModel();
			case XmdlboPackage.BMODEL__BPACKAGES:
				return getBPackages();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__XPROJECT:
				setXProject((XProject)newValue);
				return;
			case XmdlboPackage.BMODEL__NAME:
				setName((String)newValue);
				return;
			case XmdlboPackage.BMODEL__XMODEL:
				setXModel((String)newValue);
				return;
			case XmdlboPackage.BMODEL__BPACKAGES:
				getBPackages().clear();
				getBPackages().addAll((Collection<? extends BPackage>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__XPROJECT:
				setXProject((XProject)null);
				return;
			case XmdlboPackage.BMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlboPackage.BMODEL__XMODEL:
				setXModel(XMODEL_EDEFAULT);
				return;
			case XmdlboPackage.BMODEL__BPACKAGES:
				getBPackages().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmdlboPackage.BMODEL__XPROJECT:
				return xProject != null;
			case XmdlboPackage.BMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlboPackage.BMODEL__XMODEL:
				return XMODEL_EDEFAULT == null ? xModel != null : !XMODEL_EDEFAULT.equals(xModel);
			case XmdlboPackage.BMODEL__BPACKAGES:
				return bPackages != null && !bPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", xModel: ");
		result.append(xModel);
		result.append(')');
		return result.toString();
	}

} //BModelImpl
