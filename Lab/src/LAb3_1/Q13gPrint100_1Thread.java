/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
public class Q13gPrint100_1Thread extends Thread{
    public void run(){
        for(int i= 100; i>=1; i--){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args){
        Q13gPrint100_1Thread obj = new Q13gPrint100_1Thread();
        obj.start();
    }
}
