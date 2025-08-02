/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;
import java.util.Scanner;
/**
 *
 * @author wildflower
 */
class Student{
    int roll_no;
    
    void readRollNo(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter roll number: ");
        roll_no = sc.nextInt();
    }
    
    void displayRollNo(){
        System.out.println("Roll No: " + roll_no);
    }
}

class Test extends Student{
    int marks1, marks2;
    
    void readMarks(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = sc.nextInt();
    }
    
    void displayMarks(){
       System.out.println("Marks 1: " +  marks1);
       System.out.println("Marks 2: " +  marks2);
    }
}

class Result extends Test{
    int total;
    
    void calculateTotal(){
        total = marks1 + marks2;
    }
    
    void displayTotal(){
        System.out.println("Total Marks: " + total);
    }
}

public class Q6Inheritance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Result student1 = new Result();
        
        student1.readRollNo();
        student1.readMarks();
        student1.calculateTotal();
        
        System.out.println("\n---Student Report---");
        student1.displayRollNo();
        student1.displayMarks();
        student1.displayTotal();
    }
}
