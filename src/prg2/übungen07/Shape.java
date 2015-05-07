/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen07;

/**
 *
 * @author Caro
 */
public interface Shape extends Comparable {
    
    int getVolume ();
    
    int getSurface ();
    
    int getMaxDimension ();
    
    String toString ();
    
    boolean equals (Object other);
    
    int hashCode ();
    
    int compareTo (Object c);
    
    int surfaceCompareTo (Object c);
    
    int maxDimensionCompareTo (Object c);
}
