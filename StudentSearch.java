/*
8. Recursive Search in Student Records
Scenario
A college stores student roll numbers in a sorted array.
The system needs to quickly find a particular roll number.
Implement the search using recursive Binary Search.
The method should receive the array, starting index, ending index, and target.
If the target is found, return its index.
If the target is not present, return -1.
The array is already sorted in ascending order.
Do not use loops for the search operation.
Display the index of the student.
Input Format
6
10 20 30 40 50 60
40
Output Format
3
*/

import java.util.Scanner;

public class StudentSearch {

    // Recursive Binary Search method
    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, target);
        System.out.println(result);
        sc.close();
    }
}
