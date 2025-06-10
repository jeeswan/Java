/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layout;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author wildflower
 */
public class CalculatorInterface {
    JFrame f;
    public CalculatorInterface() {
        f = new JFrame("Calculator");

        // Text display
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        f.add(display, BorderLayout.NORTH);

        // Create a panel for buttons using GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        // Define all buttons
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("/");
        JButton b11 = new JButton("*");
        JButton b12 = new JButton("+");
        JButton b13 = new JButton("-");
        JButton b14 = new JButton("%");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton(".");
        JButton b17 = new JButton("C");
        JButton b18 = new JButton(")");
        JButton b19 = new JButton("(");

        // Add buttons to panel in proper order
        panel.add(b7); panel.add(b8); panel.add(b9); panel.add(b10);
        panel.add(b4); panel.add(b5); panel.add(b6); panel.add(b11);
        panel.add(b1); panel.add(b2); panel.add(b3); panel.add(b13);
        panel.add(b0); panel.add(b16); panel.add(b15); panel.add(b12);
        panel.add(b17); panel.add(b19); panel.add(b18); panel.add(b14);

        // Add the panel to the center of the frame
        f.add(panel, BorderLayout.CENTER);

        // Frame settings
        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        new CalculatorInterface();
    }
}
