package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Bullet extends JFrame {
    double x, y, direction;
    Color c;
    Boolean on_map = false;

    Bullet(int x, int y, double d) {
        this.x = x;
        this.y = y;
        this.direction = d;
        this.on_map = true;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(this.c);
        g.fillOval((int)this.x - 10, (int)this.y - 10, 20, 20);
    }

    void move() {
        this.x += (double)Math.round(8.0D * Math.sin(this.direction));
        this.y += (double)Math.round(8.0D * Math.cos(this.direction));
    }

    boolean hit_tank(Tank t) {
        return (Math.abs(this.x - t.x) < 40 && Math.abs(this.y - t.y) < 40);
    }
}
