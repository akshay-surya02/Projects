package com.example.Projects.awtpractice;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonExample {
    public static void main(String[] args) {
        Frame frame =  new Frame("Button Exmaple");
        Button button = new Button("click here");

        button.setBounds(80,100,70,30);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
