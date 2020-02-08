package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GameOver extends Board {
    GameOver(String winner_s, Color c) {
        JLabel winner_j = new JLabel(winner_s + "  WON");
        winner_j.setBounds(200, 300, 800, 200);
        winner_j.setFont(new Font(winner_j.getFont().getName(), winner_j.getFont().getStyle(), 80));
        winner_j.setForeground(c);
        board.add(winner_j);

        JButton rematch = new JButton("REMATCH");
        rematch.setBounds(400, 650, 200, 50);
        rematch.setBackground(Color.LIGHT_GRAY);
        board.add(rematch);
        rematch.addActionListener(this::rematch);

        JButton back = new JButton("GO BACK TO MAIN MENU");
        back.setBounds(400, 750, 200, 50);
        back.setBackground(Color.LIGHT_GRAY);
        board.add(back);
        back.addActionListener(this::back);
    }

    private void back(ActionEvent e) {
        new Menu().show();
        board.setVisible(false);
    }

    private void rematch(ActionEvent e) {
        Data.getInstance().set_life(Data.getInstance().starting_life);
        Data.getInstance().set_bullet_n(Data.getInstance().starting_bullet);
        new GamePlay();
        board.setVisible(false);
    }
}
