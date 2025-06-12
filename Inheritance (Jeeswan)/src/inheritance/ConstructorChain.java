/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */
class A {
    public A(){
        System.out.println("Constructor A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor C");
        
    }
}

public class ConstructorChain {
    public static  void main(String[] args){
        C obj = new C();   
    }
}
