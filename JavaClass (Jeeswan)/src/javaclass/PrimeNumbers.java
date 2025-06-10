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
public class PrimeNumbers {
    public static boolean isPrime(int n){
       if (n<=1){
           return false;
       }
       
       for (int i = 2; i < n; i++){
           if (n%i==0){
               return false;
           }
       }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 2; i<=num; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
}
