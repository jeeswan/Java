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
public class reverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        
        while (num != 0) {
            int digit = num % 10;      
            rev = rev * 10 + digit; 
            num = num / 10;            
        }

        System.out.println("Reversed number of " + temp + " is: " + rev);
    }
    
}
