package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javax.swing.*;

public class Menu extends Board {
    JButton exit = new JButton("EXIT");
    JButton settings = new JButton("SETTINGS");
    JButton newgame = new JButton("START NEW GAME");

    Menu() {
        newgame.setBounds(400, 500, 200, 50);
        settings.setBounds(400, 600, 200, 50);
        exit.setBounds(400, 700, 200, 50);

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

    }

    public void exit(ActionEvent e) {
        super.board.dispose();
    }
}
