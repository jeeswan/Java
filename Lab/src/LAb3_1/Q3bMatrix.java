/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;
import java.util.Scanner;

/**
 *
 * @author wildflower
 */
public class Q3bMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        
        System.out.println("Enter elements for a 3X3 matrix: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatrix:");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.print("\n Main Diagonal: " );
        for (int i=0; i<3; i++){
            System.out.print(matrix[i][i] + " ");
        }
        
        System.out.print("\nSecondary Diagonal: ");
        for (int i=0; i<3; i++){
            System.out.print(matrix[i][2-i] + " ");
        }
    }
}
