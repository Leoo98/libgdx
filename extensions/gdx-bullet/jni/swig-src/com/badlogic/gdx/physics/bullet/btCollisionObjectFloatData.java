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

public class btCollisionObjectFloatData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btCollisionObjectFloatData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btCollisionObjectFloatData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btCollisionObjectFloatData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_broadphaseHandle(SWIGTYPE_p_void value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_broadphaseHandle_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getM_broadphaseHandle() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_broadphaseHandle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setM_collisionShape(SWIGTYPE_p_void value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_collisionShape_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getM_collisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_collisionShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setM_rootCollisionShape(btCollisionShapeData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_rootCollisionShape_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getM_rootCollisionShape() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_rootCollisionShape_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setM_name(String value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_name_set(swigCPtr, this, value);
  }

  public String getM_name() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_name_get(swigCPtr, this);
  }

  public void setM_worldTransform(btTransformFloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_worldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getM_worldTransform() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_worldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setM_interpolationWorldTransform(btTransformFloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_interpolationWorldTransform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getM_interpolationWorldTransform() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_interpolationWorldTransform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setM_interpolationLinearVelocity(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_interpolationLinearVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_interpolationLinearVelocity() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_interpolationLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_interpolationAngularVelocity(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_interpolationAngularVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_interpolationAngularVelocity() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_interpolationAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_anisotropicFriction(btVector3FloatData value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_anisotropicFriction_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_anisotropicFriction() {
    long cPtr = gdxBulletJNI.btCollisionObjectFloatData_m_anisotropicFriction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_contactProcessingThreshold(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_contactProcessingThreshold_set(swigCPtr, this, value);
  }

  public float getM_contactProcessingThreshold() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_contactProcessingThreshold_get(swigCPtr, this);
  }

  public void setM_deactivationTime(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_deactivationTime_set(swigCPtr, this, value);
  }

  public float getM_deactivationTime() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_deactivationTime_get(swigCPtr, this);
  }

  public void setM_friction(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_friction_set(swigCPtr, this, value);
  }

  public float getM_friction() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_friction_get(swigCPtr, this);
  }

  public void setM_restitution(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_restitution_set(swigCPtr, this, value);
  }

  public float getM_restitution() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_restitution_get(swigCPtr, this);
  }

  public void setM_hitFraction(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_hitFraction_set(swigCPtr, this, value);
  }

  public float getM_hitFraction() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_hitFraction_get(swigCPtr, this);
  }

  public void setM_ccdSweptSphereRadius(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_ccdSweptSphereRadius_set(swigCPtr, this, value);
  }

  public float getM_ccdSweptSphereRadius() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_ccdSweptSphereRadius_get(swigCPtr, this);
  }

  public void setM_ccdMotionThreshold(float value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_ccdMotionThreshold_set(swigCPtr, this, value);
  }

  public float getM_ccdMotionThreshold() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_ccdMotionThreshold_get(swigCPtr, this);
  }

  public void setM_hasAnisotropicFriction(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_hasAnisotropicFriction_set(swigCPtr, this, value);
  }

  public int getM_hasAnisotropicFriction() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_hasAnisotropicFriction_get(swigCPtr, this);
  }

  public void setM_collisionFlags(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_collisionFlags_set(swigCPtr, this, value);
  }

  public int getM_collisionFlags() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_collisionFlags_get(swigCPtr, this);
  }

  public void setM_islandTag1(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_islandTag1_set(swigCPtr, this, value);
  }

  public int getM_islandTag1() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_islandTag1_get(swigCPtr, this);
  }

  public void setM_companionId(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_companionId_set(swigCPtr, this, value);
  }

  public int getM_companionId() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_companionId_get(swigCPtr, this);
  }

  public void setM_activationState1(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_activationState1_set(swigCPtr, this, value);
  }

  public int getM_activationState1() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_activationState1_get(swigCPtr, this);
  }

  public void setM_internalType(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_internalType_set(swigCPtr, this, value);
  }

  public int getM_internalType() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_internalType_get(swigCPtr, this);
  }

  public void setM_checkCollideWith(int value) {
    gdxBulletJNI.btCollisionObjectFloatData_m_checkCollideWith_set(swigCPtr, this, value);
  }

  public int getM_checkCollideWith() {
    return gdxBulletJNI.btCollisionObjectFloatData_m_checkCollideWith_get(swigCPtr, this);
  }

  public btCollisionObjectFloatData() {
    this(gdxBulletJNI.new_btCollisionObjectFloatData(), true);
  }

}
