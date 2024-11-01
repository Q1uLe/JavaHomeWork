package ru.mirea.prac12.task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDisplay_OLD {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        File imageFile = null;
        if (args.length == 0) {
            JFileChooser fileChooser = new JFileChooser("D:\\Учеба\\OSRL2\\Lab1\\src\\ru\\mirea\\prac5\\task3\\pictures");
            fileChooser.setDialogTitle("Выберите изображение для отображения");
            int result = fileChooser.showOpenDialog(frame);
            if (result != JFileChooser.APPROVE_OPTION) {
                System.out.println("Файл не выбран, завершение программы.");
                System.exit(0);
            }
            imageFile = fileChooser.getSelectedFile();
        }

        if (args.length != 0) {
            String imagePath = args[0];
            imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.out.println("Файл не найден: " + imagePath);
                System.exit(0);
            }
        }

        try {
            BufferedImage img = ImageIO.read(imageFile);
            if (img == null) {
                System.out.println("Не удалось загрузить изображение. Возможно, формат не поддерживается.");
                System.exit(0);
            }


            CustomButton button1 = new CustomButton("Выбрать", Color.GRAY);
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(Box.createHorizontalGlue());
            buttonPanel.add(button1);
            frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
            button1.addActionListener(_->System.out.println());

            ImagePanel imagePanel = new ImagePanel(img);
            frame.getContentPane().add(imagePanel, BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setVisible(true);
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
    public void updateImage(){}
}

