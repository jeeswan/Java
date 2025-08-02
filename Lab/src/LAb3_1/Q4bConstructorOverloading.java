/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q4bConstructorOverloading {
    int x, y;

    // Default constructor
    Q4bConstructorOverloading() {
        x = 0;
        y = 0;
    }

    // One-arg constructor
    Q4bConstructorOverloading(int a) {
        x = a;
        y = 0;
    }

    // Two-arg constructor
    Q4bConstructorOverloading(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Q4bConstructorOverloading obj1 = new Q4bConstructorOverloading();
        Q4bConstructorOverloading obj2 = new Q4bConstructorOverloading(5);
        Q4bConstructorOverloading obj3 = new Q4bConstructorOverloading(10, 20);

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
