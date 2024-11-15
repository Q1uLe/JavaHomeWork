package ru.mirea.prac16;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class ShortCut extends JFrame {
    public ShortCut() {
        initUI();
    }
    private void initUI() {
        createMenuBar();
        setTitle("Выбор меню");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void createMenuBar() {
        var menuBar = new JMenuBar();
        var iconNew = new
                ImageIcon("src/resources/new.png");
        var iconOpen = new
                ImageIcon("src/resources/open.png");
        var iconSave = new
                ImageIcon("src/resources/save.png");
        var iconExit = new
                ImageIcon("src/resources/exit.png");
        var fileMenu = new JMenu("Файл");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        var newMenuItem = new JMenuItem(new
                MenuItemAction("Создать файл", iconNew,
                KeyEvent.VK_N));
        var openMenuItem = new JMenuItem(new
                MenuItemAction("Открыть файл", iconOpen,
                KeyEvent.VK_O));
        var saveMenuItem = new JMenuItem(new
                MenuItemAction("Сохранить файл", iconSave,
                KeyEvent.VK_S));
        var exitMenuItem = new JMenuItem("Выход",
                iconExit);
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.setToolTipText("Выход из приложения");

                exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
                        InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener((event) ->
                System.exit(0));
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }
    private class MenuItemAction extends
            AbstractAction {
        public MenuItemAction(String text, ImageIcon
                icon,
                              Integer mnemonic) {
            super(text);
            putValue(SMALL_ICON, icon);
            putValue(MNEMONIC_KEY, mnemonic);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
        }
    }
    public static void main(String[] args) {
         /* java.awt.EventQueue.invokeLater(new
        Runnable() {
         public void run() {
         new ShortCut().setVisible(true);
         }
         });
 */
        EventQueue.invokeLater(() -> {
            var ex = new ShortCut();
            ex.setVisible(true);
        });
    }
}