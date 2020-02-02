package com.company;

import java.awt.*;
import javax.swing.*;

public class Tank extends JFrame{
    double x, y, v = 5;
    Color c;

    Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval((int)this.x, (int)this.y, 80, 80);
        Toolkit.getDefaultToolkit().sync();
    }
}