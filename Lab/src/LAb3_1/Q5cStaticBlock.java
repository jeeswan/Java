/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q5cStaticBlock {
    static{
        System.out.println("Static Block executed before main.");
    }
    
    public static void main(String[] args){
        System.out.println("Inside main method.");
    }
}
