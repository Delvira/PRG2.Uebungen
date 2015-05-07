/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen08;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Caro
 */
public class Ball {

    
    private final static Random randomNumber = new Random();
    private int radius;
    private Color color;
    private int x;
    private int y;
    private int speed;
    private int transparancy;
    
    
    public Ball(int x, int y) {
        radius = randomNumber.nextInt(30)+20;
        color = new Color(randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255));
        speed = randomNumber.nextInt(10)+1;
        transparancy = 255;
        this.x = x;
        this.y = y;
    }
    
    
    public void draw(Graphics g) {
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
        g.setColor(color);
        this.run();
    }
    
    
    public int getTransparancy() {
        return transparancy;
    }
    
    
    private synchronized void run() {
        if((y+2*radius)<=400) {
        fallDown();
        }
        else {
            brightenUp();
        }
    }
    
    
    private void fallDown() {
         y += speed;
    }
    
    
    private void brightenUp()
    {
        if(transparancy >= 4) {
        transparancy -= 5;
        color = new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), transparancy);
        }
    }
    
}
