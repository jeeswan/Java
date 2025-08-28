/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_3;

/**
 *
 * @author wildflower
 */
import java.sql.*;

public class Q27ReadTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            // Statement
            Statement st = con.createStatement();

            // Query
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            // Print
            System.out.println("ID\tName\tAge\tCourse");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");           // column "age"
                String course = rs.getString("course"); // column "course"
                System.out.println(id + "\t" + name + "\t" + age + "\t" + course);
            }

            // Close
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}