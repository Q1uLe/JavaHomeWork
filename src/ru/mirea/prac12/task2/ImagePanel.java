package ru.mirea.prac12.task2;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(BufferedImage image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int width = getWidth();
            int height = getHeight();
            g.drawImage(image, 0, 0, width, height, this);
        }
    }

    public void updateImage(BufferedImage image){ this.image = image; }
}