// Define a class called Student
class Student {
    // Properties (Variables)
    String name;
    int rollNumber;

    // Method (Function)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class to run the program
public class classesandobject {
    public static void main(String[] args) {
        // Create first object
        Student student1 = new Student();
        student1.name = "Alice";
        student1.rollNumber = 101;

        // Create second object
        Student student2 = new Student();
        student2.name = "Bob";
        student2.rollNumber = 102;

        // Display information of both students
        System.out.println("Student 1:");
        student1.displayDetails();

        System.out.println("\nStudent 2:");
        student2.displayDetails();
    }
}
