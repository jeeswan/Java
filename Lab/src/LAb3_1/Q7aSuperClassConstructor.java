/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class Parent{
    Parent(){
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("Child constructor called");
    }
}

public class Q7aSuperClassConstructor {
    public static void main(String[] args){
        Child obj = new Child();
    }
}
