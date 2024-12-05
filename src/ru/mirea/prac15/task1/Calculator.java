package ru.mirea.prac15.task1;

import javax.swing.*;
import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;

public class Calculator {
    static private JTextField tf1 = new JTextField();
    static private JTextField tf2 = new JTextField();
    static private JTextField rf = new JTextField();
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
        rf.setBounds(50, 200, 250, 20);

        rf.setEditable(false);

        tf1.setDocument(new JTextFieldLimit(15));
        tf2.setDocument(new JTextFieldLimit(15));


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
        DecimalFormat format = new DecimalFormat("#.####################");
        format.setRoundingMode(RoundingMode.HALF_UP);
        switch (selectedOp){
            case PLUS -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    double ans = Double.parseDouble(op1) + Double.parseDouble(op2);
                    rf.setText(format.format(ans));
                    System.out.println(ans);
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case MINUS -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    double ans = Double.parseDouble(op1) - Double.parseDouble(op2);
                    rf.setText(format.format(ans));
                    System.out.println(ans);
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case DIVIDE -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    if (Double.parseDouble(op2) != 0){
                        double ans = Double.parseDouble(op1) / Double.parseDouble(op2);
                        rf.setText(format.format(ans));
                        System.out.println(ans);
                    }
                    else rf.setText("DIVISION BY ZERO");
                } else rf.setText("WRONG NUMBER FORMAT");
            }
            case MULTIPLY -> {
                if (isNumeric(op1) && isNumeric(op2)){
                    double ans = Double.parseDouble(op1) * Double.parseDouble(op2);
                    rf.setText(format.format(ans));
                    System.out.println(ans);
                } else rf.setText("WRONG NUMBER FORMAT");
            }
        }
    }

    public static boolean isNumeric(String str) {
//        System.out.println(str + " " + str.matches("^-?\\d+(\\.\\d+)?\\n?$"));
        return str.matches("^-?\\d+(\\.\\d+)?\\n?$");  //match a number with optional '-' and decimal.
    }
}
