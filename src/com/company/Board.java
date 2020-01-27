package com.company;
import java.awt.*;
import javax.swing.*;

public class Board {
    JFrame board = new JFrame("TANKS");
    Data D = new Data();

    Board() {
        board.setSize(1000, 1000);
        board.getContentPane().setBackground(Color.DARK_GRAY);
        board.setResizable(false);
    }

    void show() {
        board.setLocationRelativeTo(null);
        board.setLayout(null);
        board.setVisible(true);
    }
}
