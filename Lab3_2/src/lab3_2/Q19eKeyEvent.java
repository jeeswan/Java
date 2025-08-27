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
import java.awt.*;

public class Q19eKeyEvent extends JFrame implements KeyListener{
    JTextField tf;
    
    Q19eKeyEvent(){
        tf = new JTextField(20);
        tf.addKeyListener(this);
        
        add(tf);
        setLayout(new FlowLayout());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void keyTyped(KeyEvent e){
        System.out.println("Key Typed: " + e.getKeyChar());
    }
    public void keyPressed(KeyEvent e){
        System.out.println("Key Pressed: " + e.getKeyCode());
    }
    public void keyReleased(KeyEvent e){
        System.out.println("Key Released");
    }
    
    public static void main(String[] args){
        new Q19eKeyEvent();
    }
}
