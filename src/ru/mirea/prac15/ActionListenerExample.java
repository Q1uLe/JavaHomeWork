package ru.mirea.prac15;

import javax.swing.*;
import java.awt.*;
public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("ActionListener Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final TextField tf=new TextField();
        tf.setBounds(50,50, 250,20);
        Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        b.setSize(100,50);
        b.addActionListener(_ -> tf.setText("Добро пожаловать в мир " +
                "Джава."));
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
