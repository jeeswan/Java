/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q9bNonStaticNestedClass {
    class Inner {
        void show() {
            System.out.println("Inside Non-static Inner Class");
        }
    }

    public static void main(String[] args) {
        Q9bNonStaticNestedClass outer = new Q9bNonStaticNestedClass();
        Q9bNonStaticNestedClass.Inner inner = outer.new Inner();
        inner.show();
    }
}