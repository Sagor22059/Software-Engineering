// First Interface
interface Animal {
    void eat();
    void sleep();
}

// Second Interface
interface Bird {
    void fly();
}

// Class implementing multiple interfaces
class Eagle implements Animal, Bird {
    public void eat() {
        System.out.println("Eagle is eating.");
    }

    public void sleep() {
        System.out.println("Eagle is sleeping.");
    }

    public void fly() {
        System.out.println("Eagle is flying.");
    }
}

public class multipleinheritance{
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
    }
}
