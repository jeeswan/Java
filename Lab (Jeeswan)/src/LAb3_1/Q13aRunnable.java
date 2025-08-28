/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13aRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }

    public static void main(String[] args) {
        Q13aRunnable obj = new Q13aRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}