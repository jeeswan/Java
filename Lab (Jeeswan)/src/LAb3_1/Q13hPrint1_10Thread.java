/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13hPrint1_10Thread extends Thread{
    public void run(){
        for(int i= 1; i<=10; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args){
        Q13hPrint1_10Thread obj = new Q13hPrint1_10Thread();
        obj.start();
    }
}