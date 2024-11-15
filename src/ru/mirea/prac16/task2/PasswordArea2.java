package ru.mirea.prac16.task2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PasswordArea2 extends JFrame {
    PasswordArea2() {
        super("Задание \"Пароль\"");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Создание панелей
        JPanel servPanel = createServArea();
        JPanel loginPanel = createLoginArea();
        JPanel passPanel = createPassArea();

        // Добавление панелей с использованием GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(servPanel, gbc);

        gbc.gridy = 1;
        add(loginPanel, gbc);

        gbc.gridy = 2;
        add(passPanel, gbc);

        setSize(400, 250);
        setLocationRelativeTo(null); // Центрирование окна на экране
        setVisible(true);
    }

    private JPanel createServArea() {
        JPanel servPanel = new JPanel(new GridLayout(1, 2));
        servPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel servLabel = new JLabel("Service:");
        JTextField servField = new JTextField();

        servPanel.add(servLabel);
        servPanel.add(servField);
        return servPanel;
    }

    private JPanel createLoginArea() {
        JPanel loginPanel = new JPanel(new GridLayout(1, 2));
        loginPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginField = new JTextField();

        loginPanel.add(loginLabel);
        loginPanel.add(loginField);
        return loginPanel;
    }

    private JPanel createPassArea() {
        JPanel passPanel = new JPanel(new GridLayout(1, 2));
        passPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(); // Используем JPasswordField для пароля

        passPanel.add(passLabel);
        passPanel.add(passField);
        return passPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordArea::new);
    }
}

