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

public class Q28InsertRow {
    public static void main(String[] args){
       String url = "jdbc:mysql://localhost:3306/javadb";
       String user = "root";
       String pass = "";
       
       try{
           Connection con = DriverManager.getConnection(url, user, pass);
           
           Statement st = con.createStatement();
           
           String sql = "INSERT INTO students (id, name, age, course) " +
                        "VALUES (6, 'Rose', 20, 'Web Development')";
           
           int rows = st.executeUpdate(sql);
           System.out.println(rows + " row(s) inserted.");
           
           ResultSet rs = st.executeQuery("SELECT * FROM students");
           
           System.out.println("ID\tName\tAge\tCourse");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");           // column "age"
                String course = rs.getString("course"); // column "course"
                System.out.println(id + "\t" + name + "\t" + age + "\t" + course);
            }
            
           st.close();
           con.close();
       } catch(SQLException e){
           e.printStackTrace();
       }
    }
}
