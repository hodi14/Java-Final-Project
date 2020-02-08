package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

class Settings extends Board {
    private JTextField bullet_pt = new JTextField("5");
    private JTextField life_t = new JTextField("100");
    private JTextField bullet_nt = new JTextField("20");

    Settings() {
        JLabel logo_img = new JLabel(new ImageIcon(".\\resource\\logo.png"));
        logo_img.setBounds(110, 0, 800, 400);
        board.add(logo_img);
        JLabel name = new JLabel("  TANKS GAME");
        name.setBounds(100, 320, 800, 200);
        name.setFont(new Font(name.getFont().getName(), name.getFont().getStyle(), 100));
        name.setForeground(new Color(0, 150, 0));
        super.board.add(name);

        JButton back = new JButton("GO BACK");
        JButton life_b = new JButton("STARTING LIFE");
        JButton bullet_pb = new JButton("BULLET POWER");
        JButton bullet_nb = new JButton("BUULET NUMBER");

        life_b.setBounds(300, 550, 200, 50);
        bullet_pb.setBounds(300, 650, 200, 50);
        bullet_nb.setBounds(300, 750, 200, 50);
        back.setBounds(400, 850, 200, 50);

        back.setBackground(new Color(0, 150, 0));
        life_b.setBackground(new Color(0, 150, 0));
        bullet_pb.setBackground(new Color(0, 150, 0));
        bullet_nb.setBackground(new Color(0, 150, 0));

        super.board.add(back);
        super.board.add(life_b);
        super.board.add(bullet_nb);
        super.board.add(bullet_pb);

        life_t.setBounds(500, 550, 200, 50);
        bullet_pt.setBounds(500, 650, 200, 50);
        bullet_nt.setBounds(500, 750, 200, 50);

        super.board.add(life_t);
        super.board.add(bullet_pt);
        super.board.add(bullet_nt);

        back.addActionListener(this::back);
    }

    private void back(ActionEvent e) {
        try {
             int l = Integer.parseInt(life_t.getText());
             int bn = Integer.parseInt(bullet_nt.getText());
             int bp = Integer.parseInt(bullet_pt.getText());
            Data.getInstance().set_life(l);
            Data.getInstance().set_bullet_p(bp);
            Data.getInstance().set_bullet_n(bn);
            new Menu().show();
            super.board.setVisible(false);
        }
        catch (Exception e1){
               life_t.setText("*");
               bullet_nt.setText("*");
               bullet_pt.setText("*");
        }

    }
}
