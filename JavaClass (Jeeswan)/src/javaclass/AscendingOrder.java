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
public class AscendingOrder {
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
        
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.print("Array in ascending order: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
