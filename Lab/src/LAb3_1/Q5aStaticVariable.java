/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q5aStaticVariable {
    static int count = 0; //static variable
    
    Q5aStaticVariable(){
        count++;
    }
    
    public static void main(String[] args){
        Q5aStaticVariable obj1 = new Q5aStaticVariable();
        Q5aStaticVariable obj2 = new Q5aStaticVariable();
        Q5aStaticVariable obj3 = new Q5aStaticVariable();
        
        System.out.println("Number of objects created: " + count);
    }
}
