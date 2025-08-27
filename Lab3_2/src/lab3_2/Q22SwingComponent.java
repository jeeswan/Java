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
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;

public class Q22SwingComponent extends JFrame{
    JSlider slider;
    JLabel sliderLabel;
    JList<String> list;
    JTable table;
    JProgressBar progressBar;
    JTree tree;
    
    Q22SwingComponent(){
        setTitle("Swing Component Demo");
        setSize(600, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel topPanel = new JPanel(new FlowLayout());
        slider = new JSlider(0, 100, 50);
        sliderLabel = new JLabel("Value: 50");
        topPanel.add(new JLabel("Slider: "));
        topPanel.add(slider);
        topPanel.add(sliderLabel);
        add(topPanel, BorderLayout.NORTH);
        
        slider.addChangeListener(e -> {
            int val = slider.getValue();
            sliderLabel.setText("Value: " + val);
            progressBar.setValue(val);
        });
        
        String[] items = {"Java", "Python", "C++", "JavaScript"};
        list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){
                JOptionPane.showMessageDialog(this, "You selected:" + list.getSelectedValue());
            }
        });
        add(new JScrollPane(list), BorderLayout.WEST);
        
        String[] cols = {"ID", "Name", "Age"};
        Object[][] data = {
            {"1", "Jeeswan", 21},
            {"2", "Rose", 20},
            {"3", "Krisha", 20}
        };
        table = new JTable(data, cols);
        add(new JScrollPane(table), BorderLayout.CENTER);
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Languages");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Java");
        node1.add(new DefaultMutableTreeNode("Swing"));
        node1.add(new DefaultMutableTreeNode("JavaFX"));
        
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Python");
        node2.add(new DefaultMutableTreeNode("Flask"));
        node2.add(new DefaultMutableTreeNode("Django"));
        
        root.add(node1);
        root.add(node2);
        tree = new JTree(root);
        add(new JScrollPane(tree), BorderLayout.EAST);
        
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        add(progressBar, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    public static void main(String[] agrs){
        new Q22SwingComponent();
    }
}
