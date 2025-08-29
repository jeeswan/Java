/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author wildflower
 */
public class Q34bUpdatableResultSet {
    public static void main(String[] srgs){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );
            
            ResultSet rs = st.executeQuery("SELECT * FROM salary");
            
            while(rs.next()){
                rs.updateDouble("emp_salary", rs.getDouble("emp_salary") + 1000);
                rs.updateRow();
                System.out.println("Updated salary of first record!");
            }
            
            rs.close();
            st.close();
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
