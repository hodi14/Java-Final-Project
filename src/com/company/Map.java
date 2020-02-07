package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.*;

class Map extends Board {
    private String[] map_numbers = {"Map 1", "Map 2", "Map 3", "Map 4", "Map 5", "Map 6"};
    private JComboBox map_number = new JComboBox(map_numbers);

    Map() {
        JButton back = new JButton("GO BACK");
        JButton start = new JButton("START THE GAME");
        JButton map = new JButton("MAP NUMBER");

        JLabel map1_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map1.png"));
        map1_img.setBounds(100, 50, 200, 200);
        board.add(map1_img);

        JLabel map2_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map2.png"));
        map2_img.setBounds(400, 50, 200, 200);
        board.add(map2_img);

        JLabel map3_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map3.png"));
        map3_img.setBounds(700, 50, 200, 200);
        board.add(map3_img);

        JLabel map4_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map4.png"));
        map4_img.setBounds(100, 300, 200, 200);
        board.add(map4_img);

        JLabel map5_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map5.png"));
        map5_img.setBounds(400, 300, 200, 200);
        board.add(map5_img);

        JLabel map6_img = new JLabel(new ImageIcon("C:\\Users\\amir-negar\\Documents\\Java-Final-Project\\map6.png"));
        map6_img.setBounds(700, 300, 200, 200);
        board.add(map6_img);


        map.setBounds(300, 550, 200, 50);
        back.setBounds(400, 750, 200, 50);
        start.setBounds(400, 650, 200, 50);

        map_number.setBounds(500, 550, 200, 50);

        back.setBackground(Color.GRAY);
        start.setBackground(Color.GRAY);
        map.setBackground(Color.GRAY);

        super.board.add(start);
        super.board.add(back);
        super.board.add(map);

        super.board.add(map_number);

        start.addActionListener(this::start);
        back.addActionListener(this::back);

    }

    private void start(ActionEvent e) {
        char mc = (Objects.requireNonNull(map_number.getSelectedItem()).toString()).charAt(4);
        int mi = Character.getNumericValue(mc);
        Data.getInstance().set_map(mi);
        new GamePlay();
        super.board.setVisible(false);
    }

    private void back(ActionEvent e) {
        new NewGame().show();
        super.board.setVisible(false);
    }
}
