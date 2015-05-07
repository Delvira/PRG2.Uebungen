/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen07;

import static java.lang.Math.PI;

/**
 *
 * @author Caro
 */
public class Sphere implements Shape {


    private int number;
    private int diameter;
    
    
    public Sphere(int no, int diameter) {
        number = no;
        this.diameter = diameter;
    }
 
    
    @Override
    public int getVolume() {
        return ((int) (PI/6*diameter*diameter*diameter));
    }

    
    @Override
    public int getSurface() {
        return ((int) PI*diameter*diameter);
    }

    
    @Override
    public int getMaxDimension() {
        return diameter;
    }

    
    @Override
    public int compareTo(Object c) {
        return this.getVolume()-((Shape)c).getVolume();
    }

    @Override
    public int surfaceCompareTo(Object c) {
        return this.getSurface()-((Shape)c).getSurface();
    }

    
    @Override
    public int maxDimensionCompareTo(Object c) {
        return this.getMaxDimension()-((Shape)c).getMaxDimension();
    }

    
    @Override
    public String toString() {
        String text = "--------------------" + System.lineSeparator();
        text += "SPHERE: " + number + System.lineSeparator();
        text += "Diameter: " + diameter + System.lineSeparator();
        text += "Volume: " + getVolume() + System.lineSeparator();
        text += "Surface: " + getSurface() + System.lineSeparator();
        return text;
    }

    
    @Override
    public boolean equals(Object other) {
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
        Sphere two = (Sphere) other;
        if (this.diameter != two.diameter) {
            return false;
        }
        else {
            return true;
        }
    }

    
    @Override
    public int hashCode() {
        return getVolume()+getSurface();
    }
    

    
    
}
