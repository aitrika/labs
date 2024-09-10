interface Volume {
    double calculateInVolume(double s1, double s2, double s3);
    double calculateOutVolume(double s1, double s2, double s3);
}

class MachinePart implements Volume {
    public double calculateInVolume(double s1, double s2, double s3) {
        return (1.0/3.0) * Math.PI * s1 * s2 * s3;
    }

    public double calculateOutVolume(double s1, double s2, double s3) {
        return (4.0/3.0) * Math.PI * s1 * s2 * s3;
    }
}

public class VolumeTest {
    public static void main(String[] args) {
        MachinePart part = new MachinePart();
        double s1 = 3.0, s2 = 4.0, s3 = 5.0;

        System.out.println("InVolume: " + part.calculateInVolume(s1, s2, s3));
        System.out.println("OutVolume: " + part.calculateOutVolume(s1, s2, s3));
    }
}
