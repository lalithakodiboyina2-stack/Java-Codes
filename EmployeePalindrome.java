/*
6. Employee ID Palindrome — Recursion
Scenario
A company uses numeric employee IDs.
An ID is considered special if it reads the same from both directions.
For example, 121 is a valid palindrome ID.
The company wants to check this using recursion.
Create a recursive method to reverse the number or compare its digits.
Do not convert the number into a String.
The method should return true when the ID is a palindrome.
Otherwise, it should return false.
Display the result clearly.
Input Format
1221
Output Format
Palindrome
*/

import java.util.Scanner;

public class EmployeePalindrome {

    // Recursive method to reverse the number
    public static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean isPalindrome(int n) {
        n = Math.abs(n);
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (isPalindrome(id)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
