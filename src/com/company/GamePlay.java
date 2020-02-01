package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class GamePlay extends JFrame  {
    public static JFrame ground = new JFrame("TANKS");

    public GamePlay() {
        ground.setBackground(Color.BLACK);
        ground.setSize(1000, 1000);
        ground.setResizable(false);
        ground.setLocationRelativeTo(null);
        ground.setLayout(null);
        ground.setVisible(true);
        while (true) {
            Tank t1 = new Tank(100, 100, Color.GREEN);
            Tank t2 = new Tank(700, 700,Color.RED);
            t1.paint_1(ground.getGraphics());
            t2.paint_1(ground.getGraphics());
        }
    }
}