package ru.mirea.prac5.learn;

import javax.swing.*;

public class Learn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button = new JButton("Press me");
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
