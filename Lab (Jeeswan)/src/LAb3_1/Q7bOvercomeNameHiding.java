/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class ParentClass1{
    int value = 100;
    
    void show(){
        System.out.println("Parent Class show() method");
    }
}

class ChildClass1 extends ParentClass1{
    int value = 200;
    
    void display(){
        System.out.println("Child Class value: " + value);
        System.out.println("Parent Class value: " + super.value);
        super.show();
    }
}
public class Q7bOvercomeNameHiding {
    public static void main(String[] args){
        ChildClass1 obj = new ChildClass1();
        obj.display();
    }
}
