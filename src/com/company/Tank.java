package com.company;

import java.awt.*;
import javax.swing.*;

public class Tank extends JFrame{
    double x, y, direction, av = 0.04, x_gun, y_gun;
    Color c;

    Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(c);
        super.paint(g2d);
        g2d.setStroke(new BasicStroke(10));

        x_gun = Math.round(this.x + 40 * Math.sin(this.direction));
        y_gun = Math.round(this.y + 40 * Math.cos(this.direction));

        g2d.fillOval((int)this.x - 30, (int)this.y - 30, 60, 60);
        g2d.drawLine((int)this.x, (int)this.y, (int)this.x_gun, (int)this.y_gun);
    }

    private void change_direction(double amount) {
        this.direction = (this.direction + amount) % (2*Math.PI);
    }

    void turn_left() {
        this.change_direction(av);
    }
    void turn_right() { this.change_direction(-av); }

    void move() {
        this.x += Math.round(3 * Math.sin(this.direction));
        this.y += Math.round(3 * Math.cos(this.direction));
    }

    boolean can_move() {
        if (this.x <= 40 && this.direction > Math.PI && this.direction < 2*Math.PI || this.x <= 40 && this.direction > -Math.PI && this.direction < 0)
            return false;
        if ((this.x >= 960 && this.direction > 0 && this.direction < Math.PI) || (this.x >= 960 && this.direction > -2*Math.PI && this.direction < -Math.PI))
            return false;
        if ((this.y <= 60 && this.direction > Math.PI/2 && this.direction < 3*Math.PI/2) || (this.y <= 60 && this.direction > -3*Math.PI/2 && this.direction < -Math.PI/2))
            return false;
        if ((this.y >= 960 && this.direction > 0 && this.direction < Math.PI/2) || (this.y >= 960 && this.direction > 3*Math.PI/2 && this.direction < 2*Math.PI))
            return false;
        if ((this.y >= 960 && this.direction < 0 && this.direction > -Math.PI/2) || (this.y >= 960 && this.direction > -2*Math.PI && this.direction < -3*Math.PI/2))
            return false;
        return  true;
    }
}