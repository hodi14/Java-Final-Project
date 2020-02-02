package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Menu extends Board {
    JLabel logo_l1 = new JLabel("       |███████|]▄▄▄▄▄▄▄▄▃");
    JLabel logo_l2 = new JLabel("▂▄▅█████████▅▄▃▂I");
    JLabel logo_l3 = new JLabel("███████████████████].");
    JLabel logo_l4 = new JLabel("  ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤  ");
    JLabel logo_l5 = new JLabel(" TANKS GAME");

    JButton exit = new JButton("EXIT");
    JButton settings = new JButton("SETTINGS");
    JButton newgame = new JButton("NEW GAME");

    Menu() {
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

        logo_l1.setForeground(Color.GREEN);
        logo_l2.setForeground(Color.GREEN);
        logo_l3.setForeground(Color.GREEN);

        newgame.setBounds(400, 550, 200, 50);
        settings.setBounds(400, 650, 200, 50);
        exit.setBounds(400, 750, 200, 50);

        super.board.add(logo_l1);
        super.board.add(logo_l2);
        super.board.add(logo_l3);
        super.board.add(logo_l4);
        super.board.add(logo_l5);

        newgame.setBackground(Color.GRAY);
        settings.setBackground(Color.GRAY);
        exit.setBackground(Color.GRAY);

        super.board.add(newgame);
        super.board.add(settings);
        super.board.add(exit);

        newgame.addActionListener(this::newgame);
        settings.addActionListener(this::settings);
        exit.addActionListener(this::exit);
    }

    public void newgame(ActionEvent e) {
        new NewGame().show();
        super.board.setVisible(false);
    }
    public void settings(ActionEvent e) {
        new Settings().show();
        super.board.setVisible(false);

    }
    public void exit(ActionEvent e) {
        super.board.dispose();
    }
}