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

    public void map1(Graphics g) {
        Data.getInstance().walls_1.add(new wall(100,100, 70, 200));
        Data.getInstance().walls_1.add(new wall(234,500,100,30));
        Data.getInstance().walls_1.add(new wall(539, 700,50,150));
        Data.getInstance().walls_1.add(new wall(480,100,250,70));
        Data.getInstance().walls_1.add(new wall(850,350,2000,100));
        Data.getInstance().walls_1.add(new wall(70,700,100,100));
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