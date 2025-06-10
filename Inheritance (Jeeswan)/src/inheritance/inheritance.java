package inheritance;

import java.util.Scanner;

// Base class
class GetA {
    public int a, b;

    public void getA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
    }
    int setA(){
        return this.a;
    }
}

class GetB extends GetA{
    public void getB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
    }
    int setB(){
        return this.b;
    }
}

// Main class with proper naming conventions
public class inheritance {
    public static void main(String[] args) {
        GetB b = new GetB();
        b.getA();
        b.getB();
       
        int aS = b.setA();
        int bS = b.setB();
        
        System.out.println("Sum of "+ aS + " and "+ bS +" is: " + (aS+bS));
    }
}
