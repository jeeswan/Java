/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class Animal1{
    void sound(){
        System.out.println("Animal mases a sound");
    }
}

class Dog1 extends Animal1{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Q8aMethodOverriding {
    public static void main(String[] args){
        Dog1 d = new Dog1();
        d.sound();
    }
}
