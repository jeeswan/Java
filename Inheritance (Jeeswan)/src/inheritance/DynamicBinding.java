/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */
abstract class Appliance {
    public abstract void turnOn(); // Abstract method
}

// Subclass 1: Fan
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan blows air.");
    }
}

// Subclass 2: WashingMachine
class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine washes clothes.");
    }
}

public class DynamicBinding {
    // Method demonstrating dynamic binding
    public static void startAppliance(Appliance appliance) {
        appliance.turnOn(); // Dynamic method dispatch
    }

    public static void main(String[] args) {
        // Create objects
        Appliance fan = new Fan();
        Appliance washer = new WashingMachine();

        // Call method that uses dynamic binding
        startAppliance(fan);
        startAppliance(washer);
    }
}
