/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
final class FinalClass{
    void showMessage(){
        System.out.println("Final Class: This class cannot be inherited.");
    }
}

class ParentClass{
    final void display(){
        System.out.println("Parent Class: Cannot be overridden.");
    }
}

public class Q5dFinalKeyword extends ParentClass{
    final int MAX = 100;
    
    public static void main(String[] args){
        Q5dFinalKeyword obj = new Q5dFinalKeyword();
        
        System.out.println("Final Variable:" + obj.MAX);
        
        obj.display();
        
        FinalClass fc = new FinalClass();
        fc.showMessage();
    }
}
