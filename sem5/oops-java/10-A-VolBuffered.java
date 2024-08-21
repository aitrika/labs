import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Volume {
    // Method to calculate the volume of a Cube
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Method to calculate the volume of a Cylinder
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate the volume of an Ellipsoid
    public double calculateVolume(double a, double b, double c) {
        return (4.0 / 3.0) * Math.PI * a * b * c;
    }
}

public class VolumeCalculatorBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Volume volume = new Volume();

        try {
            // Input for Cube
            System.out.print("Enter the side length of the Cube: ");
            double cubeSide = Double.parseDouble(reader.readLine());
            System.out.println("Volume of the Cube: " + volume.calculateVolume(cubeSide));

            // Input for Cylinder
            System.out.print("Enter the radius of the Cylinder: ");
            double cylRadius = Double.parseDouble(reader.readLine());
            System.out.print("Enter the height of the Cylinder: ");
            double cylHeight = Double.parseDouble(reader.readLine());
            System.out.println("Volume of the Cylinder: " + volume.calculateVolume(cylRadius, cylHeight));

            // Input for Ellipsoid
            System.out.print("Enter the semi-major axis (a) of the Ellipsoid: ");
            double ellipsoidA = Double.parseDouble(reader.readLine());
            System.out.print("Enter the semi-minor axis (b) of the Ellipsoid: ");
            double ellipsoidB = Double.parseDouble(reader.readLine());
            System.out.print("Enter the third axis (c) of the Ellipsoid: ");
            double ellipsoidC = Double.parseDouble(reader.readLine());
            System.out.println("Volume of the Ellipsoid: " + volume.calculateVolume(ellipsoidA, ellipsoidB, ellipsoidC));

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
