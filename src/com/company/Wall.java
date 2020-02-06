package com.company;

import javax.swing.*;
import java.awt.*;

class Wall extends JFrame {
    int x, y, width, height;

    Wall(int x, int y, int w, int h ) {
        this.x = x;
        this.y = y;
        this.width= w;
        this.height = h;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.fillRect(this.x , this.y , this.width, this.height);
    }
}
