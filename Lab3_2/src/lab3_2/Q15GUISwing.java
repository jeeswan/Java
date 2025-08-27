/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author wildflower
 */
import javax.swing.*;
import java.awt.*;

public class Q15GUISwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Exmple");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        ImageIcon icon = new ImageIcon("Jumino.jpeg");
        frame.setIconImage(icon.getImage());
        
        JLabel l = new JLabel(icon);
        l.setBounds(20, 10, 100, 100);
        frame.add(l);
        
        JLabel l1 = new JLabel("Write Your Name: ");
        l1.setBounds(150, 20, 150, 30);
        frame.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 60, 150, 25);
        t1.setToolTipText("Write Something... ");
        frame.add(t1);
        
        JTextArea a1 = new JTextArea();
        JScrollPane s1 = new JScrollPane(a1);
        s1.setBounds(150, 100, 150, 60);
        frame.add(s1);
        
        JCheckBox c1 = new JCheckBox("Accept");
        c1.setBounds(150, 170, 100, 25);
        frame.add(c1);
        
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(150, 200, 150, 25);
        frame.add(p1);
        
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(150, 230, 100, 25);
        r2.setBounds(150, 260, 100, 25);
        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        frame.add(r1);
        frame.add(r2);
        
        JButton b = new JButton("Submit");
        b.setBounds(150, 300, 100, 30);
        frame.add(b);
        
        String[] choices = {"Java", "Python", "C++"};
        JComboBox<String> cb = new JComboBox<>(choices);
        cb.setBounds(150, 340, 100, 25);
        frame.add(cb);
        
        frame.setVisible(true);
    }
    
}
