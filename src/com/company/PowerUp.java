package com.company;

import javax.swing.*;
import java.awt.*;

class PowerUp extends JFrame {
    int x, y, age;
    boolean on_map;

    PowerUp(int x, int y) {
        this.x = x;
        this.y = y;
        this.age = 500;
        on_map = true;
    }
}
