package com.company;

public class Data extends Board{
    private String p1_name, p2_name;
    private int p1_bullet, p2_bullet, p1_life, p2_life;
    private NewGame.tank_color p1_color, p2_color;

    public void set_name_1(String n1) {
        p1_name = n1;
    }
    public void set_name_2(String n2) {
        p1_name = n2;
    }

    public void set_color_1(NewGame.tank_color c1) {
        p1_color = c1;
    }
    public void set_color_2(NewGame.tank_color c2) {
        p2_color = c2;
    }

}
