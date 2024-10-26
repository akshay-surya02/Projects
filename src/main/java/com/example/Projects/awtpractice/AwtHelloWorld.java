package com.example.Projects.awtpractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtHelloWorld {

    public static void main(String[] args) {
        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello World !");
        label.setAlignment(Label.CENTER);

        frame.add(label);
        frame.setSize(200,200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //close window after click on cross button
                System.exit(0);
            }
        });
    }
}
