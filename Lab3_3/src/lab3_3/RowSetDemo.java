package lab3_3;

import java.sql.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.CachedRowSet;

public class RowSetDemo {
    public static void main(String[] args) {
        try {
            // 1️⃣ Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/javadb";
            String user = "root";
            String password = "";

            // -------------------------
            // (d) JdbcRowSet Demo
            // -------------------------
            System.out.println("=== JdbcRowSet Demo ===");

            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);
            jdbcRowSet.setCommand("SELECT * FROM students");
            jdbcRowSet.execute();  // Connects and fetches rows

            while (jdbcRowSet.next()) {
                System.out.println("ID: " + jdbcRowSet.getInt("id") +
                        ", Name: " + jdbcRowSet.getString("name") +
                        ", Age: " + jdbcRowSet.getInt("age"));
            }

            // -------------------------
            // (e) CachedRowSet Demo
            // -------------------------
            System.out.println("\n=== CachedRowSet Demo ===");

            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);
            cachedRowSet.setCommand("SELECT * FROM students");
            cachedRowSet.execute(); // Fetches data and disconnects automatically

            // Now you can close connection, CachedRowSet still holds data
            while (cachedRowSet.next()) {
                System.out.println("ID: " + cachedRowSet.getInt("id") +
                        ", Name: " + cachedRowSet.getString("name") +
                        ", Age: " + cachedRowSet.getInt("age"));
            }

            // Example of updating a row in CachedRowSet
            cachedRowSet.beforeFirst();
            if (cachedRowSet.next()) {
                cachedRowSet.updateString("name", "CachedUpdatedName");
                cachedRowSet.updateRow();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
