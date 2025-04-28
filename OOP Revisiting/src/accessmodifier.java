
// Class with public access
 class Person {
    // public variable
    public String name;

    // private variable
    private int age;

    // default (no modifier) variable
    String city;

    // public method to set private age
    public void setAge(int newAge) {
        age = newAge;
    }

    // public method to display details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class accessmodifier {
    public static void main(String[] args) {
        // Create object
        Person p1 = new Person();

        // Access public variable directly
        p1.name = "John";

        // Access default variable directly
        p1.city = "New York";

        // Cannot access private variable directly
        // p1.age = 25; // ❌ Error!

        // Instead, use a method to set private variable
        p1.setAge(25);

        // Show all information
        p1.displayInfo();
    }
}
