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

        /*
        JLabel map_1 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_1.setBounds(100, 50, 200, 200);
        super.board.add(map_1);
        JLabel map_2 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_2.setBounds(400, 50, 200, 200);
        super.board.add(map_2);
        JLabel map_3 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_3.setBounds(700, 50, 200, 200);
        super.board.add(map_3);
        JLabel map_4 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_4.setBounds(100, 300, 200, 200);
        super.board.add(map_4);
        JLabel map_5 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_5.setBounds(400, 300, 200, 200);
        super.board.add(map_5);
        JLabel map_6 = new JLabel(new ImageIcon("C:\\Users\\Alireza Hodaee\\Desktop\\test.JPG"));
        map_6.setBounds(700, 300, 200, 200);
        super.board.add(map_6);

         */
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
