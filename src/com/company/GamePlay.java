package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

public class GamePlay extends JFrame implements KeyListener {
    Tank_wasd t1 = new Tank_wasd(250, 250);
    Tank_arrow t2 = new Tank_arrow(750, 750);

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

        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        update_pos();

        new Timer(
                10,
                new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        repaint();
                    }
                }
        ).start();
    }
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(t1.c);
        g.fillOval((int)t1.x, (int)t1.y, 80, 80);

        g.setColor(t2.c);
        g.fillOval((int)t2.x, (int)t2.y, 80, 80);

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
