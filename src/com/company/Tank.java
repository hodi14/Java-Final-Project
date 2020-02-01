package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Tank extends JPanel {
    Graphics graphics;
    Rectangle t;
    Tank() {
        t.setSize(100, 50);
        t.setRect(100, 100, 100, 100);
    }
}
