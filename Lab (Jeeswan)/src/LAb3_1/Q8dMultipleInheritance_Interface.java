/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MyClass implements Printable, Showable {
    public void print() {
        System.out.println("Hello...");
    }

    public void show() {
        System.out.println("My name is Jeeswan...");
    }
}

public class Q8dMultipleInheritance_Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();
        obj.show();
    }
}
