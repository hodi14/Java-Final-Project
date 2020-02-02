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

    }
}