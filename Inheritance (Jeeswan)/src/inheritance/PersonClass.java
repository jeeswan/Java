/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */

class Person {
    String name;
    int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    double grade;
    
    public Student(String name, int age, double grade){
        super(name, age);
        this.grade = grade;
    }
    
    void displayInfo(){
        System.out.println("Name: " +name );
        System.out.println("Age: " +age);
        System.out.println("Grade: " +grade);
    }
}
public class PersonClass {
    public static void main(String[] args) {
        Student s = new Student("Jeeswan", 21, 72.5);
        s.displayInfo();
    }
}
