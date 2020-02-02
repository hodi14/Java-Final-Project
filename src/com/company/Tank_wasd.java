package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

import static com.company.GamePlay.*;

public class Tank_wasd implements KeyListener{
    double x, y;
    Color c;

    Tank_wasd(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'W' || e.getKeyChar() == 'w')
            this.y -= 0.04;
        if (e.getKeyChar() == 'S' || e.getKeyChar() == 's')
            this.y += 0.04;
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A')
            this.x -= 0.04;
        if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D')
            this.x += 0.04;

    }
}