/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Playing music in the car");
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();

        myCar.playMusic();
    }
}
