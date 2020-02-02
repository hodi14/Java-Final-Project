package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

public class GamePlay extends JFrame implements KeyListener {
    Tank_wasd t1 = new Tank_wasd(250, 250, Color.BLUE);
    Tank_arrow t2 = new Tank_arrow(750, 750, Color.RED);


    GamePlay() {
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);

        new Timer(
                10,
                new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        update_pos();
                        repaint();
                    }
                }
        ).start();
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(t1.c);
        g.fillRect((int)t1.x, (int)t1.y, 70, 70);

        g.setColor(t2.c);
        g.fillRect((int)t2.x, (int)t2.y, 70, 70);

        Toolkit.getDefaultToolkit().sync();
    }

    public void update_pos() {
        this.addKeyListener(t1);
        this.addKeyListener(t2);
    }

    public void keyTyped(KeyEvent keyEvent) {}
    public void keyPressed(KeyEvent keyEvent) {}
    public void keyReleased(KeyEvent keyEvent) {}
}
