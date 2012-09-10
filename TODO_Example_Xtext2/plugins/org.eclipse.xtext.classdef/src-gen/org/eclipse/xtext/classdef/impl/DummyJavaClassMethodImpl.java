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
import org.eclipse.xtext.classdef.DummyJavaClassMethod;
import org.eclipse.xtext.classdef.DummyJavaClassMethodParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy Java Class Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.xtext.classdef.impl.DummyJavaClassMethodImpl#getOuput <em>Ouput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DummyJavaClassMethodImpl extends MinimalEObjectImpl.Container implements DummyJavaClassMethod
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
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected EList<DummyJavaClassMethodParameter> input;

  /**
   * The cached value of the '{@link #getOuput() <em>Ouput</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOuput()
   * @generated
   * @ordered
   */
  protected EList<DummyJavaClassMethodParameter> ouput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DummyJavaClassMethodImpl()
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
    return ClassdefPackage.Literals.DUMMY_JAVA_CLASS_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DummyJavaClassMethodParameter> getInput()
  {
    if (input == null)
    {
      input = new EObjectContainmentEList<DummyJavaClassMethodParameter>(DummyJavaClassMethodParameter.class, this, ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT);
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DummyJavaClassMethodParameter> getOuput()
  {
    if (ouput == null)
    {
      ouput = new EObjectContainmentEList<DummyJavaClassMethodParameter>(DummyJavaClassMethodParameter.class, this, ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT);
    }
    return ouput;
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
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT:
        return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT:
        return ((InternalEList<?>)getOuput()).basicRemove(otherEnd, msgs);
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
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__NAME:
        return getName();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__DESCRIPTION:
        return getDescription();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT:
        return getInput();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT:
        return getOuput();
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
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__NAME:
        setName((String)newValue);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT:
        getInput().clear();
        getInput().addAll((Collection<? extends DummyJavaClassMethodParameter>)newValue);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT:
        getOuput().clear();
        getOuput().addAll((Collection<? extends DummyJavaClassMethodParameter>)newValue);
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
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT:
        getInput().clear();
        return;
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT:
        getOuput().clear();
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
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__INPUT:
        return input != null && !input.isEmpty();
      case ClassdefPackage.DUMMY_JAVA_CLASS_METHOD__OUPUT:
        return ouput != null && !ouput.isEmpty();
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

} //DummyJavaClassMethodImpl
