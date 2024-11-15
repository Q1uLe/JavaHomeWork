package ru.mirea.prac15.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuTask extends JFrame {
    private static String clipboard = "";
    static JTextArea ta;


    public MenuTask(){
        super("Задание\"Меню\"");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createHelpMenu());
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());

        JButton btn1 = new CustomButton("button 1", Color.GRAY);
        JButton btn2 = new CustomButton("button 2", Color.GRAY);
        JPanel btnPannel = new JPanel(new FlowLayout());
        btnPannel.add(btn1);
        btnPannel.add(btn2);
        add(btnPannel, BorderLayout.NORTH);
        ta = new JTextArea("Это область в которой вы можете ввести текст");
        ta.setFont(new Font("MS Sans Serif", Font.BOLD, 12));
        add(ta, BorderLayout.CENTER);

        setJMenuBar(menuBar);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JMenu createFileMenu(){
        JMenu file = new JMenu("Файл");

        JMenuItem save = new JMenuItem("Сохранить", getSizedIcon("src/resources/save.jpg"));
//        JMenuItem save = new JMenuItem("Сохранить");

        file.add(save);


        JMenuItem exit = new JMenuItem(new ExitAction());

        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        exit.setIcon(getSizedIcon("src/resources/exit.jpg"));
        exit.setMnemonic(KeyEvent.VK_E);
        file.add(exit);

        return file;
    }

    public JMenu createEditMenu(){
        JMenu edit = new JMenu("Правка");

        JMenuItem copy = new JMenuItem(new CopyAction());
        copy.setIcon(getSizedIcon("src/resources/copy.png"));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        copy.setMnemonic(KeyEvent.VK_C);
        edit.add(copy);


//        JMenuItem cut = new JMenuItem("Вырезать", getSizedIcon("src/resources/cut.jpg"));
        JMenuItem cut = new JMenuItem(new CutAction());
        cut.setIcon(getSizedIcon("src/resources/cut.jpg"));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        cut.setMnemonic(KeyEvent.VK_X);
        edit.add(cut);

//        JMenuItem put = new JMenuItem("Вставить", getSizedIcon("src/resources/put.png"));
        JMenuItem put = new JMenuItem(new PutAction());
        put.setIcon(getSizedIcon("src/resources/put.png"));
        put.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        put.setMnemonic(KeyEvent.VK_V);
        edit.add(put);


        return edit;
    }

    public JMenu createHelpMenu(){
        return new JMenu("Справка");
    }

    public JMenu createColorMenu(){
        JMenu color = new JMenu("Цвет");
        JMenuItem blue = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "Синий");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("BLUE");
                ta.setForeground(Color.BLUE);
            }
        });

        JMenuItem red = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "Красный");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("RED");
                ta.setForeground(Color.RED);
            }
        });

        JMenuItem black = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "Черный");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("BLACK");
                ta.setForeground(Color.BLACK);
            }
        });

        color.add(blue);
        color.add(red);
        color.add(black);
        return color;
    }

    public JMenu createFontMenu(){
        JMenu fonts = new JMenu("Шрифт");

        JMenuItem msSansSerif = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "MS Sans Serif");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("MS Sans Serif", Font.BOLD, 12));
            }
        });

        JMenuItem courierNew = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "Courier New");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("Courier New", Font.BOLD, 12));
            }
        });

        JMenuItem timesNewRoman = new JMenuItem(new AbstractAction() {
            {
                putValue(NAME, "Times New Roman");
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });

        fonts.add(msSansSerif);
        fonts.add(courierNew);
        fonts.add(timesNewRoman);
        return fonts;
    }


    public ImageIcon getSizedIcon(String path){
        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    static class ExitAction extends AbstractAction
    {
        ExitAction(){
            putValue(NAME, "Выход");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    static class CopyAction extends AbstractAction
    {
        CopyAction(){
            putValue(NAME, "Копировать");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            clipboard = ta.getSelectedText();
            System.out.println(clipboard);
        }
    }

    static class CutAction extends AbstractAction
    {
        CutAction(){
            putValue(NAME, "Вырезать");
        }

        @Override
        public void actionPerformed(ActionEvent e){
            clipboard = ta.getSelectedText();
            ta.replaceSelection("");
            System.out.println(clipboard);
        }
    }

    static class PutAction extends AbstractAction
    {
        PutAction(){
            putValue(NAME, "Вставить");
        }

        @Override
        public void actionPerformed(ActionEvent e){
            ta.insert(clipboard, ta.getCaretPosition());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuTask::new);
    }
}