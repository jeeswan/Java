/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Q12fCostumException {
    static void validate(int marks) throws MyException {
        if (marks < 40)
            throw new MyException("Fail: Marks below 40");
        else
            System.out.println("Pass: Marks = " + marks);
    }

    public static void main(String[] args) {
        try {
            validate(35);
        } catch (MyException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}