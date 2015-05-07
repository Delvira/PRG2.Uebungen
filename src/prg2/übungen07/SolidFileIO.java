/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Caro
 */
public class SolidFileIO {
    
    
    public static Shape[] readSolids (String fileName) throws FileNotFoundException, IOException{
        StringBuilder text = new StringBuilder();
        String line;
        
        try (FileReader reader = new FileReader(fileName)) {
            BufferedReader buffReader = new BufferedReader(reader);
            while ((line = buffReader.readLine()) != null) {
                text.append(line);
                text.append(";");
            }
        }
        catch (FileNotFoundException ex) {
            throw ex;
        }
        catch (IOException ex) {
            throw ex;
        }
        String[] lines = text.toString().split(";");
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            try{
                String[] argument = lines[i].split(" ");
                if (argument[0].equals("C:")) {
                    shapes.add(new Cube (i, Integer.parseInt(argument[1]), Integer.parseInt(argument[2]), Integer.parseInt(argument[3])));
                }
                else if (argument[0].equals("S:")) {
                    shapes.add(new Sphere(i, Integer.parseInt(argument[1])));
                }
                else if (argument[0].equals("Y:")) {
                    shapes.add(new Cylinder(i, Integer.parseInt(argument[1]), Integer.parseInt(argument[2])));
                }
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        return shapes.toArray(new Shape[shapes.size()]);
    }
    
}



