/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;
import javax.swing.*;

/**
 *
 * @author wildflower
 */
public class MenuDemo {
    JMenu menu, test, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    
    public MenuDemo(){
        JFrame f= new JFrame("ACHS College");
        JMenuBar mn = new JMenuBar();
        menu = new JMenu("Menu");
        test = new JMenu("Hello");        
        submenu = new JMenu("Project");
        
         i1= new JMenuItem("Java");        
        i2= new JMenuItem("DWDM");
        i3= new JMenuItem("POM");
        i4= new JMenuItem("ML");
        i5= new JMenuItem("Image Processing");
        
        menu.add(i1);        menu.add(i2);        menu.add(i3);
        submenu.add(i4);        submenu.add(i5);
        
        menu.add(submenu);
        mn.add(menu);        
        mn.add(test);  
        
        test.add(i1);
        test.add(submenu);
        
        f.setJMenuBar(mn);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.setVisible(true);

    }
    public static void main(String args[]){
        MenuDemo m = new MenuDemo();
    }
}

