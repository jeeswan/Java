/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q12dThrowKeyword {
    public static void main(String[] args) {
        int age = 15;
    try{
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("You can vote.");
    } catch (ArithmeticException e) {
        System.out.println("Caught Exception: " + e.getMessage());
    }
    System.out.println();
}
}