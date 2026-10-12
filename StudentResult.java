// Question: 2. Student Result Analyzer — Methods
// Scenario: A college wants to automatically generate student results.
// A student has marks in five different subjects.
// The system should calculate the total marks using a method.
// It should also calculate the average marks using another method.
// Based on the average, the student's grade must be calculated.
// Average >= 90 → A; Average >= 75 → B; Average >= 60 → C.
// Average >= 40 → D; otherwise F.
// Create separate methods for total, average, and grade.
// Display the complete result.
// Input Format: 80 72 91 68 75
// Output Format:
// Total: 386
// Average: 77.2
// Grade: B

import java.util.Scanner;

public class StudentResult {

    // Method to calculate total
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Method to calculate average
    public static double calculateAverage(int total, int n) {
        return (double) total / n;
    }

    // Method to calculate grade
    public static char calculateGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total, marks.length);
        char grade = calculateGrade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}