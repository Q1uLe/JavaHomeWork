package ru.mirea.prac15.task3;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String text, Color color){
        super(text);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(100, 25));
    }
}
