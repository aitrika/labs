// Class to represent a complex number
class Complex {
    private double real;       // Real part of the complex number
    private double imaginary;  // Imaginary part of the complex number

    // Default constructor - initializes to 0 + 0i
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor - initializes with given real and imaginary parts
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor - initializes with another Complex object
    public Complex(Complex other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new Complex(resultReal, resultImaginary);
    }

    // Method to subtract one complex number from another
    public Complex subtract(Complex other) {
        double resultReal = this.real - other.real;
        double resultImaginary = this.imaginary - other.imaginary;
        return new Complex(resultReal, resultImaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double resultReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double resultImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(resultReal, resultImaginary);
    }

    // Method to display the complex number
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

// Main class to test the Complex class
public class ComplexTest {
    public static void main(String[] args) {
        // Using default constructor
        Complex c1 = new Complex();
        // Using parameterized constructor
        Complex c2 = new Complex(4, 5);
        // Using copy constructor
        Complex c3 = new Complex(c2);

        // Performing operations
        Complex sum = c2.add(c3);
        Complex difference = c2.subtract(c3);
        Complex product = c2.multiply(c3);

        // Displaying results
        System.out.println("Complex number c2: " + c2);
        System.out.println("Complex number c3: " + c3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
