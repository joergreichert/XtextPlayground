/**
 */
package org.eclipse.xtext.classdef.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.classdef.ClassdefPackage;
import org.eclipse.xtext.classdef.DummyJavaClass;
import org.eclipse.xtext.classdef.DummyJavaClassMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Java Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DummyJavaClassImpl extends MinimalEObjectImpl.Container implements DummyJavaClass
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<DummyJavaClassMethod> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DummyJavaClassImpl()
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
    return ClassdefPackage.Literals.DUMMY_JAVA_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassdefPackage.DUMMY_JAVA_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassdefPackage.DUMMY_JAVA_CLASS__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DummyJavaClassMethod> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<DummyJavaClassMethod>(DummyJavaClassMethod.class, this, ClassdefPackage.DUMMY_JAVA_CLASS__METHODS);
    }
    return methods;
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
      case ClassdefPackage.DUMMY_JAVA_CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case ClassdefPackage.DUMMY_JAVA_CLASS__NAME:
        return getName();
      case ClassdefPackage.DUMMY_JAVA_CLASS__DESCRIPTION:
        return getDescription();
      case ClassdefPackage.DUMMY_JAVA_CLASS__METHODS:
        return getMethods();
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
      case ClassdefPackage.DUMMY_JAVA_CLASS__NAME:
        setName((String)newValue);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends DummyJavaClassMethod>)newValue);
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
      case ClassdefPackage.DUMMY_JAVA_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS__METHODS:
        getMethods().clear();
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
      case ClassdefPackage.DUMMY_JAVA_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ClassdefPackage.DUMMY_JAVA_CLASS__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ClassdefPackage.DUMMY_JAVA_CLASS__METHODS:
        return methods != null && !methods.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //DummyJavaClassImpl
