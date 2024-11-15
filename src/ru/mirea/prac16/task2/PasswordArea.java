package ru.mirea.prac16.task2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PasswordArea extends JFrame{
    PasswordArea(){
        super("Задание \"Пароль\"");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 4));

        add(createServArea());
        add(createLoginArea());
        add(createPassArea());


        setSize(500, 300);
        setResizable(false);
        setVisible(true);
    }

    private JPanel createServArea(){
        JPanel servPanel = new JPanel();
        servPanel.setLayout(new GridLayout(0, 2));
        servPanel.setBorder(new EmptyBorder(30, 50, 30, 10));


        JLabel serv = new JLabel("Service:");
        JTextField servField = new JTextField(40);
//        servField.setSize(500, 10);

        servPanel.add(serv);
        servPanel.add(servField);
        return servPanel;
    }

    private JPanel createLoginArea(){
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new FlowLayout());
        loginPanel.setLayout(new GridLayout(0, 2));
        loginPanel.setBorder(new EmptyBorder(30, 50, 30, 10));

        JLabel login = new JLabel("Login:");
        login.setSize(100, 15);
        JTextField loginField = new JTextField();
        loginField.setSize(1000, 15);

        loginPanel.add(login);
        loginPanel.add(loginField);
        return loginPanel;
    }

    private JPanel createPassArea(){
        JPanel passPanel = new JPanel();
        passPanel.setLayout(new FlowLayout());
        passPanel.setLayout(new GridLayout(0, 2));
        passPanel.setBorder(new EmptyBorder(30, 50, 30, 10));

        JLabel pass = new JLabel("Password:");
        pass.setSize(100, 15);
        JPasswordField passField = new JPasswordField();
        passField.setSize(1000, 15);

        passPanel.add(pass);
        passPanel.add(passField);
        return passPanel;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordArea::new);
    }
}
