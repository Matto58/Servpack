/**
 * SPTuple.java
 * A tuple class for Servpack.
 *
 * Last updated:
 *   Matto's Servpack v1.0
 *   version branch: alpha1
 *   build: 2307/1
 */


package com.mattodev.servpack;

public class SPTuple<T1, T2> {    
    public T1 item1 = null;
    public T2 item2 = null;
    
    public static SPTuple<Boolean, String> defaultProp() {
        SPTuple<Boolean, String> t = new SPTuple<>();
        t.item1 = Boolean.FALSE;
        t.item2 = null;
        return t;
    }
    
    public void make(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }
}
