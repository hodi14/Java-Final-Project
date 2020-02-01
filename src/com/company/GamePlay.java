package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

public class GamePlay {
    GamePlay() {
        GamePlay_ ground = new GamePlay_();
        ground.setVisible(true);

        new Timer(
                50,
                new ActionListener() {
                    public void actionPerformed(ActionEvent actionEvent) {
                        ground.updateState();
                        ground.repaint();
                        ground.getContentPane().setBackground(Color.BLACK);
                    }
                }
        ).start();
    }
}

class GamePlay_ extends JFrame implements KeyListener {
    float shapeX = 250, shapeY = 0;
    boolean right = true, down = true;
    GamePlay_() {
        this.setSize(1000, 1000);
    }

    void updateState() {
        if (this.shapeX > 1000 || this.shapeX < 0)
            this.right = !this.right;
        if (this.shapeY > 1000 || this.shapeY < 0)
            this.down = !this.down;
        this.addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        super.paint(g);
        g.fillRect((int)shapeX, (int)shapeY, 100, 50);
        Toolkit.getDefaultToolkit().sync();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'W' || e.getKeyChar() == 'w')
            this.shapeY -= 0.1;
        if (e.getKeyChar() == 'S' || e.getKeyChar() == 's')
            this.shapeY += 0.1;

        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A')
            this.shapeX -= 0.1;
        if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D')
            this.shapeX += 0.1;

    }
}