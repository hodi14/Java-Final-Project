package com.company;

import java.awt.*;
import javax.swing.*;

public class Tank extends JFrame{
    double x, y;
    Color c;

    Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval((int)this.x, (int)this.y, 60, 60);
        g.fillRect((int)this.x-22, (int)this.y+25, 20, 5);
        Toolkit.getDefaultToolkit().sync();
    }
}