/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_3;

/**
 *
 * @author wildflower
 */
import java.sql.*;
import java.util.Scanner;

public class Q29InsertFromConsole {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            
            String sql = "INSERT INTO students (id, name, age, course) "
                            + "VALUES ("+id +", '" + name +"', "+age+", '"+course+"')";
            
            int rows = st.executeUpdate(sql);
            System.out.println(rows + "row(s) inserted successfully.");
            
            ResultSet rs = st.executeQuery("SELECT * FROM students");
           
            System.out.println("ID\tName\tAge\tCourse");
            while (rs.next()) {
                int rid = rs.getInt("id");
                String rname = rs.getString("name");
                int rage = rs.getInt("age");       
                String rcourse = rs.getString("course");
                System.out.println(rid + "\t" + rname + "\t" + rage + "\t" + rcourse);
            }
            
            st.close();
            con.close();
            sc.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
