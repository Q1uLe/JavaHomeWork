package ru.mirea.prac12.task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDisplay extends JFrame {
    File imageFile;
    ImagePanel imagePanel;
    public ImageDisplay(){
        super();
        setTitle("Image Display");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        chooseFile();
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
            getContentPane().add(buttonPanel, BorderLayout.NORTH);
            button1.addActionListener(_->updateBtn());

            imagePanel = new ImagePanel(img);
            getContentPane().add(imagePanel, BorderLayout.CENTER);
            setSize(800, 600);
            setVisible(true);
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }

    public void updateBtn() {
        try {
            chooseFile();
            updatePicture();
//            setVisible(true);
            repaint();
        } catch (IOException e){
            System.out.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }

    public void chooseFile(){
        JFileChooser fileChooser = new JFileChooser("D:\\Учеба\\OSRL2\\Lab1\\src\\ru\\mirea\\prac5\\task3\\pictures");
        fileChooser.setDialogTitle("Выберите изображение для отображения");
        int result = fileChooser.showOpenDialog(this);
        if (result != JFileChooser.APPROVE_OPTION && imageFile == null) {
            System.out.println("Файл не выбран, завершение программы.");
            System.exit(0);
        }
        else if (result == JFileChooser.APPROVE_OPTION) imageFile = fileChooser.getSelectedFile();
    }

    public void updatePicture() throws IOException {
        BufferedImage img = ImageIO.read(imageFile);
        if (img == null) {
            System.out.println("Не удалось загрузить изображение. Возможно, формат не поддерживается.");
            System.exit(0);
        }
        imagePanel.updateImage(img);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageDisplay::new);
    }
}
