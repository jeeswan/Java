/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_3;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author wildflower
 */
public class Q33PreparedStatement_Salary {
    public static void main(String[] srgs){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            
            System.out.println("Enter Employee ID to search: ");
            int empId = sc.nextInt();
            
            String sql = "SELECT * FROM salary Where emp_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, empId);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                System.out.println("\n--- Employee Record ---");
                System.out.println("ID: " + rs.getInt("emp_id"));
                System.out.println("Name: " + rs.getString("emp_name"));
                System.out.println("Salary: " + rs.getDouble("emp_salary"));
            }else{
                System.out.println("No record found with Employee ID: " + empId);
            }
            rs.close();
            pst.close();
            con.close();
            sc.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
