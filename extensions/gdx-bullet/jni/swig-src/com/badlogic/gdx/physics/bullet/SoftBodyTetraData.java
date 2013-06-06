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

public class SoftBodyTetraData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SoftBodyTetraData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SoftBodyTetraData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_SoftBodyTetraData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_c0(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyTetraData_m_c0_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_c0() {
    long cPtr = gdxBulletJNI.SoftBodyTetraData_m_c0_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_material(SoftBodyMaterialData value) {
    gdxBulletJNI.SoftBodyTetraData_m_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
  }

  public SoftBodyMaterialData getM_material() {
    long cPtr = gdxBulletJNI.SoftBodyTetraData_m_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
  }

  public void setM_nodeIndices(int[] value) {
    gdxBulletJNI.SoftBodyTetraData_m_nodeIndices_set(swigCPtr, this, value);
  }

  public int[] getM_nodeIndices() {
    return gdxBulletJNI.SoftBodyTetraData_m_nodeIndices_get(swigCPtr, this);
  }

  public void setM_restVolume(float value) {
    gdxBulletJNI.SoftBodyTetraData_m_restVolume_set(swigCPtr, this, value);
  }

  public float getM_restVolume() {
    return gdxBulletJNI.SoftBodyTetraData_m_restVolume_get(swigCPtr, this);
  }

  public void setM_c1(float value) {
    gdxBulletJNI.SoftBodyTetraData_m_c1_set(swigCPtr, this, value);
  }

  public float getM_c1() {
    return gdxBulletJNI.SoftBodyTetraData_m_c1_get(swigCPtr, this);
  }

  public void setM_c2(float value) {
    gdxBulletJNI.SoftBodyTetraData_m_c2_set(swigCPtr, this, value);
  }

  public float getM_c2() {
    return gdxBulletJNI.SoftBodyTetraData_m_c2_get(swigCPtr, this);
  }

  public void setM_pad(int value) {
    gdxBulletJNI.SoftBodyTetraData_m_pad_set(swigCPtr, this, value);
  }

  public int getM_pad() {
    return gdxBulletJNI.SoftBodyTetraData_m_pad_get(swigCPtr, this);
  }

  public SoftBodyTetraData() {
    this(gdxBulletJNI.new_SoftBodyTetraData(), true);
  }

}
