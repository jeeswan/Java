/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
abstract class Shape {
    abstract void draw();  // abstract method

    void print() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Q8cAbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.print();
    }
}