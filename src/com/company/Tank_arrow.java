package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

import static com.company.GamePlay.*;

public class Tank_arrow implements KeyListener{
    double x, y;
    Color c;

    Tank_arrow(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && this.y > 30) {
            this.y -= 0.04;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && this.y < 930) {
            this.y += 0.04;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && this.x > 0) {
            this.x -= 0.04;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && this.x < 930 ) {
            this.x += 0.04;
        }

    }
}