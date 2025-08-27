/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_2;

/**
 *
 * @author wildflower
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q21MenuPopup extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem cutItem, copyItem, pasteItem, exitItem;
    JCheckBoxMenuItem showLineNumbers;
    JRadioButtonMenuItem lightTheme, darkTheme;
    JMenu viewMenu;

    Q21MenuPopup() {
        setTitle("Menu Demo");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Text Area
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        cutItem = new JMenuItem("Cut");
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cutItem.addActionListener(this);

        copyItem = new JMenuItem("Copy");
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        pasteItem = new JMenuItem("Paste");
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        exitItem.addActionListener(this);

        fileMenu.add(cutItem);
        fileMenu.add(copyItem);
        fileMenu.add(pasteItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // View Menu with Checkable Item
        viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);

        showLineNumbers = new JCheckBoxMenuItem("Show Line Numbers");
        viewMenu.add(showLineNumbers);

        // Theme Submenu with Radio Buttons
        JMenu themeSubmenu = new JMenu("Theme");
        lightTheme = new JRadioButtonMenuItem("Light");
        darkTheme = new JRadioButtonMenuItem("Dark");

        ButtonGroup themeGroup = new ButtonGroup();
        themeGroup.add(lightTheme);
        themeGroup.add(darkTheme);
        darkTheme.setSelected(true);

        themeSubmenu.add(lightTheme);
        themeSubmenu.add(darkTheme);
        viewMenu.add(themeSubmenu);

        // Disable "Paste" initially
        pasteItem.setEnabled(false);

        // Main Menu Bar
        menuBar.add(fileMenu);
        menuBar.add(viewMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cutItem) {
            textArea.cut();
            pasteItem.setEnabled(true);  // Enable paste when something is cut
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Q21MenuPopup();
    }
}