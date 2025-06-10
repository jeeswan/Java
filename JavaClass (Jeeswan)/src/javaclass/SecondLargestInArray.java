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

public class SecondLargestInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements of the array: ");
        int num = sc.nextInt();
        
        if (num < 2) {
            System.out.println("At least two elements are required.");
            return;
        }
        
        int[] arr = new int[num];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

