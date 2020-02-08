package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class NewGame extends Board{
    private JTextField p1_name_t = new JTextField();
    private JTextField p2_name_t = new JTextField();

    private JComboBox p1_color_c = new JComboBox(Data.tank_color.values());
    private JComboBox p2_color_c = new JComboBox(Data.tank_color.values());

    NewGame() {
        JLabel logo_img = new JLabel(new ImageIcon(".\\resource\\logo.png"));
        logo_img.setBounds(110, 0, 800, 400);
        board.add(logo_img);
        JLabel name = new JLabel("  TANKS GAME");
        name.setBounds(100, 320, 800, 200);
        name.setFont(new Font(name.getFont().getName(), name.getFont().getStyle(), 100));
        name.setForeground(new Color(0, 150, 0));
        super.board.add(name);

        JButton map = new JButton("CHOOSE MAP");
        JButton back = new JButton("GO BACK");
        JButton p1_name_b = new JButton("PLAYER 1 NAME");
        JButton p2_name_b = new JButton("PLAYER 2 NAME");
        JButton p1_color_b = new JButton("PLAYER 1 COLOR");
        JButton p2_color_b = new JButton("PLAYER 2 COLOR");

        map.setBounds(400, 700, 200, 50);
        back.setBounds(400, 800, 200, 50);
        p1_name_b.setBounds(50, 550, 200, 50);
        p2_name_b.setBounds(550, 550, 200, 50);
        p1_color_b.setBounds(50, 610, 200, 50);
        p2_color_b.setBounds(550, 610, 200, 50);

        p1_name_t.setBounds(250, 550, 200, 50);
        p2_name_t.setBounds(750, 550, 200, 50);

        p1_color_c.setBounds(250, 610, 200, 50);
        p2_color_c.setBounds(750, 610, 200, 50);

        map.setBackground(new Color(0, 150, 0));
        back.setBackground(new Color(0, 150, 0));
        p1_name_b.setBackground(new Color(0, 150, 0));
        p2_name_b.setBackground(new Color(0, 150, 0));
        p1_color_b.setBackground(new Color(0, 150, 0));
        p2_color_b.setBackground(new Color(0, 150, 0));

        super.board.add(map);
        super.board.add(back);
        super.board.add(p1_name_b);
        super.board.add(p2_name_b);
        super.board.add(p1_color_b);
        super.board.add(p2_color_b);

        super.board.add(p1_name_t);
        super.board.add(p2_name_t);

        super.board.add(p1_color_c);
        super.board.add(p2_color_c);

        map.addActionListener(this::map);
        back.addActionListener(this::back);
    }

    private void back(ActionEvent e) {
        new Menu().show();
        super.board.setVisible(false);
    }

    private void map(ActionEvent e) {
        Data.getInstance().set_name_1(p1_name_t.getText());
        Data.getInstance().set_name_2(p2_name_t.getText());
        int c1 = p1_color_c.getSelectedIndex(), c2 = p2_color_c.getSelectedIndex();
        if (c1 != c2) {
            Data.getInstance().set_color_1((Data.tank_color)p1_color_c.getSelectedItem());
            Data.getInstance().set_color_2((Data.tank_color)p2_color_c.getSelectedItem());
            Map m = new Map();
            m.show();
            super.board.setVisible(false);
        }
    }
}
