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

public class Q36TransactionManagement {
    public static void main(String[] srgs){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            
            con.setAutoCommit(false);
            Statement st = con.createStatement();
            
            try{
                st.executeUpdate("INSERT INTO salary(emp_id, emp_name, emp_salary) VALUES(1003, 'Alisha', 500000)");
                st.executeUpdate("INSERT INTO salary(emp_id, emp_name, emp_salary) VALUES(1004, 'Bhumika', 60000)");
                
                con.commit();
                System.out.println("Transaction committed successfully.");
                
                 // ---------- Q27: Read and display all rows ----------
                ResultSet rs = st.executeQuery("SELECT * FROM salary");
                System.out.println("\n--- Employee Table ---");
                System.out.println("ID\tName\tSalary");
                while (rs.next()) {
                    int rid = rs.getInt("emp_id");
                    String rname = rs.getString("emp_name");
                    String rsalary = rs.getString("emp_salary");
                    System.out.println(rid + "\t" + rname + "\t" + rsalary);
                }
            }catch(SQLException e){
                con.rollback();
                System.out.println("Transaction rolled back due to error: " + e.getMessage());
            }
            
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
