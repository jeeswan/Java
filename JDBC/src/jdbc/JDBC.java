package jdbc;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC {

    public static void main(String[] args) {
        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            System.out.println("Connection successful: " + con);

            // Create Statement
            Statement statement = con.createStatement();

            // SQL to create table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS student ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(255) NOT NULL, "
                    + "age INT)";

            // Execute SQL
            statement.executeUpdate(createTableQuery);
            System.out.println("Table created successfully");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Always close connection in finally
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
