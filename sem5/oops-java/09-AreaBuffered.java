import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Class for Rectangle
class Rectangle {
    private double length;
    private double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }
}

// Class for Circle
class Circle {
    private double radius;

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class for Square
class Square {
    private double side;

    // Parameterized constructor
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area
    public double calculateArea() {
        return side * side;
    }
}

// Main class
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Input for Rectangle
            System.out.print("Enter the length of the Rectangle: ");
            double rectLength = Double.parseDouble(reader.readLine());
            System.out.print("Enter the width of the Rectangle: ");
            double rectWidth = Double.parseDouble(reader.readLine());
            Rectangle rectangle = new Rectangle(rectLength, rectWidth);
            System.out.println("Area of the Rectangle: " + rectangle.calculateArea());

            // Input for Circle
            System.out.print("Enter the radius of the Circle: ");
            double circleRadius = Double.parseDouble(reader.readLine());
            Circle circle = new Circle(circleRadius);
            System.out.println("Area of the Circle: " + circle.calculateArea());

            // Input for Square
            System.out.print("Enter the side length of the Square: ");
            double squareSide = Double.parseDouble(reader.readLine());
            Square square = new Square(squareSide);
            System.out.println("Area of the Square: " + square.calculateArea());

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
