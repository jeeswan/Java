/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaclass;

import java.util.Scanner;

/**
 *
 * @author wildflower
 */
public class SwitchArea {
    Scanner sc= new Scanner(System.in);
    void areaRect(){
        System.out.println("Enter length and bredth");
        int len= sc.nextInt();
        int bre= sc.nextInt();
        System.out.println("The area of rectangle is "+ len*bre);
    }
    
    void areaSquare(){
        System.out.println("Enter the length");
        int len = sc.nextInt();
        System.out.println("The area of square is "+ len*len);
    }
    
    void areaCircle(){
        System.out.println("Enter the radius");
        int rad = sc.nextInt();
        System.out.println("The area of circle is " + 3.14*rad*rad);
    }
    public static void main(String[] args){
        Scanner sc1= new Scanner(System.in);
        SwitchArea area = new SwitchArea();
        while(true){
            System.out.print("""
                         Options:
                         1) Area for rectangle
                         2) Area for square
                         3) Area for circle
                         4) Quit\n""");
            int ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    area.areaRect();
                    break;
                case 2:
                    area.areaSquare();
                    break;
                case 3:
                    area.areaCircle();
                    break;
                case 4:
                    return;
                default:
                    throw new AssertionError();
            }
        }
        
}
}