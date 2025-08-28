/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q2MoneyTest {
    public static void main(String[] args) {
        // First two money objects
        Q2Money money1 = new Q2Money();
        Q2Money money2 = new Q2Money();

        money1.setMoney(5, 75);
        money2.setMoney(7, 30);

        // Third object to store the result
        Q2Money result = new Q2Money();
        result.addMoney(money1, money2);

        // Display all three
        System.out.print("Money 1: ");
        money1.displayMoney();

        System.out.print("Money 2: ");
        money2.displayMoney();

        System.out.print("Result  : ");
        result.displayMoney();
    }
}
