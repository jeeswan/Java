/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author wildflower
 */

class VehicleDemo {
    protected int speed;
    public VehicleDemo(int speed){
        this.speed = speed;
        System.out.println("Vehicle initialized with speed:" + speed + "km/h");
    }
}

class Bike extends VehicleDemo {
    public Bike(int speed) {
        super(speed);
        System.out.println("Bike object created.");
    }
    
    public void increaseSpeed(int increment){
        speed += increment;
        System.out.println("Speed increased by" + increment + "km/h");
    }
    
    public void displaySpeed(){
        System.out.println("Current speed of the bike:" + speed + "km/h");
    }
}

public class ProtectedMemberDemo {
    public static void main(String[] args){
        Bike myBike = new Bike(40);
        
        myBike.increaseSpeed(10);
        myBike.displaySpeed();
    }
}
