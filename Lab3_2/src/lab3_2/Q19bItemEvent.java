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

public class Q19bItemEvent extends JFrame implements ItemListener {
    JCheckBox checkBox;

    Q19bItemEvent() {
        checkBox = new JCheckBox("Click Me");
        checkBox.addItemListener(this);

        add(checkBox);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (checkBox.isSelected())
            System.out.println("Checkbox Checked");
        else
            System.out.println("Checkbox Unchecked");
    }

    public static void main(String[] args) {
        new Q19bItemEvent();
    }
}