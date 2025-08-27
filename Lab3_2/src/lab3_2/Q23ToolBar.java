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
import java.awt.*;
import java.awt.event.*;

public class Q23ToolBar extends JFrame {
    public Q23ToolBar() {
        setTitle("Toolbar Dialog Demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a toolbar
        JToolBar toolbar = new JToolBar();

        // Modal Dialog Button
        JButton modalBtn = new JButton("Modal Dialog");
        modalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog modalDialog = new JDialog(Q23ToolBar.this, "Modal Dialog", true); // true = modal
                modalDialog.setSize(250, 150);
                modalDialog.setLocationRelativeTo(Q23ToolBar.this);
                modalDialog.add(new JLabel("This is a modal dialog", SwingConstants.CENTER));
                modalDialog.setVisible(true);
            }
        });

        // Modeless Dialog Button
        JButton modelessBtn = new JButton("Modeless Dialog");
        modelessBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog modelessDialog = new JDialog(Q23ToolBar.this, "Modeless Dialog", false); // false = modeless
                modelessDialog.setSize(250, 150);
                modelessDialog.setLocationRelativeTo(Q23ToolBar.this);
                modelessDialog.add(new JLabel("This is a modeless dialog", SwingConstants.CENTER));
                modelessDialog.setVisible(true);
            }
        });

        // Add buttons to toolbar
        toolbar.add(modalBtn);
        toolbar.add(modelessBtn);

        // Add toolbar to frame
        add(toolbar, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q23ToolBar();
    }
}