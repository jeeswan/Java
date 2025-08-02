/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
interface Shape1 {
    double area(double x, double y);
    double perimeter(double x, double y);
}

// Rectangle class implementing Shape interface
class Rectangle1 implements Shape1 {
    double length;
    double breadth;

    // Constructor to initialize rectangle dimensions
    Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement area method
    public double area(double x, double y) {
        return x * y;
    }

    // Implement perimeter method
    public double perimeter(double x, double y) {
        return 2 * (x + y);
    }

    // Display method
    void displayResults() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area(length, breadth));
        System.out.println("Perimeter: " + perimeter(length, breadth));
    }
}

public class Q11Shape {
    public static void main(String[] args) {
        Rectangle1 rect = new Rectangle1(10, 5);
        rect.displayResults();
    }
}
