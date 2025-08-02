/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q9cLocalInnerClass {
    void outerMethod() {
        class Local {
            void msg() {
                System.out.println("Inside Local Inner Class");
            }
        }

        Local local = new Local();
        local.msg();
    }

    public static void main(String[] args) {
        Q9cLocalInnerClass obj = new Q9cLocalInnerClass();
        obj.outerMethod();
    }
}