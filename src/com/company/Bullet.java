package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Bullet extends JFrame {
    double x, y, direction;
    Color c;
    Boolean on_map;

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

    Data.hit_wall_e hit_wall(Wall w) {
        if (Math.abs(this.x - w.x) < 10 && Math.abs(this.x - w.x) > 0 && this.y <= w.y + w.height && this.y >= w.y) {
            return Data.hit_wall_e.Vertical;
        }
        if (Math.abs(this.y - w.y) < 10 && Math.abs(this.y - w.y) > 0 && this.x <= w.x + w.width && this.x >= w.x) {
            return Data.hit_wall_e.Horizontal;
        }
        return Data.hit_wall_e.None;
    }
}
