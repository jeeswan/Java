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

public class Q31PreparedStatement {
    public static void main(String[] srgs){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String user = "root";
        String pass = "";
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Connection con = DriverManager.getConnection(url, user, pass);
            
            boolean running = true;
            while(running){
                System.out.println("\n--- Menu ---");
                System.out.println("1. Insert Record");
                System.out.println("2. Display All Records");
                System.out.println("3. Update Record");
                System.out.println("4. Delete Record");
                System.out.println("5. Exit");
                System.out.println("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();
                
                switch(choice){
                    case 1:
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        
                        System.out.println("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter Course: ");
                        String course = sc.nextLine();
                        
                        String insertSQL = "INSERT INTO students1 (id, name, age, course) VALUES (?, ?, ?, ?)";
                        PreparedStatement pstInsert = con.prepareStatement(insertSQL);
                        pstInsert.setInt(1, id);
                        pstInsert.setString(2, name);
                        pstInsert.setInt(3, age);
                        pstInsert.setString(4, course);
                        int rowsInserted = pstInsert.executeUpdate();
                        System.out.println(rowsInserted + "record(s) inserted.");
                        pstInsert.close();
                        break;
                        
                    case 2:
                        String selectSQL = "SELECT * FROM students1";
                        PreparedStatement pstSelect = con.prepareStatement(selectSQL);
                        ResultSet rs = pstSelect.executeQuery();
                        System.out.println("ID\tName\tAge\tCourse");
                        while(rs.next()){
                            System.out.println(rs.getInt("id") + "\t" +
                                               rs.getString("name") + "\t" +
                                               rs.getInt("age") + "\t" +
                                               rs.getString("course")
                            );
                        }
                        rs.close();
                        pstSelect.close();
                        break;
                        
                    case 3:
                        System.out.println("Enter ID to update: ");
                        int updid = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter new Age: ");
                        int updage = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Enter new Course: ");
                        String updcourse = sc.nextLine();
                        
                        String updateSQL = "UPDATE students1 SET age=?, course=? WHERE id=?";
                        PreparedStatement pstUpdate = con.prepareStatement(updateSQL);
                        pstUpdate.setInt(1, updid);
                        pstUpdate.setInt(3, updage);
                        pstUpdate.setString(4, updcourse);
                        int rowsUpdated = pstUpdate.executeUpdate();
                        System.out.println(rowsUpdated + "record(s) updated.");
                        pstUpdate.close();
                        break;
                        
                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        int delID = sc.nextInt();
                        sc.nextLine();
                        
                        String deleteSQL = "DELETE FROM students1 WHERE id=?";
                        PreparedStatement pstDelete = con.prepareStatement(deleteSQL);
                        pstDelete.setInt(1, delID);
                        int rowsDeleted = pstDelete.executeUpdate();
                        System.out.println(rowsDeleted + "record(s) deleted.");
                        pstDelete.close();
                        break;
                        
                    case 5:
                        running = false;
                        break;
                        
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            }
            
            con.close();
            sc.close();
            System.out.println("Terminated....");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
