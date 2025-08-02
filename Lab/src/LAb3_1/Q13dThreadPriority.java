/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13dThreadPriority extends Thread {
    public void run() {
        System.out.println("Thread running with priority: " + getPriority());
    }

    public static void main(String[] args) {
        Q13dThreadPriority t1 = new Q13dThreadPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}