/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class Figure {
    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    double length = 5, breadth = 3;

    double area() {
        return length * breadth;
    }
}

class Triangle extends Figure {
    double base = 4, height = 6;

    double area() {
        return 0.5 * base * height;
    }
}

public class Q8bRuntimePolymorphism {
    public static void main(String[] args) {
        Figure f;

        f = new Rectangle();
        System.out.println("Area of Rectangle: " + f.area());

        f = new Triangle();
        System.out.println("Area of Triangle: " + f.area());
    }
}
