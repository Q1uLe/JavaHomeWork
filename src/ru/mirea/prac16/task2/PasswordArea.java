package ru.mirea.prac16.task2;

import ru.mirea.prac15.task1.JTextFieldLimit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PasswordArea extends JFrame {
    private final int TOP_BORDER = 20;
    private final int BOT_BORDER = 20;
    private JTextField servField;
    private JTextField loginField;
    private JPasswordField passField;
    private JLabel msgLabel = new JLabel();
    private boolean passVis = false;

    PasswordArea() {
        super("Задание \"Пароль\"");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        msgLabel.setHorizontalAlignment(JLabel.CENTER);

        setLayout(new GridLayout(5, 1));

        add(msgLabel);
        add(createServArea());
        add(createLoginArea());
        add(createPassArea());

        JButton btn = new CustomButton("Check", Color.GRAY);
        add(btn);
        btn.addActionListener(_ -> {
            if (!servField.getText().matches("Yandex")) {
                msgLabel.setText("Non-existent company");
            } else if (!loginField.getText().matches("^abraa@yandex.com$")) {
                msgLabel.setText("Non-existent login");
            } else if (!passField.getText().matches("LearningChinese1990")) {
                msgLabel.setText("WRONG PASSWORD");
            } else {
                msgLabel.setText("Authorization successes");
            }
        });


        setSize(500, 400);
        setResizable(false);
        setVisible(true);
    }

    private JPanel createServArea() {
        JPanel servPanel = new JPanel();
//        servPanel.setLayout(new GridLayout(0, 2));
        servPanel.setLayout(new BoxLayout(servPanel, BoxLayout.X_AXIS));
        servPanel.setBorder(new EmptyBorder(TOP_BORDER, 50, BOT_BORDER, 10));


        JLabel serv = new JLabel("Service:");
        serv.setSize(100,15);

        serv.setMinimumSize(new Dimension(60, 15));
        serv.setPreferredSize(new Dimension(60, 15));
        serv.setMaximumSize(new Dimension(60, 15));

        serv.setHorizontalAlignment(JLabel.LEFT);
        serv.setAlignmentX(Component.LEFT_ALIGNMENT);
        servField = new JTextField(40);
        servField.setDocument(new JTextFieldLimit(25));
//        servField.setSize(500, 10);

        servPanel.add(serv);
        servPanel.add(servField);
        return servPanel;
    }

    private JPanel createLoginArea() {
        JPanel loginPanel = new JPanel();
//        loginPanel.setLayout(new FlowLayout());
//        loginPanel.setLayout(new GridLayout(0, 2));
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.X_AXIS));
        loginPanel.setBorder(new EmptyBorder(TOP_BORDER, 50, BOT_BORDER, 10));

        JLabel login = new JLabel("Login:");
        login.setSize(100, 15);

        login.setMinimumSize(new Dimension(60, 15));
        login.setPreferredSize(new Dimension(60, 15));
        login.setMaximumSize(new Dimension(60, 15));

        login.setHorizontalAlignment(JLabel.LEFT);
        login.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginField = new JTextField();
        loginField.setSize(1000, 15);
        loginField.setDocument(new JTextFieldLimit(25));

        loginPanel.add(login);
        loginPanel.add(loginField);
        return loginPanel;
    }

    private JPanel createPassArea() {
        JPanel passPanel = new JPanel();
//        passPanel.setLayout(new FlowLayout());
//        passPanel.setLayout(new GridLayout(0, 3));
        passPanel.setLayout(new BoxLayout(passPanel, BoxLayout.X_AXIS));
        passPanel.setBorder(new EmptyBorder(TOP_BORDER, 50, BOT_BORDER, 10));

        JLabel pass = new JLabel("Password:");

        pass.setSize(100, 15);
        pass.setMinimumSize(new Dimension(60, 15));
        pass.setPreferredSize(new Dimension(60, 15));
        pass.setMaximumSize(new Dimension(60, 15));

        pass.setAlignmentX(Component.LEFT_ALIGNMENT);
        passField = new JPasswordField();
        passField.setSize(1000, 15);

        passField.setDocument(new JTextFieldLimit(25));

        JButton eyeButton = new JButton("🙉");
        eyeButton.setPreferredSize(new Dimension(40, 40));

        eyeButton.setMinimumSize(new Dimension(50, 50));
        eyeButton.setPreferredSize(new Dimension(50, 50));
        eyeButton.setMaximumSize(new Dimension(50, 50));

        eyeButton.setFocusPainted(false);
        eyeButton.addActionListener(_ -> {
                    passVis = !passVis;
                    if (passVis) {
                        passField.setEchoChar((char) 0);
                        eyeButton.setText("🙈");
                    } else {
                        passField.setEchoChar('*');
                        eyeButton.setText("🙉");
                    }
                }
        );

        passPanel.add(pass);
        passPanel.add(passField);
        passPanel.add(eyeButton);
        return passPanel;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordArea::new);
    }
}
