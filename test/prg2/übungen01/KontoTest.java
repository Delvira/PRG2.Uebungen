/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen01;

import prg2.übungen01.Konto;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caroline
 */
public class KontoTest {
    
    @Test
    public void testDefaultKonto() {
        Konto testKonto = new Konto();
        
        assertEquals(1,testKonto.getNo());
        assertEquals(0,testKonto.getRate(),0.001);
        assertEquals(0,testKonto.getSaldo(),0.001);
    }
    
    public void testKonto() {
        Konto testKonto = new Konto(4.5,1.25);
        
        assertEquals(2,testKonto.getNo());
        assertEquals(1.25,testKonto.getRate(),0.001);
        assertEquals(4.5,testKonto.getSaldo(),0.001);
    }
    
    public void testPayInOut() {
        Konto testKonto = new Konto(4.5,1.25);
        testKonto.payIn(2.2);
        assertEquals(6.7,testKonto.getSaldo(),0.001);
        
        testKonto.payOut(1.5);
        assertEquals(5.2,testKonto.getSaldo(),0.001);
    }
    
}
