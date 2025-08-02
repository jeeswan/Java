/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
class SynchronizedMethod{
    synchronized void printTable(int n){
        for (int i=1; i<=5; i++){
            System.out.println(n*i);
        }
    }
}

class Thread1 extends Thread{
    SynchronizedMethod obj;
    
    Thread1(SynchronizedMethod obj){
        this.obj = obj;
    }
    
    public void run(){
        obj.printTable(5);
    }
}

public class Q13eSynchronizedMethod {
    public static void main(String[] args){
        SynchronizedMethod obj = new SynchronizedMethod();
        Thread1 t1 = new Thread1(obj);
        Thread1 t2 = new Thread1(obj);
        t1.start();
        t2.start();
    }
}
