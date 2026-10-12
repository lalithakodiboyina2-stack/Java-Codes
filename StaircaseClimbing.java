
/*
9. Staircase Climbing — Recursion
Scenario
A student is climbing a staircase containing N steps.
At every move, the student can climb either 1 step or 2 steps.
The student wants to know the total number of different ways to reach the top.
For example, for 4 steps, there are 5 possible ways.
Create a recursive method countWays().
The method should calculate the number of possible combinations.
Use appropriate base cases for 0 and 1 step.
Do not use loops.
Return and display the total number of ways.
Input Format
4
Output Format
5
*/

import java.util.Scanner;

public class StaircaseClimbing {

    // Recursive method
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }
}