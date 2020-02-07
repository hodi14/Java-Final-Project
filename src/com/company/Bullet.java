package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Bullet extends JFrame {
    double x, y, direction;
    Color c;
    Boolean on_map;
    final static int LIFE = 200;
    int age = Bullet.LIFE;

    Bullet(int x, int y, double d) {
        this.x = x;
        this.y = y;
        this.direction = d;
        this.on_map = true;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(this.c);
        g.fillOval((int)this.x - 10, (int)this.y - 10, 10, 10);
    }

    void growOld() {
        this.age--;
        if (this.age <= 0) {
            this.on_map = false;
        }
    }


    void move() {
        this.x += (double)Math.round(8.0D * Math.sin(this.direction));
        this.y += (double)Math.round(8.0D * Math.cos(this.direction));
    }

    boolean hit_tank(Tank t) {
        return (Math.abs(this.x - t.x) < 40 && Math.abs(this.y - t.y) < 40);
    }

    Data.hit_wall_e hit_wall(Wall w) {
        if (this.x - w.x - w.width < 10 && this.x - w.x - w.width > 0 && this.y <= w.y + w.height && this.y >= w.y) {
            return Data.hit_wall_e.Vertical;
        }
        if (this.y - w.y < 10 && this.y - w.y > 0 && this.x <= w.x + w.width && this.x >= w.x) {
            return Data.hit_wall_e.Horizontal;
        }
        if (w.x - this.x < 10 && w.x - this.x > 0 && this.y <= w.y + w.height && this.y >= w.y) {
            return Data.hit_wall_e.Vertical;
        }
        if (this.y - w.y - w.height < 10 && this.y - w.y - w.height > 0 && this.x <= w.x + w.width && this.x >= w.x) {
            return Data.hit_wall_e.Horizontal;
        }
        return Data.hit_wall_e.None;
    }
}
