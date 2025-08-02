/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13cisAlive_Join extends Thread {
    public void run() {
        System.out.println("Thread running...");
    }

    public static void main(String[] args) throws InterruptedException {
        Q13cisAlive_Join t1 = new Q13cisAlive_Join();
        t1.start();
        System.out.println("Is t1 alive? " + t1.isAlive());
        t1.join();
        System.out.println("After join - Is t1 alive? " + t1.isAlive());
    }
}