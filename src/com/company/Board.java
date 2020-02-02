package com.company;
import java.awt.*;
import javax.swing.*;

public class Board extends JFrame{
    JFrame board = new JFrame("TANKS");
    public Data D = Data.getInstance();

    Board() {
        board.setSize(1000, 1000);
        board.getContentPane().setBackground(Color.DARK_GRAY);
        board.setResizable(false);
    }

    public void show() {
        board.setLocationRelativeTo(null);
        board.setLayout(null);
        board.setVisible(true);
    }
}
