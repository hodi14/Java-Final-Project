package com.company;

public class Data {
    private String p1_name, p2_name;
    private int bullet_n, p1_life, p2_life, map_number, bullet_p;
    private NewGame.tank_color p1_color, p2_color;

    public void set_name_1(String n1) {
        p1_name = n1;
    }
    public void set_name_2(String n2) {
        p2_name = n2;
    }

    public void set_color_1(NewGame.tank_color c1) {
        p1_color = c1;
    }
    public void set_color_2(NewGame.tank_color c2) {
        p2_color = c2;
    }

    public void set_map(int m) {
        map_number = m;
    }

    public void set_life(int l) {
        p1_life = l;
        p2_life = l;
    }
    public void set_bullet_p(int bp) {
        bullet_p = bp;
    }
    public void set_bullet_n(int bn) {
        bullet_n = bn;
    }

}
