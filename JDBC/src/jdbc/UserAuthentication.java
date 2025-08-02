/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;

/**
 *
 * @author wildflower
 */
public class UserAuthentication extends JFrame implements ActionListener   {
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    //calling constructor  
    UserAuthentication()  
    {     
          
        //create label for username   
        userLabel = new JLabel();
        userLabel.setSize(50, 20);
        userLabel.setText("Username");      //set label value for textField1  
          
        //create text field to get username from the user  
        textField1 = new JTextField(15);    //set length of the text  
        textField1.setSize(50, 20);
  
        //create label for password  
        passLabel = new JLabel(); 
        passLabel.setSize(50, 20);
        passLabel.setText("Password");      //set label value for textField2  
          
        //create text field to get password from the user  
        textField2 = new JPasswordField(15);    //set length for the password  
        textField2.setSize(50, 20);  
        //create submit button  
        b1 = new JButton("SUBMIT"); //set label to button  
          
        //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(3, 1,20,20));  
        newPanel.add(userLabel);    //set username label to panel  
        newPanel.add(textField1);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(textField2);   //set text field to panel  
        newPanel.add(b1);           //set button to panel  
          
        //set border to panel   
        add(newPanel, BorderLayout.WEST);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
          
        //perform action on button click   
        b1.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
        setSize(300, 300);
    }  
      
    //define abstract method actionPerformed() which will be called on button click   
    public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
    {  
        String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (userValue.equals("abc") && passValue.equals("123")) {  //if authentic, navigate user to a new page  
              
            //create instance of the NewPage  
            JFrame page = new JFrame();  
              
            //make page visible to the user 
            
            JOptionPane.showMessageDialog(this, "Login Successful");
            //create a welcome label and set it to the new page  
            JLabel wel_label = new JLabel("Welcome: "+userValue);  
            page.getContentPane().add(wel_label); 
            page.setTitle("Home page");
            //wel_label.setBounds(5, 5, 20, 20);
           // page.setLayout(null);
            page.setSize(500, 500);
            page.setVisible(true);  
            page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  
        else{  
            //show error message  
            //System.out.println("Please enter valid username and password");  
            JOptionPane.showMessageDialog(this, "Invalid login attempt");
        }  
    }  
}  
//create the main class  
class LoginFormDemo  
{  
    //main() method start  
    public static void main(String arg[])  
    {  
        try  
        {  
            //create instance of the CreateLoginForm  
            UserAuthentication form = new UserAuthentication();  
            form.setSize(300,300);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }
    
}