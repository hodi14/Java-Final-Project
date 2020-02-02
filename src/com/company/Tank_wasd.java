package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

import static com.company.GamePlay.*;

public class Tank_wasd implements KeyListener{
    double x, y, v = 5;
    Color c;

    Tank_wasd(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        if ((e.getKeyChar() == 'W' || e.getKeyChar() == 'w') && this.y > 30) {
            this.y -= v;
        }
        if ((e.getKeyChar() == 'S' || e.getKeyChar() == 's') && this.y < 930) {
            this.y += v;
        }
        if ((e.getKeyChar() == 'a' || e.getKeyChar() == 'A') && this.x > 0) {
            this.x -= v;
        }
        if ((e.getKeyChar() == 'd' || e.getKeyChar() == 'D') && this.x < 930) {
            this.x += v;
        }

    }
}