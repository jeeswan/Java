/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class ClassA{
    ClassA(){
        System.out.println("Constructor A");
    }
}

class ClassB extends ClassA{
    ClassB(){
        System.out.println("Constructor B");
    }
}

class ClassC extends ClassB{
    ClassC(){
        System.out.println("Constructor C");
    }
}
public class Q7dConstructorChain {
    public static void main(String[] args){
        ClassC obj = new ClassC();
    }
}
