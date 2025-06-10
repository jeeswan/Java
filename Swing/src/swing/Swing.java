/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing;

/**
 *
 * @author wildflower
 */

import javax.swing.*;

public class Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        
        JButton button = new JButton("Click Me");
        
        button.setBounds(150, 200, 220, 50);
        
        frame.add(button);
        
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
