/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSolverConstraint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSolverConstraint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSolverConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSolverConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_relpos1CrossNormal(btVector3 value) {
    gdxBulletJNI.btSolverConstraint_m_relpos1CrossNormal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_relpos1CrossNormal() {
    long cPtr = gdxBulletJNI.btSolverConstraint_m_relpos1CrossNormal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_contactNormal(btVector3 value) {
    gdxBulletJNI.btSolverConstraint_m_contactNormal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_contactNormal() {
    long cPtr = gdxBulletJNI.btSolverConstraint_m_contactNormal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_relpos2CrossNormal(btVector3 value) {
    gdxBulletJNI.btSolverConstraint_m_relpos2CrossNormal_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_relpos2CrossNormal() {
    long cPtr = gdxBulletJNI.btSolverConstraint_m_relpos2CrossNormal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_angularComponentA(btVector3 value) {
    gdxBulletJNI.btSolverConstraint_m_angularComponentA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_angularComponentA() {
    long cPtr = gdxBulletJNI.btSolverConstraint_m_angularComponentA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_angularComponentB(btVector3 value) {
    gdxBulletJNI.btSolverConstraint_m_angularComponentB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_angularComponentB() {
    long cPtr = gdxBulletJNI.btSolverConstraint_m_angularComponentB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_appliedPushImpulse(float value) {
    gdxBulletJNI.btSolverConstraint_m_appliedPushImpulse_set(swigCPtr, this, value);
  }

  public float getM_appliedPushImpulse() {
    return gdxBulletJNI.btSolverConstraint_m_appliedPushImpulse_get(swigCPtr, this);
  }

  public void setM_appliedImpulse(float value) {
    gdxBulletJNI.btSolverConstraint_m_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getM_appliedImpulse() {
    return gdxBulletJNI.btSolverConstraint_m_appliedImpulse_get(swigCPtr, this);
  }

  public void setM_friction(float value) {
    gdxBulletJNI.btSolverConstraint_m_friction_set(swigCPtr, this, value);
  }

  public float getM_friction() {
    return gdxBulletJNI.btSolverConstraint_m_friction_get(swigCPtr, this);
  }

  public void setM_jacDiagABInv(float value) {
    gdxBulletJNI.btSolverConstraint_m_jacDiagABInv_set(swigCPtr, this, value);
  }

  public float getM_jacDiagABInv() {
    return gdxBulletJNI.btSolverConstraint_m_jacDiagABInv_get(swigCPtr, this);
  }

  public void setM_overrideNumSolverIterations(int value) {
    gdxBulletJNI.btSolverConstraint_m_overrideNumSolverIterations_set(swigCPtr, this, value);
  }

  public int getM_overrideNumSolverIterations() {
    return gdxBulletJNI.btSolverConstraint_m_overrideNumSolverIterations_get(swigCPtr, this);
  }

  public void setM_rhs(float value) {
    gdxBulletJNI.btSolverConstraint_m_rhs_set(swigCPtr, this, value);
  }

  public float getM_rhs() {
    return gdxBulletJNI.btSolverConstraint_m_rhs_get(swigCPtr, this);
  }

  public void setM_cfm(float value) {
    gdxBulletJNI.btSolverConstraint_m_cfm_set(swigCPtr, this, value);
  }

  public float getM_cfm() {
    return gdxBulletJNI.btSolverConstraint_m_cfm_get(swigCPtr, this);
  }

  public void setM_lowerLimit(float value) {
    gdxBulletJNI.btSolverConstraint_m_lowerLimit_set(swigCPtr, this, value);
  }

  public float getM_lowerLimit() {
    return gdxBulletJNI.btSolverConstraint_m_lowerLimit_get(swigCPtr, this);
  }

  public void setM_upperLimit(float value) {
    gdxBulletJNI.btSolverConstraint_m_upperLimit_set(swigCPtr, this, value);
  }

  public float getM_upperLimit() {
    return gdxBulletJNI.btSolverConstraint_m_upperLimit_get(swigCPtr, this);
  }

  public void setM_rhsPenetration(float value) {
    gdxBulletJNI.btSolverConstraint_m_rhsPenetration_set(swigCPtr, this, value);
  }

  public float getM_rhsPenetration() {
    return gdxBulletJNI.btSolverConstraint_m_rhsPenetration_get(swigCPtr, this);
  }

  public btSolverConstraint() {
    this(gdxBulletJNI.new_btSolverConstraint(), true);
  }

  public final static class btSolverConstraintType {
    public final static int BT_SOLVER_CONTACT_1D = 0;
    public final static int BT_SOLVER_FRICTION_1D = BT_SOLVER_CONTACT_1D + 1;
  }

}
