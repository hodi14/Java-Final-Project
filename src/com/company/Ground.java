package com.company;

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

    private void map1() {
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(13);
        data.walls.add(new Wall(150,0,5,300));
        data.walls.add(new Wall(150,150, 150, 5));
        data.walls.add(new Wall(300,150,5,150));

        data.walls.add(new Wall(150, 450,5,300));
        data.walls.add(new Wall(150,750,150,5));
        data.walls.add(new Wall(0,450,150,5));

        data.walls.add(new Wall(700,700,5,150));
        data.walls.add(new Wall(850,700,5,300));
        data.walls.add(new Wall(700,850,150,5));

        data.walls.add(new Wall(850,250,5,300));
        data.walls.add(new Wall(850,250,150,5));
        data.walls.add(new Wall(700,550,155,5));

        data.walls.add(new Wall(425,425,150,150));



    }
    private void map2(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(12);
        data.walls.add(new Wall(150,0,5,450));
        data.walls.add(new Wall(300,0,5,300));
        data.walls.add(new Wall(150,450,300,5));
        data.walls.add(new Wall(850,700,5,300));
        data.walls.add(new Wall(550,700,300,5));
        data.walls.add(new Wall(700,550,300,5));
        data.walls.add(new Wall(300,450,5,300));
        data.walls.add(new Wall(0,600,150,5));
        data.walls.add(new Wall(850,0,5,300));
        data.walls.add(new Wall(0,850,450,5));
        data.walls.add(new Wall(450,0,5,150));
        data.walls.add(new Wall(450,150,300,5));
    }

    private void map3(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(11);
        data.walls.add(new Wall(300,0,5,335));
        data.walls.add(new Wall(150,330,150,5));

        data.walls.add(new Wall(700,700,5,300));
        data.walls.add(new Wall(700,700,150,5));

        data.walls.add(new Wall(500,400,5,200));
        data.walls.add(new Wall(400,500,400,5));

        data.walls.add(new Wall(150,450,5,150));
        data.walls.add(new Wall(0,600,155,5));

        data.walls.add(new Wall(500,150,150,5));
        data.walls.add(new Wall(650,150,5,450));

        data.walls.add(new Wall(150,800,380,5));
    }

    private void map4(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(12);
        data.walls.add(new Wall(0,300,500,5));
        data.walls.add(new Wall(500,850,500,5));
        data.walls.add(new Wall(500,300,5,200));
        data.walls.add(new Wall(500,650,5,200));
        data.walls.add(new Wall(500, 500,150,5));
        data.walls.add(new Wall(350,650,150,5 ));
        data.walls.add(new Wall(650,500,5,150));
        data.walls.add(new Wall(350,500,5,150));
        data.walls.add(new Wall(200,500,150,5));
        data.walls.add(new Wall(650,650,150,5));
        data.walls.add(new Wall(0,850,300,5));
        data.walls.add(new Wall(700,300,300,5));

    }

    private void map5(){
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(9);
        data.walls.add(new Wall(150,0,5,200));
        data.walls.add(new Wall(350,0,5,200));
        data.walls.add(new Wall(850,0,5,200));

        data.walls.add(new Wall(600,150,5,400));
        data.walls.add(new Wall(500,450,200,5));

        data.walls.add(new Wall(200,550,405,5));
        data.walls.add(new Wall(600,700,400,5));
        data.walls.add(new Wall(0,650,250,5));
        data.walls.add(new Wall(250,650,5,200));
    }

    private void map6() {
        Data data = Data.getInstance();
        data.walls = new ArrayList<>(8);
        data.walls.add(new Wall(150,500,700,5));
        data.walls.add(new Wall(300,150,5,350));
        data.walls.add(new Wall(700,500,5, 350));
        data.walls.add(new Wall(700,0,5,300));
        data.walls.add(new Wall(700, 300,300,5));
        data.walls.add(new Wall(0,700,300,5));
        data.walls.add(new Wall(300, 700, 5,300));
        data.walls.add(new Wall(500,350,5,300));

    }
}