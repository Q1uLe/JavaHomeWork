package ru.mirea.prac16.task2;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String text, Color color){
        super(text);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(50, 12));
    }
}
