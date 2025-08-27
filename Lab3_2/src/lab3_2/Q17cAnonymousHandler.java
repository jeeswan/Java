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

public class Q17cAnonymousHandler extends JFrame {
    JButton button;

    Q17cAnonymousHandler() {
        button = new JButton("Click Me");
        add(button);
        setSize(200, 100);
        setLayout(null);
        button.setBounds(50, 20, 100, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Handled in Anonymous Inner Class");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q17cAnonymousHandler();
    }
}
