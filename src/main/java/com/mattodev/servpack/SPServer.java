/**
 * SPServer.java
 * The Servpack server class.
 *
 * Last updated:
 *   Matto's Servpack v1.0
 *   version branch: alpha1
 *   build: 2307/1
 */

package com.mattodev.servpack;

import java.io.IOException;
import java.nio.file.*;

public class SPServer {
    /**
     * Loads a Servpack server file from a filename.
     * @param filename The filename.
     * @return The server, or null if the load failed.
     */
    public static SPServer load(String filename) throws IOException {
        byte[] serverData = Files.readAllBytes(Paths.get(filename));
        
        return null;
    }
}
