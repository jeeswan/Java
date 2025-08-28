/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class Box {
double length;
    double breadth;
    double height;

    // Method to print dimensions
    void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    // Method to print volume
    void printVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }
}

public class Q1Box {
    public static void main(String[] args) {
        // First object
        Box box1 = new Box();
        box1.length = 5;
        box1.breadth = 3;
        box1.height = 2;

        System.out.println("Box 1:");
        box1.printDimensions();
        box1.printVolume();

        System.out.println();

        // Second object
        Box box2 = new Box();
        box2.length = 7.5;
        box2.breadth = 4;
        box2.height = 3;

        System.out.println("Box 2:");
        box2.printDimensions();
        box2.printVolume();
    }
}

