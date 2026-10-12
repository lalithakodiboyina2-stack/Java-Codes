/*
5. Bank Transaction Digit Sum — Recursion
Scenario
A bank generates a numeric transaction ID for every transaction.
The bank wants to calculate the sum of all digits in the transaction ID.
For example, transaction ID 5832 contains digits 5, 8, 3, and 2.
The digit sum is 18.
Create a recursive method digitSum().
The method should accept the transaction ID as an integer.
Extract the last digit during every recursive call.
Continue until all digits are processed.
Return the final digit sum.
Input Format
5832
Output Format
18
*/

import java.util.Scanner;

public class BankTransaction {

    public static int digitSum(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (id == 0) {
            System.out.println(0);
        } else {
            System.out.println(digitSum(id));
        }
        sc.close();
    }
}