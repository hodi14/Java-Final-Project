package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

public class GamePlay extends JFrame implements KeyListener {
    Tank t1 = new Tank(250, 250, Color.BLUE);

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
                        repaint();;
                    }
                }
        ).start();
    }
    public void paint(Graphics g) {
        g.setColor(t1.c);
        super.paint(g);
        g.fillRect(t1.x, t1.y, 100, 50);
        Toolkit.getDefaultToolkit().sync();
    }

    public void update_pos() {
        this.addKeyListener(t1);
    }

    public void keyTyped(KeyEvent keyEvent) {}
    public void keyPressed(KeyEvent keyEvent) {}
    public void keyReleased(KeyEvent keyEvent) {}
}
 /*
class Ground extends JFrame implements KeyListener {
    double x_pos_1 = 250, y_pos_1 = 250;
    double x_pos_2 = 750, y_pos_2 = 750;

    Ground() {
    }

    void update_pos() {
        this.addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        super.paint(g);
        g.fillRect((int)x_pos_1, (int)y_pos_1, 75, 75);
        g.setColor(Color.GREEN);
        g.fillRect((int)x_pos_2, (int)y_pos_2, 75, 75);

        Toolkit.getDefaultToolkit().sync();
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == 'W' || e.getKeyChar() == 'w')
            y_pos_1 -= 0.03;
        if (e.getKeyChar() == 'S' || e.getKeyChar() == 's')
            y_pos_1 += 0.03;
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A')
            x_pos_1 -= 0.03;
        if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D')
            x_pos_1 += 0.03;

        if (e.getKeyCode() == KeyEvent.VK_UP)
            y_pos_2 -= 0.03;
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            y_pos_2 += 0.03;
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            x_pos_2 -= 0.03;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            x_pos_2 += 0.03;
    }
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}

}

  */
