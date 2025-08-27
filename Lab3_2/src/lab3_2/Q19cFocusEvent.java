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

public class Q19cFocusEvent extends JFrame implements FocusListener {
    JTextField tf;

    Q19cFocusEvent() {
        tf = new JTextField(20);
        tf.addFocusListener(this);

        add(tf);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void focusGained(FocusEvent e) {
        tf.setBackground(Color.YELLOW);
    }

    public void focusLost(FocusEvent e) {
        tf.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new Q19cFocusEvent();
    }
}