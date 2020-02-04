package com.company;

import java.awt.*;
import javax.swing.*;

public class Bullet extends JFrame{
    double x, y, direction;
    Color c;

    Bullet(int x, int y, double d) {
        this.x = x;
        this.y = y;
        this.direction = d;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.fillOval((int)this.x - 10, (int)this.y - 10, 20, 20);
        Toolkit.getDefaultToolkit().sync();
    }

    void move() {
        this.x += Math.round(5 * Math.sin(this.direction));
        this.y += Math.round(5 * Math.cos(this.direction));
    }
}