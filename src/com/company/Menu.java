package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class Menu extends Board {
    Menu() {
        JLabel logo_img = new JLabel(new ImageIcon(".\\resource\\logo.png"));
        logo_img.setBounds(110, 0, 800, 400);
        board.add(logo_img);
        JLabel name = new JLabel("  TANKS GAME");
        name.setBounds(100, 320, 800, 200);
        name.setFont(new Font(name.getFont().getName(), name.getFont().getStyle(), 100));
        name.setForeground(new Color(0, 150, 0));
        super.board.add(name);

        JButton exit = new JButton("EXIT");
        JButton settings = new JButton("SETTINGS");
        JButton newgame = new JButton("NEW GAME");

        newgame.setBounds(400, 550, 200, 50);
        settings.setBounds(400, 650, 200, 50);
        exit.setBounds(400, 750, 200, 50);

        newgame.setBackground(new Color(0, 150, 0));
        settings.setBackground(new Color(0, 150, 0));
        exit.setBackground(new Color(0, 150, 0));

        super.board.add(newgame);
        super.board.add(settings);
        super.board.add(exit);

        newgame.addActionListener(this::newgame);
        settings.addActionListener(this::settings);
        exit.addActionListener(this::exit);
    }

    private void newgame(ActionEvent e) {
        new NewGame().show();
        super.board.setVisible(false);
    }
    private void settings(ActionEvent e) {
        new Settings().show();
        super.board.setVisible(false);

    }
    private void exit(ActionEvent e) {
        super.board.dispose();
    }
}