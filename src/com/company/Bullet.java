package com.company;

import java.awt.*;
import javax.swing.*;

public class Bullet extends JFrame{
    double x, y, v = 5;
    Color c;

    Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval((int)this.x, (int)this.y, 30, 30);
        Toolkit.getDefaultToolkit().sync();
    }
}