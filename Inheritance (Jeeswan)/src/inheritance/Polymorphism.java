/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author wildflower
 */
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Jeeswan", 5000);
        Employee emp2 = new PartTimeEmployee("Rose", 20, 100);

        System.out.println(emp1.name + "'s salary: " + emp1.calculateSalary());
        System.out.println(emp2.name + "'s salary: " + emp2.calculateSalary());
    }
}
