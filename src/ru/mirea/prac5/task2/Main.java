package ru.mirea.prac5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JFrame {
    public Color getRandomColor(){
        Random random = new Random();
        return switch (random.nextInt(5) + 1){
            case 1 -> Color.RED;
            case 2 -> Color.BLUE;
            case 3 -> Color.CYAN;
            case 4 -> Color.GREEN;
            case 5 -> Color.YELLOW;
            default -> Color.BLACK;
        };
    }

    Main(){
        super();
        setTitle("Random shapes");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 4));



        setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
