/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2.übungen08;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Caro
 */
public class BallGame extends JPanel implements MouseListener{

    
    private ArrayList<Ball> ballList;

    /**
     * Creates new form BallGame
     */
    public BallGame() {
        initComponents();
        ballList = new ArrayList<>();
        this.addMouseListener(this);
        
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        ballList.add(new Ball(e.getX(), e.getY()));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint (Graphics g) {
        synchronized (g) {
            ListIterator<Ball> itr = ballList.listIterator();
            while(itr.hasNext()) {
                Ball ball = itr.next();
                ball.draw(g);
            }
        }
        
    }
    
    public synchronized void delete () {
        ListIterator<Ball> itr = ballList.listIterator();
        while(itr.hasNext()) {
            Ball ball = itr.next();
            if(ball.getTransparancy() == 0) {
                itr.remove();
            }
        }
    }
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ball Game");
        BallGame game = new BallGame();
        frame.add(game);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Thread thread = new Thread(new Run(frame, game));
        thread.start();
 
    }

}
