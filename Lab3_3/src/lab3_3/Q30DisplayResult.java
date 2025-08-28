/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author wildflower
 */
public class Q30DisplayResult {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            System.out.print("Enter Roll no.: ");
            int roll_no = sc.nextInt();
            
            String sql = "SELECT * FROM results WHERE roll_no = "+ roll_no;
                   
            ResultSet rs = st.executeQuery(sql);
           
            boolean found = false;
            System.out.println("Roll No\tCourse Name\tMarks Obtained");
            while (rs.next()) {
                int rno = rs.getInt("roll_no");
                String course = rs.getString("course_name");
                int marks = rs.getInt("marks_obtained");       
                System.out.println(rno + "\t" + course + "\t\t" + marks);
                found = true;
            }
            if(!found){
                System.out.println("No record found for rill number" + roll_no);
            }
            
            st.close();
            con.close();
            sc.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
