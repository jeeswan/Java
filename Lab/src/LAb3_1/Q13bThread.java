/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13bThread extends Thread {
    public void run() {
        System.out.println("Thread running by extending Thread class.");
    }

    public static void main(String[] args) {
        Q13bThread t = new Q13bThread();
        t.start();
    }
}