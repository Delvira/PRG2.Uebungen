/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen07;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caro
 */
public class SolidFileIOTest {
    
    
    /**
     * Test of readSolids method, of class SolidFileIO.
     */
    @Test
    public void testReadSolids() throws Exception {
        String fileName = "C:\\Users\\Caro\\Documents\\HSLU\\PRG2\\NetBeans\\PRG2.Übungen\\test\\prg2\\übungen07\\testfile.txt";
        Shape[] expResult = {new Cube (0, 1, 2, 3), new Cube (1, 10, 20 ,30), new Cube (2, 5, 8, 2)};
        Shape[] result = SolidFileIO.readSolids(fileName);
    }
    
}
