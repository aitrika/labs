## Shape/Figure.java

```java
package Shape;

public class Figure {
    public double computeVolume(double side) {
        return side * side * side;
    }

    public double computeVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public double computeVolume(double length, double width, double height) {
        return length * width * height;
    }
}

```
## Main.java

```java
import Shape.Figure;

public class Main {
    public static void main(String[] args) {
        Figure fig = new Figure();

        double cubeVolume = fig.computeVolume(3); // Volume of a cube
        double cylinderVolume = fig.computeVolume(3, 5); // Volume of a cylinder
        double boxVolume = fig.computeVolume(2, 3, 4); // Volume of a rectangular box

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Rectangular Box: " + boxVolume);
    }
}
```
