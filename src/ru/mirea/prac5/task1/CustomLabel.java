package ru.mirea.prac5.task1;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {

    public CustomLabel(String text){
        super(text);
    }

    public CustomLabel(String text, Color color){
        super(text);
        setForeground(color);
        this.setAlignmentX(0.5f);
    }
}
