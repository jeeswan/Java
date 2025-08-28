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

public class Q26DialogBox extends JFrame implements ActionListener{
    JButton infoBtn, questionBtn, errBtn, warnBtn, confBtn, inputBtn, optBtn;
    
    public Q26DialogBox(){
        setTitle("Dialog Box");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        infoBtn = new JButton("Info");
        questionBtn = new JButton("Question");
        errBtn = new JButton("Error");
        warnBtn = new JButton("Warning");
        confBtn = new JButton("Confirm");
        inputBtn = new JButton("Input");
        optBtn = new JButton("Option");
        
        JButton[] btns = { infoBtn, questionBtn, errBtn, warnBtn, confBtn, inputBtn, optBtn};
        for (JButton b : btns){
            b.addActionListener(this);
            add(b);
        }
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == infoBtn){
            JOptionPane.showMessageDialog(this, "This is information!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getSource() == questionBtn){
            JOptionPane.showMessageDialog(this, "Is this a question?", "Question", JOptionPane.QUESTION_MESSAGE);
        }else if(e.getSource() == errBtn){
            JOptionPane.showMessageDialog(this, "An error occured!", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(e.getSource() == warnBtn){
            JOptionPane.showMessageDialog(this, "This is a warning!", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if(e.getSource() == confBtn){
            int res = JOptionPane.showConfirmDialog(this, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
            System.out.println("Confirm result: " + res);
        }else if(e.getSource() == inputBtn){
            String name = JOptionPane.showInputDialog(this, "Enter your name: ");
            System.out.println("You entered: " + name);
        }else if(e.getSource() == optBtn){
            String[] options = {"Java", "Python", "C++"};
            int choice = JOptionPane.showOptionDialog(this, "Choose a language: ", "Option Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            System.out.println("Your choice: " + (choice >= 0 ? options[choice] : "None"));
        }
    }
    
    public static void main(String[] args){
        new Q26DialogBox();
    }
}
