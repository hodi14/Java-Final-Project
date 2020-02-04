package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class GamePlay extends JFrame {
    private Tank t1 = new Tank(250, 250);
    private Tank t2 = new Tank(900, 900);

    private ArrayList<Bullet> bullets = new ArrayList<>();

    private final Set<Character> pressed_wasd = new HashSet<>();
    private final Set<Character> pressed_pl = new HashSet<>();

    GamePlay() {
        switch (Data.getInstance().get_color_1().toString()) {
            case "Blue":
                t1.c = Color.BLUE;
                break;
            case "Red":
                t1.c = Color.RED;
                break;
            case "Green":
                t1.c = Color.GREEN;
                break;
        }
        switch (Data.getInstance().get_color_2().toString()) {
            case "Blue":
                t2.c = Color.BLUE;
                break;
            case "Red":
                t2.c = Color.RED;
                break;
            case "Green":
                t2.c = Color.GREEN;
                break;
        }

        KeyListener move_wasd = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                pressed_wasd.add(e.getKeyChar());
                if (pressed_wasd.size() >= 1) {
                    for (Character c : pressed_wasd) {
                        if (c == 'W' || c == 'w') {
                            t1.move();
                        }
                        if (c == 'a' || c == 'A') {
                            t1.turn_left();
                        }
                        if (c == 'd' || c == 'D') {
                            t1.turn_right();
                        }

                        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                            Bullet b = new Bullet((int) t1.x, (int) t1.y, t1.direction);
                            b.c = t1.c;
                            bullets.add(b);
                        }
                    }
                }
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                pressed_wasd.remove(e.getKeyChar());
            }
        };
        this.addKeyListener(move_wasd);

        KeyListener move_pl = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                pressed_pl.add(e.getKeyChar());
                if (pressed_pl.size() >= 1) {
                    for (Character c : pressed_pl) {
                        if (c == 'P' || c == 'p') {
                            t2.move();
                        }
                        if (c == 'L' || c == 'l') {
                            t2.turn_left();
                        }
                        if (c == '\'') {
                            t2.turn_right();
                        }
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            Bullet b = new Bullet((int) t2.x, (int) t2.y, t2.direction);
                            b.c = t2.c;
                            bullets.add(b);
                        }
                    }
                }
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                pressed_pl.remove(e.getKeyChar());
            }
        };
        this.addKeyListener(move_pl);

        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new Timer(
                5,
                actionEvent -> {
                    switch (Data.getInstance().get_map_number()) {
                        /*
                        case 1:
                            Ground.getInstance().map_1(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;
                        case 2:
                            Ground.getInstance().map_2(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;
                        case 3:
                            Ground.getInstance().map_3(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;
                        case 4:
                            Ground.getInstance().map_4(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;
                        case 5:
                            Ground.getInstance().map_5(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;
                        case 6:
                            Ground.getInstance().map_6(getGraphics());
                            for (wall w: Data.getInstance().walls_1) { w.paint(getGraphics()); }
                            break;

                         */
                    }

                    t1.paint(getGraphics());
                    t2.paint(getGraphics());
                    for (Bullet b: bullets) {
                        b.move();
                        b.paint(getGraphics());
                    }
                    repaint();
                }
        ).start();
    }

}
