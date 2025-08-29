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
public class Q34aScrollableResultSet {
    public static void main(String[] srgs){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            
            ResultSet rs = st.executeQuery("SELECT * FROM salary");
            
            System.out.println("--- Scroll Forward ---");
            while(rs.next()){
                System.out.println(rs.getInt("emp_id") + " " + rs.getString("emp_name"));
            }
            System.out.println("--- Scroll Backward ---");
            while(rs.previous()){
                System.out.println(rs.getInt("emp_id") + " " + rs.getString("emp_name"));
            }
            rs.close();
            con.close();
            st.close();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
