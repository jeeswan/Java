/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q3dForEachLoop {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print elements using for-each loop
        System.out.println("Array elements using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Bonus: calculate sum using for-each
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
