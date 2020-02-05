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

    public void map1(Graphics g) {
        Data.getInstance().walls_1.add(new wall (150,0,5,300));
        Data.getInstance().walls_1.add(new wall(150,150, 150, 5));
        Data.getInstance().walls_1.add(new wall(300,150,5,150));

        Data.getInstance().walls_1.add(new wall(150, 450,5,300));
        Data.getInstance().walls_1.add(new wall(150,750,150,5));
        Data.getInstance().walls_1.add(new wall(0,450,150,5));

        Data.getInstance().walls_1.add(new wall(700,700,5,150));
        Data.getInstance().walls_1.add(new wall(850,700,5,300));
        Data.getInstance().walls_1.add(new wall(700,850,150,5));

        Data.getInstance().walls_1.add(new wall(850,250,5,300));
        Data.getInstance().walls_1.add(new wall(850,250,150,5));
        Data.getInstance().walls_1.add(new wall(700,550,155,5));

        Data.getInstance().walls_1.add(new wall(425,425,150,150));



    }
    public void map2(Graphics g){
        Data.getInstance().walls_2.add(new wall(150,0,5,450));
        Data.getInstance().walls_2.add(new wall(300,0,5,300));
        Data.getInstance().walls_2.add(new wall(150,450,300,5));
        Data.getInstance().walls_2.add(new wall(850,700,5,300));
        Data.getInstance().walls_2.add(new wall(550,700,300,5));
        Data.getInstance().walls_2.add(new wall(700,550,300,5));
        Data.getInstance().walls_2.add(new wall(300,450,5,300));
        Data.getInstance().walls_2.add(new wall(0,600,150,5));
        Data.getInstance().walls_2.add(new wall(850,0,5,300));
        Data.getInstance().walls_2.add(new wall(0,850,450,5));
        Data.getInstance().walls_2.add(new wall(450,0,5,150));
        Data.getInstance().walls_2.add(new wall(450,150,300,5));
    }

    public void map3(Graphics g){
        Data.getInstance().walls_3.add(new wall(300,0,5,335));
        Data.getInstance().walls_3.add(new wall(150,330,150,5));

        Data.getInstance().walls_3.add(new wall(700,700,5,300));
        Data.getInstance().walls_3.add(new wall(700,700,150,5));

        Data.getInstance().walls_3.add(new wall(500,400,5,200));
        Data.getInstance().walls_3.add(new wall(400,500,400,5));

        Data.getInstance().walls_3.add(new wall(150,450,5,150));
        Data.getInstance().walls_3.add(new wall(0,600,155,5));

        Data.getInstance().walls_3.add(new wall(500,150,150,5));
        Data.getInstance().walls_3.add(new wall(650,150,5,450));

        Data.getInstance().walls_3.add(new wall(150,800,380,5));
    }

    public void map4(Graphics g){
        Data.getInstance().walls_4.add(new wall(0,300,500,5));
        Data.getInstance().walls_4.add(new wall(500,850,500,5));
        Data.getInstance().walls_4.add(new wall(500,300,5,200));
        Data.getInstance().walls_4.add(new  wall(500,650,5,200));
        Data.getInstance().walls_4.add(new  wall(500, 500,150,5));
        Data.getInstance().walls_4.add(new  wall(350,650,150,5 ));
        Data.getInstance().walls_4.add(new  wall(650,500,5,150));
        Data.getInstance().walls_4.add(new  wall(350,500,5,150));
        Data.getInstance().walls_4.add(new  wall(200,500,150,5));
        Data.getInstance().walls_4.add(new  wall(650,650,150,5));
        Data.getInstance().walls_4.add(new wall(0,850,300,5));
        Data.getInstance().walls_4.add((new wall(700,300,300,5)));

    }

    public void map5(Graphics g){
        Data.getInstance().walls_5.add(new wall(150,0,5,200));
        Data.getInstance().walls_5.add(new wall(350,0,5,200));
        Data.getInstance().walls_5.add(new wall(850,0,5,200));

        Data.getInstance().walls_5.add(new wall(600,150,5,400));
        Data.getInstance().walls_5.add(new wall(500,450,200,5));

        Data.getInstance().walls_5.add(new wall(200,550,405,5));
        Data.getInstance().walls_5.add(new wall(600,700,400,5));
        Data.getInstance().walls_5.add(new wall(0,650,250,5));
        Data.getInstance().walls_5.add(new wall(250,650,5,200));
    }

    public void map6(Graphics g) {
        Data.getInstance().walls_6.add(new wall(150,500,700,5));
        Data.getInstance().walls_6.add(new wall(300,150,5,350));
        Data.getInstance().walls_6.add(new wall(700,500,5, 350));
        Data.getInstance().walls_6.add(new wall(700,0,5,300));
        Data.getInstance().walls_6.add(new wall(700, 300,300,5));
        Data.getInstance().walls_6.add(new wall(0,700,300,5));
        Data.getInstance().walls_6.add(new wall(300, 700, 5,300));
        Data.getInstance().walls_6.add(new wall(500,350,5,300));

    }
}