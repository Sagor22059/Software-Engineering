// Parent class
class Shape {
    // Protected property
    protected String color;

    // Protected method
    protected void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Child class
class Circle extends Shape {
    // Method to set and show color
    void setColor(String c) {
        color = c;            // Access protected variable
        displayColor();       // Call protected method
    }
}

// Main class
public class inheritanceandprotectedaccess{
    public static void main(String[] args) {
        // Create object of Circle
        Circle circle1 = new Circle();

        // Set color and display
        circle1.setColor("Red");
    }
}
