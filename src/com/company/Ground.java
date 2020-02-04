package com.company;

import java.awt.*;
import javax.swing.*;

class Ground extends JFrame{

    private static Ground me;
    static Ground getInstance() {
        if (me == null) {
            me = new Ground();
        }
        return me;
    }
    private Ground(){}

    public void map_1(Graphics g) {
        Data.getInstance().walls_1.add(new wall (125,0,5,300));
        Data.getInstance().walls_1.add(new wall(125,150, 150, 5));
        Data.getInstance().walls_1.add(new wall(234,500,100,30));
        /*Data.getInstance().walls_1.add(new wall(539, 700,50,150));
        Data.getInstance().walls_1.add(new wall(480,100,250,70));
        Data.getInstance().walls_1.add(new wall(850,350,2000,100));
        Data.getInstance().walls_1.add(new wall(70,700,100,100));

         */
    }

    public void map_2(Graphics g) {

    }

    public void map_3(Graphics g) {

    }

    public void map_4(Graphics g) {

    }

    public void map_5(Graphics g) {

    }

    public void map_6(Graphics g) {

    }
}