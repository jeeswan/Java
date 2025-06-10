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
public class DisplayArrayElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of element of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.print("Enter element of the array: \n");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
    }
}
