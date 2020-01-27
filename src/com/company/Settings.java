package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Settings extends Board {
    JLabel logo_l1 = new JLabel("       |███████|]▄▄▄▄▄▄▄▄▃");
    JLabel logo_l2 = new JLabel("▂▄▅█████████▅▄▃▂I");
    JLabel logo_l3 = new JLabel("███████████████████].");
    JLabel logo_l4 = new JLabel("  ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤  ");
    JLabel logo_l5 = new JLabel(" TANKS GAME");

    JButton back = new JButton("GO BACK");

    Settings() {
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

        super.board.add(logo_l1);
        super.board.add(logo_l2);
        super.board.add(logo_l3);
        super.board.add(logo_l4);
        super.board.add(logo_l5);

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
