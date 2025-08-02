/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q3cJaggedArray {
    public static void main(String[] args) {
        // Declare a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Define different lengths for each row
        jaggedArray[0] = new int[2];  // row 0 has 2 columns
        jaggedArray[1] = new int[4];  // row 1 has 4 columns
        jaggedArray[2] = new int[3];  // row 2 has 3 columns

        // Initialize the array with some values
        int count = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = count++;
            }
        }

        // Display the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
