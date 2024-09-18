import java.util.Scanner;

public class BestStudentFinder {
    public static void main(String[] args) {
        // Number of students and subjects
        final int NUM_STUDENTS = 10;
        final int NUM_SUBJECTS = 5;
        
        // 2D array to hold marks
        int[][] marks = new int[NUM_STUDENTS][NUM_SUBJECTS];
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for each student
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
        
        // Variables to find the best student
        int bestStudentIndex = 0;
        double highestAverage = 0;

        // Calculate average marks for each student and find the best
        for (int i = 0; i < NUM_STUDENTS; i++) {
            double total = 0;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                total += marks[i][j];
            }
            double average = total / NUM_SUBJECTS;
            System.out.println("Average marks for student " + (i + 1) + ": " + average);

            // Check if this student has the highest average
            if (average > highestAverage) {
                highestAverage = average;
                bestStudentIndex = i;
            }
        }
        
        // Display the best student's marks
        System.out.println("\nBest student: Student " + (bestStudentIndex + 1) + " with average: " + highestAverage);
        System.out.println("Marks obtained:");
        for (int j = 0; j < NUM_SUBJECTS; j++) {
            System.out.print("Subject " + (j + 1) + ": " + marks[bestStudentIndex][j] + " ");
        }
        
        scanner.close();
    }
}
