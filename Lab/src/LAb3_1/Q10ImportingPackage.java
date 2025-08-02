/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
// 1. Specific class import
import java.util.Scanner;

// 2. Import entire package (wildcard)
import java.util.*;

public class Q10ImportingPackage {
    public static void main(String[] args) {
        // Using imported Scanner directly (specific import)
        Scanner sc = new Scanner(System.in);

        // Using fully qualified name without import
        java.util.Date date = new java.util.Date();

        // Using class from wildcard import
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        list.add(name);

        System.out.println("Hello, " + name);
        System.out.println("Current date: " + date);
        System.out.println("Stored in list: " + list);
    }
}