package ru.mirea.prac5.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ImageDisplay {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            System.exit(0);
        }
        String imagePath = args[0];
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.out.println("Файл не найден: " + imagePath);
            System.exit(0);
        }
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage img = ImageIO.read(imageFile);
            if (img == null) {
                System.out.println("Не удалось загрузить изображение. Возможно, формат не поддерживается.");
                System.exit(0);
            }
            Image scaledImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(scaledImg);
            JLabel imageLabel = new JLabel(imageIcon);
            frame.getContentPane().add(imageLabel, BorderLayout.CENTER);
            frame.pack();
            frame.setSize(800, 600);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
}