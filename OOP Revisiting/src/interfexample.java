// Interface
interface nimal {
    void eat();   // Abstract method
    void sleep(); // Abstract method
}

// Class that implements the interface
class Dog implements Animal {
    // Must give body for eat()
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    // Must give body for sleep()
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

// Main class
public class interfexample{
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
    }
}
