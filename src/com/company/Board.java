package com.company;

import java.awt.*;
import javax.swing.*;

public class Board{
    JFrame board = new JFrame("TANKS");
    Data D = Data.getInstance();

    Board() {
        board.setSize(1000, 1000);
        board.getContentPane().setBackground(Color.DARK_GRAY);
        board.setResizable(false);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        board.setLocationRelativeTo(null);
        board.setLayout(null);
        board.setVisible(true);
    }
}
