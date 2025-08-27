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

public class Q17aSameClassHandler extends JFrame implements ActionListener {
    JButton button;

    Q17aSameClassHandler() {
        button = new JButton("Click Me");
        button.addActionListener(this);
        add(button);
        setSize(200, 100);
        setLayout(null);
        button.setBounds(50, 20, 100, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Handled in Same Class");
    }

    public static void main(String[] args) {
        new Q17aSameClassHandler();
    }
}