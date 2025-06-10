/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */

class Shape {
    double area() {
        System.out.println("Calculating area of generic shape");
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    static final double PI = 3.14;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return PI * radius * radius;
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        double result = c.area();
        System.out.println("Area of the circle: " + result);
    }
}
