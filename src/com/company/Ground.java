package com.company;

import java.awt.*;
import javax.swing.*;

public class Ground extends JFrame{

    private static Ground me;
    public static Ground getInstance() {
        if (me == null) {
            me = new Ground();
        }
        return me;
    }
    private Ground(){}

    public void paint1(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100,100, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }

    public void paint2(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(200,200, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }

    public void paint3(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(300,300, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }

    public void paint4(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(400,400, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }

    public void paint5(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(500,500, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }

    public void paint6(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(600,600, 40, 100);
        Toolkit.getDefaultToolkit().sync();
    }
}