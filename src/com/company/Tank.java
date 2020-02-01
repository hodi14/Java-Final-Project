package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Tank extends Frame {
    int x;
    int y;
    Color c;
    Rectangle t;

    Tank(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public void paint_1 (Graphics g) {
        g.setColor(c);
        g.fillRect(x, y, 100, 50);
        new key();
    }
}