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
public class Cube implements Shape {
    
    int number; //Nummer des Cubes
    int s1;     //Seiten des Cubes
    int s2;
    int s3;
    
    
    public Cube (int no, int a, int b, int c) {
        number = no;
        s1 = a;
        s2 = b;
        s3 = c;
    }
    
    
    public int getVolume () {
        return s1*s2*s3;
    }
    
    
    public int getSurface () {
        return 2*s1*s2+2*s2*s3+2*s3*s1;
    }
    
    
    public int getMaxDimension () {
        if ((s1>s2)&&(s1>s3)) {
            return s1;
        }
        else if (s2>s3) {
            return s2;
        }
        else {
            return s3;
        }
    }
    
    
    public String toString () {
        String text = "--------------------" + System.lineSeparator();
        text += "CUBE " + number + System.lineSeparator();
        text += "Sides: " + s1 + " " + s2 + " " + s3 + System.lineSeparator();
        text += "Volume: " + getVolume() + System.lineSeparator();
        text += "Surface: " + getSurface() + System.lineSeparator();
        return text;
    }
    
    
    @Override
    public boolean equals (Object other) {
        // 1. Vergleich auf sich selber
        if (this == other) {
            return true;
        }
        // 2. Vergleich auf NULL
        if (other == null) {
            return false;
        }
        // 3. Vergleich auf Typ
        if (other.getClass() != this.getClass()) {
        return false;
        }
        // 4. Vergleich der Attribute
        Cube two = (Cube) other;
        if (this.s1 != two.s1) {
            return false;
        } 
        else if (this.s2 != two.s2) {
            return false;
        } 
        else if (this.s3 != two.s3) {
            return false;
        }
        else {
            return true;
        }
    }
    
    
    @Override
    public int hashCode () {
        return getVolume()+getSurface();
    }
    
    
    @Override
    public int compareTo (Object c) {
        return this.getVolume()-((Shape)c).getVolume();
    }
    
    public int surfaceCompareTo (Object c) {
        return this.getSurface()-((Shape)c).getSurface();
    }
    
    public int maxDimensionCompareTo (Object c) {
        return this.getMaxDimension()-((Shape)c).getMaxDimension();
    }
}
