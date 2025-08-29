package lab3_3;

import java.sql.*;

public class ResultSetDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javadb?allowMultiQueries=true"; // allow multiple queries
        String user = "root";
        String pass = "";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {

            // -------------------------
            // (a) Scrollable ResultSet
            // -------------------------
            System.out.println("=== Scrollable ResultSet Demo ===");
            Statement scrollStmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            ResultSet rsScroll = scrollStmt.executeQuery("SELECT * FROM students");

            if (rsScroll.last())
                System.out.println("Last Record: " + rsScroll.getInt("id") + " " + rsScroll.getString("name"));
            if (rsScroll.first())
                System.out.println("First Record: " + rsScroll.getInt("id") + " " + rsScroll.getString("name"));
            if (rsScroll.absolute(2))
                System.out.println("2nd Record: " + rsScroll.getInt("id") + " " + rsScroll.getString("name"));
            if (rsScroll.relative(-1))
                System.out.println("Previous Record (from 2nd): " + rsScroll.getInt("id") + " " + rsScroll.getString("name"));

            // -------------------------
            // (b) Updatable ResultSet
            // -------------------------
            System.out.println("\n=== Updatable ResultSet Demo ===");
            Statement updateStmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rsUpdate = updateStmt.executeQuery("SELECT id, name, age FROM students");

            // Update first record
            if (rsUpdate.first()) {
                System.out.println("Before Update: " + rsUpdate.getString("name"));
                rsUpdate.updateString("name", "Jeeswan");
                rsUpdate.updateRow();
                System.out.println("Updated first record successfully!");
            }

            // Insert new record safely
            int newId = 1;
            Statement stmt = con.createStatement();
            ResultSet rsMax = stmt.executeQuery("SELECT MAX(id) FROM students");
            if (rsMax.next()) {
                newId = rsMax.getInt(1) + 1;
            }
            rsUpdate.moveToInsertRow();
            rsUpdate.updateInt("id", newId);  // dynamically assigned unique ID
            rsUpdate.updateString("name", "Rose");
            rsUpdate.updateInt("age", 20);
            rsUpdate.insertRow();
            System.out.println("Inserted new record successfully with ID: " + newId);

            // -------------------------
            // (c) Multiple ResultSets
            // -------------------------
            System.out.println("\n=== Multiple ResultSet Demo ===");
            Statement multiStmt = con.createStatement();
            boolean results = multiStmt.execute(
                    "SELECT * FROM students; SELECT * FROM courses;"); // multiple queries allowed

            int resultSetCount = 1;
            while (results) {
                ResultSet rsMulti = multiStmt.getResultSet();
                ResultSetMetaData meta = rsMulti.getMetaData();
                int colCount = meta.getColumnCount();

                System.out.println("\nResultSet " + resultSetCount + ":");
                while (rsMulti.next()) {
                    for (int i = 1; i <= colCount; i++) {
                        System.out.print(rsMulti.getString(i) + "\t");
                    }
                    System.out.println();
                }

                results = multiStmt.getMoreResults();
                resultSetCount++;
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}