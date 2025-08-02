/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q4aMethodOverloading {
    // Method with no parameters
    void greet() {
        System.out.println("Hello!");
    }

    // Method with one parameter
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with two parameters
    void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hi, " + name + "!");
        }
    }

    public static void main(String[] args) {
        Q4aMethodOverloading obj = new Q4aMethodOverloading();

        obj.greet();                       // no-arg
        obj.greet("Jeeswan");              // one-arg
        obj.greet("Jeeswan", 3);           // two-arg
    }
}