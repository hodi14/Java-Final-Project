package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JFrame {
    Tank t1 = new Tank(250, 250);
    Tank t2 = new Tank(750, 750);

    GamePlay() {
        switch (Data.getInstance().p1_color.toString()) {
            case "Blue":
                t1.c = Color.BLUE;
                break;
            case "Red":
                t1.c = Color.RED;
                break;
            case "Green":
                t1.c = Color.GREEN;
                break;
        }
        switch (Data.getInstance().p2_color.toString()) {
            case "Blue":
                t2.c = Color.BLUE;
                break;
            case "Red":
                t2.c = Color.RED;
                break;
            case "Green":
                t2.c = Color.GREEN;
                break;
        }

        this.addKeyListener(move_tank);

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
                        repaint();
                        t1.paint(getGraphics());
                        t2.paint(getGraphics());
                    }
                }
        ).start();
    }
    KeyListener move_tank = new KeyListener() {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP && t2.y > 30) {
                t2.y -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN && t2.y < 930) {
                t2.y += 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT && t2.x > 0) {
                t2.x -= 5;
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && t2.x < 930) {
                t2.x += 5;
            }

            if ((e.getKeyChar() == 'W' || e.getKeyChar() == 'w') && t1.y > 30) {
                t1.y -= 5;
            }
            if ((e.getKeyChar() == 'S' || e.getKeyChar() == 's') && t1.y < 930) {
                t1.y += 5;
            }
            if ((e.getKeyChar() == 'a' || e.getKeyChar() == 'A') && t1.x > 0) {
                t1.x -= 5;
            }
            if ((e.getKeyChar() == 'd' || e.getKeyChar() == 'D') && t1.x < 930) {
                t1.x += 5;
            }
        }
        public void keyTyped(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
    };
}
