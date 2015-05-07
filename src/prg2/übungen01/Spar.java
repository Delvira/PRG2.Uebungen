/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen01;

/**
 *
 * @author Caroline
 */
public class Spar extends Konto {
    
    private double maxout;
    
    public Spar (double saldo, double rate, double maxout) {
        super(saldo, rate);
        this.maxout = maxout;
    }
    
    public double getSaldo() {
        return super.getSaldo();
    }
    
    public void payOut(double amount) {
        if(amount <= maxout) {
            saldo -= amount;
        }
    }
    
    public void print() {
        super.print();
        System.out.println("Maximal PayOut: " + maxout);
    }
    
    
}
