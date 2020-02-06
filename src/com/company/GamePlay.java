package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class GamePlay extends JFrame {
    private Tank t1 = new Tank(250, 250);
    private Tank t2 = new Tank(900, 900);

    private ArrayList<Bullet> bullets = new ArrayList<>();

    private boolean right_1, left_1, right_2, left_2, move_1, move_2;

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
                char c = e.getKeyChar();
                if (c == 'W' || c == 'w') {
                    move_1 = true;
                }
                if (c == 'a' || c == 'A') {
                    left_1 = true;
                }
                if (c == 'd' || c == 'D') {
                    right_1 = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    if (Data.getInstance().get_p1_bullet_n() > 0 && Data.getInstance().get_life_1() > 0) {
                        Bullet b = new Bullet((int) t1.x, (int) t1.y, t1.direction);
                        b.c = t1.c;
                        bullets.add(b);
                        Data.getInstance().p1_shot();
                    }
                }
                e.consume();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == 'W' || c == 'w') {
                    move_1 = false;
                }
                if (c == 'a' || c == 'A') {
                    left_1 = false;
                }
                if (c == 'd' || c == 'D') {
                    right_1 = false;
                }
                e.consume();
            }
        };
        this.addKeyListener(move_wasd);

        KeyListener move_arrow = new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    move_2 = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    left_2 = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    right_2 = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (Data.getInstance().get_p2_bullet_n() > 0 && Data.getInstance().get_life_2() > 0) {
                        Bullet b = new Bullet((int) t2.x, (int) t2.y, t2.direction);
                        b.c = t2.c;
                        bullets.add(b);
                        Data.getInstance().p2_shot();
                    }
                }
                e.consume();
            }

            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    move_2 = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    left_2 = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    right_2 = false;
                }
                e.consume();
            }
        };
        this.addKeyListener(move_arrow);

        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ground.getInstance().loadMap(Data.getInstance().get_map_number());

        new Timer(
                5,
                actionEvent -> repaint()
        ).start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Wall w: Data.getInstance().walls) {
            w.paint(g);
        }

        if (move_1)
            t1.move();
        if(left_1)
            t1.turn_left();
        if(right_1)
            t1.turn_right();

        if (move_2)
            t2.move();
        if(left_2)
            t2.turn_left();
        if(right_2)
            t2.turn_right();

        if (Data.getInstance().get_life_1() > 0) { t1.paint(g); }
        if (Data.getInstance().get_life_2() > 0) { t2.paint(g); }

        for (Bullet b: bullets) {
            if (b.hit_tank(t1) && b.c == t2.c && b.on_map) {
                Data.getInstance().p1_got_shot();
                b.on_map = false;
            }
            if (b.hit_tank(t2) && b.c == t1.c && b.on_map) {
                Data.getInstance().p2_got_shot();
                b.on_map = false;
            }

            for (Wall w : Data.getInstance().walls) {
                switch (b.hit_wall(w)) {
                    case Horizontal:
                        b.direction = Math.PI - b.direction;
                        break;
                    case Vertical:
                        b.direction = -b.direction;
                        break;
                }
            }
            if (b.on_map) {
                b.move();
                b.paint(g);
            }
        }

        Toolkit.getDefaultToolkit().sync();
    }
}
