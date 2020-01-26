package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Map extends Board {
    JButton back = new JButton("GO BACK");

    Map() {
        back.setBounds(400, 750, 200, 50);

        back.setBackground(Color.GRAY);

        super.board.add(back);

        back.addActionListener(this::back);
    }

    public void back(ActionEvent e) {
        new Menu().show();
        super.board.setVisible(false);
    }
}
