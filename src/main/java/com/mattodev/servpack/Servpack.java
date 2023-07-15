/**
 * Servpack.java
 * The main file of the program.
 *
 * Last updated:
 *   Matto's Servpack v1.0
 *   version branch: alpha1
 *   build: 2307/1
 */

package com.mattodev.servpack;

import java.util.*;

public class Servpack {
    static Boolean devMode = false;
    
    public static HashMap<String, SPTuple<Boolean, String>> enabledProps = new HashMap<>();
    public static SPTuple<Boolean, String> getProp(String propName) {
        return enabledProps.getOrDefault(propName, SPTuple.defaultProp());
    }
    
    public static void main(String[] args) {
        List<String> argsL = Arrays.asList(args);
        List<String> argsL_lc = List.of();
        argsL.forEach(item -> argsL_lc.add(item));
        
        if (argsL.contains("-dev") || devMode) {
            SPTuple<Boolean, String> t = SPTuple.defaultProp();
            t.item1 = Boolean.TRUE;
            enabledProps.put("dev", t);
        }
        
        System.out.println("Servpack v1.0" + (getProp("dev").item1 ? " [DEV MODE]" : ""));
        System.out.println("[warn] Servpack is in Alpha mode.");
    }
}
