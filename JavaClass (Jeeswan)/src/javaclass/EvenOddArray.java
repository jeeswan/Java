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
public class EvenOddArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of element of the array: ");
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        int evenCount = 0, oddCount = 0;
        
        System.out.print("Enter the element of array: \n");
        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        
        System.out.println("\nTotal even number in the array: " +evenCount);
        System.out.println("\nTotal odd number in the array: " +oddCount);
    }
}
