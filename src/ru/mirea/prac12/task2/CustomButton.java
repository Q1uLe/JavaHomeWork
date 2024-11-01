package ru.mirea.prac12.task2;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String text, Color color){
        super(text);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(100, 50));
//        this.setForeground(color);
    }
}
