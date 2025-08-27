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

public class Q16aFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);

        frame.add(new JButton("Java"));
        frame.add(new JButton("Python"));
        frame.add(new JButton("Dot Net"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
