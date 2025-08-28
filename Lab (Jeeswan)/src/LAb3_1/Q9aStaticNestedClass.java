/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q9aStaticNestedClass {
    static class Nested {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Q9aStaticNestedClass.Nested obj = new Q9aStaticNestedClass.Nested();
        obj.display();
    }
}
