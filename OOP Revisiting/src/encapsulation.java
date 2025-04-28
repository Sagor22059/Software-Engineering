// Class with Encapsulation
class Employee {
    // Private variables (hidden from outside)
    private String name;
    private int salary;

    // Public setter method to set name
    public void setName(String n) {
        name = n;
    }

    // Public getter method to get name
    public String getName() {
        return name;
    }

    // Public setter method to set salary
    public void setSalary(int s) {
        salary = s;
    }

    // Public getter method to get salary
    public int getSalary() {
        return salary;
    }
}

// Main class
public class encapsulation {
    public static void main(String[] args) {
        // Create object of Employee
        Employee emp1 = new Employee();

        // Set values using setter methods
        emp1.setName("Alice");
        emp1.setSalary(50000);

        // Get values using getter methods
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee Salary: $" + emp1.getSalary());
    }
}
