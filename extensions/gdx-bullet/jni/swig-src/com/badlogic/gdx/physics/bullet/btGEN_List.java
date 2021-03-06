/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

public class btGEN_List {
	private long swigCPtr;
	protected boolean swigCMemOwn;

	protected btGEN_List (long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	public static long getCPtr (btGEN_List obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize () {
		delete();
	}

	public synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btGEN_List(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public btGEN_List () {
		this(gdxBulletJNI.new_btGEN_List(), true);
	}

	public btGEN_Link getHead () {
		long cPtr = gdxBulletJNI.btGEN_List_getHead(swigCPtr, this);
		return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
	}

	public btGEN_Link getTail () {
		long cPtr = gdxBulletJNI.btGEN_List_getTail(swigCPtr, this);
		return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
	}

	public void addHead (btGEN_Link link) {
		gdxBulletJNI.btGEN_List_addHead(swigCPtr, this, btGEN_Link.getCPtr(link), link);
	}

	public void addTail (btGEN_Link link) {
		gdxBulletJNI.btGEN_List_addTail(swigCPtr, this, btGEN_Link.getCPtr(link), link);
	}

}
