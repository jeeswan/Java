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

// Handler class
class ExternalHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Handled in External Class");
    }
}

public class Q17dExternalHandler extends JFrame {
    JButton button;

    Q17dExternalHandler() {
        button = new JButton("Click Me");
        button.addActionListener(new ExternalHandler());
        add(button);
        setSize(200, 100);
        setLayout(null);
        button.setBounds(50, 20, 100, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q17dExternalHandler();
    }
}