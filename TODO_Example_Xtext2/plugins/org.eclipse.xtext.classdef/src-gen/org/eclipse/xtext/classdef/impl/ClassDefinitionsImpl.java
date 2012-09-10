/**
 */
package org.eclipse.xtext.classdef.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.classdef.ClassDefinitions;
import org.eclipse.xtext.classdef.ClassdefPackage;
import org.eclipse.xtext.classdef.DummyJavaClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.classdef.impl.ClassDefinitionsImpl#getDefinedClasses <em>Defined Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefinitionsImpl extends MinimalEObjectImpl.Container implements ClassDefinitions
{
  /**
   * The cached value of the '{@link #getDefinedClasses() <em>Defined Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinedClasses()
   * @generated
   * @ordered
   */
  protected EList<DummyJavaClass> definedClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDefinitionsImpl()
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
    return ClassdefPackage.Literals.CLASS_DEFINITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DummyJavaClass> getDefinedClasses()
  {
    if (definedClasses == null)
    {
      definedClasses = new EObjectContainmentEList<DummyJavaClass>(DummyJavaClass.class, this, ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES);
    }
    return definedClasses;
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
      case ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES:
        return ((InternalEList<?>)getDefinedClasses()).basicRemove(otherEnd, msgs);
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
      case ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES:
        return getDefinedClasses();
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
      case ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES:
        getDefinedClasses().clear();
        getDefinedClasses().addAll((Collection<? extends DummyJavaClass>)newValue);
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
      case ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES:
        getDefinedClasses().clear();
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
      case ClassdefPackage.CLASS_DEFINITIONS__DEFINED_CLASSES:
        return definedClasses != null && !definedClasses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassDefinitionsImpl
