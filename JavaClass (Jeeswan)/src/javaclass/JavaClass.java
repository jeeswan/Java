/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclass;

import java.util.Scanner;




/**
 *
 * @author wildflower
 */
public class JavaClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        }
        
    }
    
}
