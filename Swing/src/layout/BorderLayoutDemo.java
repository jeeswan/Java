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
public class BorderLayoutDemo {
    JFrame jFrame;
    
    public BorderLayoutDemo(){
        jFrame = new JFrame();
        
        JButton btn1 = new JButton("NORTH");
        JButton btn2 = new JButton("SOUTH");
        JButton btn3 = new JButton("EAST");
        JButton btn4 = new JButton("WEST");
        JButton btn5 = new JButton("CENTER");
        
        jFrame.setLayout(new BorderLayout(20, 15));
        jFrame.add(btn1, BorderLayout.NORTH);
        jFrame.add(btn2, BorderLayout.SOUTH);
        jFrame.add(btn3, BorderLayout.EAST);
        jFrame.add(btn4, BorderLayout.WEST);
        jFrame.add(btn5, BorderLayout.CENTER);
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
    
    public static void main(String [] args){
        new BorderLayoutDemo();
    }
}
