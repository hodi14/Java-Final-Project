package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class NewGame extends Board{
    JLabel logo_l1 = new JLabel("       |███████|]▄▄▄▄▄▄▄▄▃");
    JLabel logo_l2 = new JLabel("▂▄▅█████████▅▄▃▂I");
    JLabel logo_l3 = new JLabel("███████████████████].");
    JLabel logo_l4 = new JLabel("  ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤  ");
    JLabel logo_l5 = new JLabel(" TANKS GAME");

    JButton map = new JButton("CHOOSE MAP");
    JButton back = new JButton("GO BACK");
    JButton p1_name_b = new JButton("PLAYER 1 NAME");
    JButton p2_name_b = new JButton("PLAYER 2 NAME");
    JButton p1_color_b = new JButton("PLAYER 1 COLOR");
    JButton p2_color_b = new JButton("PLAYER 2 COLOR");

    JTextField p1_name_t = new JTextField();
    JTextField p2_name_t = new JTextField();

    JComboBox p1_color_c = new JComboBox(tank_color.values());
    JComboBox p2_color_c = new JComboBox(tank_color.values());

    enum tank_color {
        Blue, Green, Red;
    }

    NewGame() {
        logo_l1.setBounds(200, 10, 800, 200);
        logo_l1.setFont(new Font(logo_l1.getFont().getName(), logo_l1.getFont().getStyle(), 40));
        logo_l2.setBounds(200, 60, 800, 200);
        logo_l2.setFont(new Font(logo_l2.getFont().getName(), logo_l2.getFont().getStyle(), 40));
        logo_l3.setBounds(200, 110, 800, 200);
        logo_l3.setFont(new Font(logo_l3.getFont().getName(), logo_l3.getFont().getStyle(), 40));
        logo_l4.setBounds(200, 160, 800, 200);
        logo_l4.setFont(new Font(logo_l4.getFont().getName(), logo_l4.getFont().getStyle(), 40));
        logo_l5.setBounds(100, 260, 800, 200);
        logo_l5.setFont(new Font(logo_l5.getFont().getName(), logo_l5.getFont().getStyle(), 100));

        map.setBounds(400, 650, 200, 50);
        back.setBounds(400, 750, 200, 50);
        p1_name_b.setBounds(50, 500, 200, 50);
        p2_name_b.setBounds(550, 500, 200, 50);
        p1_color_b.setBounds(50, 560, 200, 50);
        p2_color_b.setBounds(550, 560, 200, 50);

        p1_name_t.setBounds(250, 500, 200, 50);
        p2_name_t.setBounds(750, 500, 200, 50);

        p1_color_c.setBounds(250, 560, 200, 50);
        p2_color_c.setBounds(750, 560, 200, 50);

        map.setBackground(Color.GRAY);
        back.setBackground(Color.GRAY);
        p1_name_b.setBackground(Color.GRAY);
        p2_name_b.setBackground(Color.GRAY);
        p1_color_b.setBackground(Color.GRAY);
        p2_color_b.setBackground(Color.GRAY);

        logo_l1.setForeground(Color.GREEN);
        logo_l2.setForeground(Color.GREEN);
        logo_l3.setForeground(Color.GREEN);

        super.board.add(map);
        super.board.add(back);
        super.board.add(p1_name_b);
        super.board.add(p2_name_b);
        super.board.add(p1_color_b);
        super.board.add(p2_color_b);

        super.board.add(p1_name_t);
        super.board.add(p2_name_t);

        super.board.add(logo_l1);
        super.board.add(logo_l2);
        super.board.add(logo_l3);
        super.board.add(logo_l4);
        super.board.add(logo_l5);

        super.board.add(p1_color_c);
        super.board.add(p2_color_c);

        map.addActionListener(this::map);
        back.addActionListener(this::back);
    }

    public void back(ActionEvent e) {
        new Menu().show();
        super.board.setVisible(false);
    }
    public void map(ActionEvent e) {
        super.D.set_name_1(p1_name_t.getText());
        super.D.set_name_2(p2_name_t.getText());
     //   if ( (tank_color)p1_color_c.getSelectedItem() == (tank_color)p1_color_c.getSelectedItem()) {
       // }
        super.D.set_color_1((tank_color)p1_color_c.getSelectedItem());
        super.D.set_color_2((tank_color)p2_color_c.getSelectedItem());
        new Map().show();
        super.board.setVisible(false);
    }
}
