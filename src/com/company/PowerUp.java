package com.company;

import javax.swing.*;
import java.awt.*;

class PowerUp extends JFrame {
    int x, y;
    boolean on_map;

    PowerUp(int x, int y) {
        this.x = x;
        this.y = y;
        on_map = true;
    }
}
