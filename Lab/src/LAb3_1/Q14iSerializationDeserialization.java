/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
import java.io.*;

class Student implements Serializable{
    String name;
    int age;
    
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Q14iSerializationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Student s1 = new Student("Jeeswan", 22);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.ser"));
        out.writeObject(s1);
        out.close();
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.ser"));
        Student s2 = (Student) in.readObject();
        System.out.println("Name: " + s2.name + "\nAge: " + s2.age);
        in.close();
    }
}
