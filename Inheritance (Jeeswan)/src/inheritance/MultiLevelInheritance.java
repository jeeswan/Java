/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */
class LivingBeing {
    void breathe() {
        System.out.println("LivingBeing is breathing");
    }
}

class Animal extends LivingBeing {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Bird myBird = new Bird();

        myBird.breathe(); 
        myBird.eat();    
        myBird.fly(); 
    }
}
