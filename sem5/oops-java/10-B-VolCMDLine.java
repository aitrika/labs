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


public class VolumeCalculatorCommandLine {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the shape and dimensions.");
            return;
        }

        Volume volume = new Volume();
        String shape = args[0].toLowerCase();

        try {
          //if shape is cube, no. of parameters should be 2
            if (shape.equals("cube")) {
                if (args.length == 2) {
                    double cubeSide = Double.parseDouble(args[1]);
                    System.out.println("Volume of the Cube: " + volume.calculateVolume(cubeSide));
                } else {
                    System.out.println("Usage for Cube: java VolumeCalculatorCommandLine cube <side>");
                }
            } 
            //if shape is cylinder, no. of parameters should be 3
            else if (shape.equals("cylinder")) {
                if (args.length == 3) {
                    double cylRadius = Double.parseDouble(args[1]);
                    double cylHeight = Double.parseDouble(args[2]);
                    System.out.println("Volume of the Cylinder: " + volume.calculateVolume(cylRadius, cylHeight));
                } else {
                    System.out.println("Usage for Cylinder: java VolumeCalculatorCommandLine cylinder <radius> <height>");
                }
            }
            //if shape is ellipsoid, no. of parameters should be 4
            else if (shape.equals("ellipsoid")) {
                if (args.length == 4) {
                    double ellipsoidA = Double.parseDouble(args[1]);
                    double ellipsoidB = Double.parseDouble(args[2]);
                    double ellipsoidC = Double.parseDouble(args[3]);
                    System.out.println("Volume of the Ellipsoid: " + volume.calculateVolume(ellipsoidA, ellipsoidB, ellipsoidC));
                } else {
                    System.out.println("Usage for Ellipsoid: java VolumeCalculatorCommandLine ellipsoid <a> <b> <c>");
                }
            } 
            //if shape is neither cube nor cylinder nor ellipsoid
            else {
                System.out.println("Unknown shape. Please specify 'cube', 'cylinder', or 'ellipsoid'.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}

