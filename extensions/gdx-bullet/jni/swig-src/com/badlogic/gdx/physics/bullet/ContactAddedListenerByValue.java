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

public class ContactAddedListenerByValue {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ContactAddedListenerByValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactAddedListenerByValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_ContactAddedListenerByValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    gdxBulletJNI.ContactAddedListenerByValue_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    gdxBulletJNI.ContactAddedListenerByValue_change_ownership(this, swigCPtr, true);
  }

  public boolean onContactAdded(btManifoldPoint cp, int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1) {
    return gdxBulletJNI.ContactAddedListenerByValue_onContactAdded(swigCPtr, this, cp, userValue0, partId0, index0, match0, userValue1, partId1, index1, match1);
  }

  public ContactAddedListenerByValue() {
    this(gdxBulletJNI.new_ContactAddedListenerByValue(), true);
    gdxBulletJNI.ContactAddedListenerByValue_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
