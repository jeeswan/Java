/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass;
import java.util.Scanner;

/**
 *
 * @author wildflower
 */
public class factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }
    }
    
}
