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

public class Q18Calculator extends JFrame implements ActionListener{
    JTextField num1, num2;
    JButton addBtn, subBtn, mulBtn;
    JLabel result;
    
    Q18Calculator(){
        num1 = new JTextField(10);
        num2 = new JTextField(10);
        
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        
        result = new JLabel("Result: ");
        
        addBtn.setToolTipText("Add");
        subBtn.setToolTipText("Substract");
        mulBtn.setToolTipText("Multiply");
        
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(new JLabel("Number 1: "));
        add(num1);
        add(new JLabel("Number 2: "));
        add(num2);
        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(result);
        
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            double n1 = Double.parseDouble((num1.getText()));
            double n2 = Double.parseDouble((num2.getText()));
            double r = 0;
            
            if(e.getSource() == addBtn){
                r = n1 + n2;
            }else if (e.getSource() == subBtn){
                r = n1 - n2;
            }else if(e.getSource() == mulBtn){
                r = n1 * n2;
            }
            
            result.setText("Result: " + r);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Invalid number. Plese ender valid numbers.");
        }
    }
    public static void main(String[] args){
        new Q18Calculator();
    }
}
