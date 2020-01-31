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
    JButton life_b = new JButton("STARTING LIFE");
    JButton bullet_pb = new JButton("BULLET POWER");
    JButton bullet_nb = new JButton("BUULET NUMBER");

    JTextField bullet_pt = new JTextField("5");
    JTextField life_t = new JTextField("100");
    JTextField bullet_nt = new JTextField("20");

    Graphics graphics = super.board.getGraphics();

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

        life_b.setBounds(300, 450, 200, 50);
        bullet_pb.setBounds(300, 550, 200, 50);
        bullet_nb.setBounds(300, 650, 200, 50);
        back.setBounds(400, 750, 200, 50);

        back.setBackground(Color.GRAY);
        life_b.setBackground(Color.GRAY);
        bullet_pb.setBackground(Color.GRAY);
        bullet_nb.setBackground(Color.GRAY);

        super.board.add(back);
        super.board.add(life_b);
        super.board.add(bullet_nb);
        super.board.add(bullet_pb);

        life_t.setBounds(500, 450, 200, 50);
        bullet_pt.setBounds(500, 550, 200, 50);
        bullet_nt.setBounds(500, 650, 200, 50);

        super.board.add(life_t);
        super.board.add(bullet_pt);
        super.board.add(bullet_nt);

        back.addActionListener(this::back);
    }

    public void back(ActionEvent e) {
        try {
             int l = Integer.parseInt(life_t.getText());
             int bn = Integer.parseInt(bullet_nt.getText());
             int bp = Integer.parseInt(bullet_pt.getText());
            super.D.set_life(l);
            super.D.set_bullet_p(bp);
            super.D.set_bullet_n(bn);
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
