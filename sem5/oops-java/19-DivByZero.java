public class DivideByZeroExample {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // Change this to test different scenarios
        int quotient = 0;

        try {
            quotient = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred");
            quotient = -1;
        } finally {
            System.out.println("The result is: " + quotient);
        }
    }
}
