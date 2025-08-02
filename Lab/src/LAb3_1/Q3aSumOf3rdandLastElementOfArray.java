/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q3aSumOf3rdandLastElementOfArray {
    public static void main(String[] args){
        int[] numbers = new int[15];
        
        for(int i=0; i<15; i++){
            numbers[i] = i+1;
        }
        
        int thirdElement = numbers[2];
        int lastElement = numbers[14];
        int sum = thirdElement + lastElement;
        
        System.out.println("3rd Element: " + thirdElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Sum: " + sum);
    }
}
