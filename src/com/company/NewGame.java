package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class NewGame extends Board{
    JButton start = new JButton("START");
    JButton back = new JButton("GO BACK");
    JButton p1_name_b = new JButton("ENTER PLAYER 1 NAME");
    JButton p2_name_b = new JButton("ENTER PLAYER 2 NAME");

    JTextField p1_name_t = new JTextField();
    JTextField p2_name_t = new JTextField();

    String p1_name, p2_name;

    Data D = new Data();

    NewGame() {
        start.setBounds(400, 600, 200, 50);
        back.setBounds(400, 700, 200, 50);
        p1_name_b.setBounds(50, 400, 200, 50);
        p2_name_b.setBounds(550, 400, 200, 50);

        p1_name_t.setBounds(250, 400, 200, 50);
        p2_name_t.setBounds(750, 400, 200, 50);

        super.board.add(start);
        super.board.add(back);
        super.board.add(p1_name_b);
        super.board.add(p2_name_b);
        super.board.add(p1_name_t);
        super.board.add(p2_name_t);

        start.addActionListener(this::start);
        back.addActionListener(this::back);
        p1_name_b.addActionListener(this::p1_set_name);
        p2_name_b.addActionListener(this::p2_set_name);
    }

    public void back(ActionEvent e) {
        new Menu().show();
        super.board.setVisible(false);
    }

    public void start(ActionEvent e) {

    }

    public void p1_set_name(ActionEvent e) {
        p1_name = p1_name_t.getText();
        D.set_name_1(p1_name);
    }

    public void p2_set_name(ActionEvent e) {
        p2_name = p2_name_t.getText();
        D.set_name_2(p2_name);
    }

}
