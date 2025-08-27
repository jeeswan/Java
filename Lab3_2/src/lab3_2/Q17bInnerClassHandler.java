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

public class Q17bInnerClassHandler extends JFrame {
    JButton button;

    Q17bInnerClassHandler() {
        button = new JButton("Click Me");
        add(button);
        setSize(200, 100);
        setLayout(null);
        button.setBounds(50, 20, 100, 30);
        button.addActionListener(new ButtonHandler());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Handled in Inner Class");
        }
    }

    public static void main(String[] args) {
        new Q17bInnerClassHandler();
    }
}