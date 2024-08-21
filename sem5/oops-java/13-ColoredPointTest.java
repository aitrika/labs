// Base class representing a point with coordinates
class Point {
    private int x; // X-coordinate
    private int y; // Y-coordinate

    // Constructor to initialize coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for X-coordinate
    public int getX() {
        return x;
    }

    // Getter for Y-coordinate
    public int getY() {
        return y;
    }

    // Method to display the coordinates of the point
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass representing a colored point with an additional color property
class ColoredPoint extends Point {
    private String color; // Color of the point

    // Constructor to initialize coordinates and color
    public ColoredPoint(int x, int y, String color) {
        super(x, y); // Call the constructor of the base class
        this.color = color;
    }

    // Method to change the color of the point
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to display the coordinates and color of the point
    @Override
    public void display() {
        super.display(); // Call the base class display method
        System.out.println("Point color: " + color);
    }
}

// Main class to test the ColoredPoint class
public class ColoredPointTest {
    public static void main(String[] args) {
        // Create an instance of ColoredPoint with initial values
        ColoredPoint coloredPoint = new ColoredPoint(10, 20, "Red");

        // Display the point's information
        System.out.println("Before changing color:");
        coloredPoint.display();

        // Change the color of the point
        coloredPoint.changeColor("Blue");

        // Display the point's information again to show the updated color
        System.out.println("After changing color:");
        coloredPoint.display();
    }
}
