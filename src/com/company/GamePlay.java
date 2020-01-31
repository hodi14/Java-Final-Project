package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class GamePlay extends JFrame {
    Rectangle p1;
    int x1 = 100, y1 = 200;
    public GamePlay() {
        setSize(new Dimension(1000, 1000));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
    }

}
