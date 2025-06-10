/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        int num1, num2, num3, gre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            gre = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            gre = num2;
        } else {
            gre = num3;
        }

        System.out.println("The greatest number is " + gre);
    }
}
