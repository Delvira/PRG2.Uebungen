/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen07;

import java.util.Comparator;

/**
 *
 * @author Caro
 */
public class MyComparator implements Comparator {
    
    /**
     *  1   Sortieren nach Surface
     *  2   Sortieren nach Dimensionen
     */
    private int version;
    
    
    public MyComparator (int sortVersion) {
        version = sortVersion;
    }
    
    public int compare(Object a, Object b) {
        if (version == 1) {
            return (((Shape)a).surfaceCompareTo(b));
        }
        else if (version == 2) {
          return (((Shape)a).maxDimensionCompareTo(b));  
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
