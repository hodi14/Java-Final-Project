package com.company;

import java.awt.*;
import java.util.ArrayList;
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

    void loadMap(int mapNo) {
        switch (mapNo) {
            case 1:
                map1();
                break;
            case 2:
                map2();
                break;
            case 3:
                map3();
                break;
            case 4:
                map4();
                break;
            case 5:
                map5();
                break;
            case 6:
                map6();
                break;
        }
    }

    public void map1() {
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(13);
        data.walls.add(new wall (150,0,5,300));
        data.walls.add(new wall(150,150, 150, 5));
        data.walls.add(new wall(300,150,5,150));

        data.walls.add(new wall(150, 450,5,300));
        data.walls.add(new wall(150,750,150,5));
        data.walls.add(new wall(0,450,150,5));

        data.walls.add(new wall(700,700,5,150));
        data.walls.add(new wall(850,700,5,300));
        data.walls.add(new wall(700,850,150,5));

        data.walls.add(new wall(850,250,5,300));
        data.walls.add(new wall(850,250,150,5));
        data.walls.add(new wall(700,550,155,5));

        data.walls.add(new wall(425,425,150,150));



    }
    public void map2(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(12);
        data.walls.add(new wall(150,0,5,450));
        data.walls.add(new wall(300,0,5,300));
        data.walls.add(new wall(150,450,300,5));
        data.walls.add(new wall(850,700,5,300));
        data.walls.add(new wall(550,700,300,5));
        data.walls.add(new wall(700,550,300,5));
        data.walls.add(new wall(300,450,5,300));
        data.walls.add(new wall(0,600,150,5));
        data.walls.add(new wall(850,0,5,300));
        data.walls.add(new wall(0,850,450,5));
        data.walls.add(new wall(450,0,5,150));
        data.walls.add(new wall(450,150,300,5));
    }

    public void map3(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(11);
        data.walls.add(new wall(300,0,5,335));
        data.walls.add(new wall(150,330,150,5));

        data.walls.add(new wall(700,700,5,300));
        data.walls.add(new wall(700,700,150,5));

        data.walls.add(new wall(500,400,5,200));
        data.walls.add(new wall(400,500,400,5));

        data.walls.add(new wall(150,450,5,150));
        data.walls.add(new wall(0,600,155,5));

        data.walls.add(new wall(500,150,150,5));
        data.walls.add(new wall(650,150,5,450));

        data.walls.add(new wall(150,800,380,5));
    }

    public void map4(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(12);
        data.walls.add(new wall(0,300,500,5));
        data.walls.add(new wall(500,850,500,5));
        data.walls.add(new wall(500,300,5,200));
        data.walls.add(new  wall(500,650,5,200));
        data.walls.add(new  wall(500, 500,150,5));
        data.walls.add(new  wall(350,650,150,5 ));
        data.walls.add(new  wall(650,500,5,150));
        data.walls.add(new  wall(350,500,5,150));
        data.walls.add(new  wall(200,500,150,5));
        data.walls.add(new  wall(650,650,150,5));
        data.walls.add(new wall(0,850,300,5));
        data.walls.add((new wall(700,300,300,5)));

    }

    public void map5(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(9);
        data.walls.add(new wall(150,0,5,200));
        data.walls.add(new wall(350,0,5,200));
        data.walls.add(new wall(850,0,5,200));

        data.walls.add(new wall(600,150,5,400));
        data.walls.add(new wall(500,450,200,5));

        data.walls.add(new wall(200,550,405,5));
        data.walls.add(new wall(600,700,400,5));
        data.walls.add(new wall(0,650,250,5));
        data.walls.add(new wall(250,650,5,200));
    }

    public void map6() {
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(8);
        data.walls.add(new wall(150,500,700,5));
        data.walls.add(new wall(300,150,5,350));
        data.walls.add(new wall(700,500,5, 350));
        data.walls.add(new wall(700,0,5,300));
        data.walls.add(new wall(700, 300,300,5));
        data.walls.add(new wall(0,700,300,5));
        data.walls.add(new wall(300, 700, 5,300));
        data.walls.add(new wall(500,350,5,300));

    }
}