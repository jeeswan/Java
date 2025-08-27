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

public class Q20KeyEventForMovingImage extends JFrame implements KeyListener {
    JLabel label;
    int x = 100, y = 100;
    final int STEP = 10;  // move step size

    Q20KeyEventForMovingImage() {
        setTitle("Arrow Key Image Mover");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("icon.png"); // replace with your image file
        Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // resize image
        icon = new ImageIcon(img);

        label = new JLabel(icon);
        label.setBounds(x, y, 50, 50);
        add(label);

        addKeyListener(this);
        setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            x -= STEP;
        } else if (key == KeyEvent.VK_RIGHT) {
            x += STEP;
        } else if (key == KeyEvent.VK_UP) {
            y -= STEP;
        } else if (key == KeyEvent.VK_DOWN) {
            y += STEP;
        }
        label.setLocation(x, y);
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new Q20KeyEventForMovingImage();
    }
}