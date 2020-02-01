package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class key  implements KeyListener {
        @Override
        public void keyTyped(KeyEvent keyEvent) {
            System.out.print("hi");
        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            System.out.print("hell");
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {
            System.out.print("ok");
        }
}

