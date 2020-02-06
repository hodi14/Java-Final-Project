package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.*;

class Map extends Board {
    private String[] map_numbers = {"Map 1", "Map 2", "Map 3", "Map 4", "Map 5", "Map 6"};
    private JComboBox map_number = new JComboBox(map_numbers);

    Map() {
        JButton back = new JButton("GO BACK");
        JButton start = new JButton("START THE GAME");
        JButton map = new JButton("MAP NUMBER");

        map.setBounds(300, 550, 200, 50);
        back.setBounds(400, 750, 200, 50);
        start.setBounds(400, 650, 200, 50);

        map_number.setBounds(500, 550, 200, 50);

        back.setBackground(Color.GRAY);
        start.setBackground(Color.GRAY);
        map.setBackground(Color.GRAY);

        super.board.add(start);
        super.board.add(back);
        super.board.add(map);

        super.board.add(map_number);

        start.addActionListener(this::start);
        back.addActionListener(this::back);
    }

    private void start(ActionEvent e) {
        char mc = (Objects.requireNonNull(map_number.getSelectedItem()).toString()).charAt(4);
        int mi = Character.getNumericValue(mc);
        Data.getInstance().set_map(mi);
        new GamePlay();
        super.board.setVisible(false);
    }
    private void back(ActionEvent e) {
        new NewGame().show();
        super.board.setVisible(false);
    }

    public void paint(Graphics g) {

        int width = 600;    //width of the image
        int height = 553;   //height of the image

        // For storing image in RAM
        BufferedImage image = null;

        // READ IMAGE
        try
        {
            File input_file = new File("C:\\Users\\amir-negar\\Desktop\\MAP1.jpg"); //image file path
            image = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(input_file);
            System.out.println("RI");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
        if (image != null) {
            g.drawImage(image, 100, 100, 200,300, this);
            System.out.println("pI");
        }
        super.paint(g);
    }
}
