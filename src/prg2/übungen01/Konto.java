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



public class Konto {
    
    private static int count;
    
    private int no;
    protected double saldo;
    private double rate;
    
    public Konto(){
        count++;
        no = count;
        saldo = 0.0;
        rate = 0.0;
    }
    
    public Konto(double saldo, double rate){
        count++;
        no = count;
        this.saldo = saldo;
        this.rate = rate;
    }
    
    public int getNo(){
        return no;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public double getRate(){
        return rate;
    }
    
    public void payIn(double amount){
        saldo += amount;
    }
    
    public void payOut(double amount){
        saldo -= amount;
    }
    
    public void print(){
        System.out.println("Kontonummer: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zins: " + rate);
    }
    
}
