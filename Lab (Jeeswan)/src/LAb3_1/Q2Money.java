/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */

public class Q2Money {
    int rupee;
    int paisa;

    // Set the values
    void setMoney(int r, int p) {
        rupee = r;
        paisa = p;
    }

    // Display the values
    void displayMoney() {
        System.out.println(rupee + " Rupee " + paisa + " Paisa");
    }

    // Add two Money objects and store result in current object
    void addMoney(Q2Money m1, Q2Money m2) {
        int totalPaisa = m1.paisa + m2.paisa;
        int extraRupee = totalPaisa / 100;
        paisa = totalPaisa % 100;

        rupee = m1.rupee + m2.rupee + extraRupee;
    }
}

