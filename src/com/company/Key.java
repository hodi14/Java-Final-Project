package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.println("t");
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println("p");
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println("r");
    }
}
