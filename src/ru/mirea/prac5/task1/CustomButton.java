package ru.mirea.prac5.task1;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String text, Color color){
        super(text);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(460, 100));
//        this.setForeground(color);
    }
}
