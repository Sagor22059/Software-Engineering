// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();
}

// Child class
class Bike extends Vehicle {
    // Giving body to the abstract method
    void start() {
        System.out.println("Bike starts with a kick!");
    }
}

// Main class
public class abstractclass {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // ❌ Cannot create object of abstract class

        Bike myBike = new Bike();
        myBike.start(); // Call the start method
    }
}
