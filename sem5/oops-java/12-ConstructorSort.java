// Class to represent an object with five integer data members
public class IntegerSorter {
    private int num1; // First integer
    private int num2; // Second integer
    private int num3; // Third integer
    private int num4; // Fourth integer
    private int num5; // Fifth integer

    // Default constructor - initializes integers to 0
    public IntegerSorter() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
        this.num4 = 0;
        this.num5 = 0;
    }

    // Parameterized constructor - initializes integers with given values
    public IntegerSorter(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    // Method to sort the integer data members using Bubble Sort
    public void bubbleSort() {
        // Array to hold the integers
        int[] array = {num1, num2, num3, num4, num5};
        int n = array.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the element found is greater than the next element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Assign sorted values back to the data members
        num1 = array[0];
        num2 = array[1];
        num3 = array[2];
        num4 = array[3];
        num5 = array[4];
    }

    // Method to display the sorted integers
    public void display() {
        System.out.println("Sorted integers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    }

    // Main method to test the IntegerSorter class
    public static void main(String[] args) {
        // Using parameterized constructor
        IntegerSorter sorter = new IntegerSorter(5, 2, 9, 1, 3);

        // Display integers before sorting
        System.out.println("Before sorting:");
        sorter.display(); // Displays: Before sorting: 5, 2, 9, 1, 3

        // Sort the integers
        sorter.bubbleSort();

        // Display integers after sorting
        System.out.println("After sorting:");
        sorter.display(); // Displays: After sorting: 1, 2, 3, 5, 9
    }
}
/*
If you skip the part where the sorted array values are assigned back to the integer data members (num1, num2, num3, num4, num5),
the original integer data members will not be updated with the sorted values. Here’s what happens:

IntegerSorter sorter = new IntegerSorter(5, 2, 9, 1, 3);

System.out.println("Before sorting:");
sorter.display(); // Displays: Before sorting: 5, 2, 9, 1, 3

sorter.bubbleSort(); // Sorts the array but does not update num1, num2, etc.

System.out.println("After sorting:");
sorter.display(); // Still displays: 5, 2, 9, 1, 3


*/
