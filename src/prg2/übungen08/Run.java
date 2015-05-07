/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen08;

import javax.swing.JFrame;

/**
 *
 * @author Caro
 */
public class Run implements Runnable {
    
    private JFrame frame;
    private BallGame game;
    
    public Run (JFrame frame, BallGame game) {
        this.frame = frame;
        this.game = game;
    }

    @Override
    public void run() {
        synchronized(this) {
            while(true) {
                frame.repaint();
                game.delete();
                try {
                    Thread.sleep(40);
                }
                catch (InterruptedException e) {
                    System.err.println("Error: " + e);
                }
            }
        }
    }
    
}
