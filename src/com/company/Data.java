package com.company;

public class Data {
    private String p1_name, p2_name;
    private int bullet, p1_life, p2_life, map_number;
    private NewGame.tank_color p1_color, p2_color;

    public void set_name_1(String n1) {
        p1_name = n1;
        System.out.println(p1_name);
    }
    public void set_name_2(String n2) {
        p2_name = n2;
        System.out.println(p2_name);
    }

    public void set_color_1(NewGame.tank_color c1) {
        p1_color = c1;
        System.out.println(p1_color);
    }
    public void set_color_2(NewGame.tank_color c2) {
        p2_color = c2;
        System.out.println(p2_color);
    }

    public void set_map(int m) {
        map_number = m;
        System.out.println(map_number);
    }

}
