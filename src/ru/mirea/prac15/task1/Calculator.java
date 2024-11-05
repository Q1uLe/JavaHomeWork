package ru.mirea.prac15.task1;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Calculator {
    static private TextField tf1 = new TextField();
    static private TextField tf2 = new TextField();
    static private TextField rf = new TextField();
    public static void main(String[] args) {
        JFrame f=new JFrame("ActionListener Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<Operators> cb = new JComboBox<>();
        cb.addItem(Operators.PLUS);
        cb.addItem(Operators.MINUS);
        cb.addItem(Operators.DIVIDE);
        cb.addItem(Operators.MULTIPLY);

        tf1.setBounds(50,50, 250,20);
        cb.setBounds(50, 100, 250, 20);
        tf2.setBounds(50,150, 250,20);
        rf.setBounds(50, 200, 200, 20);


        Button b=new Button("Click Here");
        b.setBounds(50,250,60,30);
        b.setSize(100,50);
        b.addActionListener(_->calculate((Operators) Objects.requireNonNull(cb.getSelectedItem())));

        f.add(b);
        f.add(tf1);
        f.add(cb);
        f.add(tf2);
        f.add(rf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void calculate(Operators selectedOp){
        String op1 = tf1.getText();
        String op2 = tf2.getText();
        switch (selectedOp){
            case PLUS -> {
                if (isNumeric(op1) && isNumeric(op2)){
                     rf.setText(String.valueOf(Double.parseDouble(op1) + Double.parseDouble(op2)));
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case MINUS -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    rf.setText(String.valueOf(Double.parseDouble(op1) - Double.parseDouble(op2)));
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case DIVIDE -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    if (Double.parseDouble(op2) != 0){
                        rf.setText(String.valueOf(Double.parseDouble(op1) / Double.parseDouble(op2)));
                    }
                    else rf.setText("DIVISION BY ZERO");
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case MULTIPLY -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    rf.setText(String.valueOf(Double.parseDouble(op1) * Double.parseDouble(op2)));
                } else rf.setText("WRONG NUMBER FORMAT");
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("^-?\\d+(.\\d+)?\\n?$");  //match a number with optional '-' and decimal.
    }
}
