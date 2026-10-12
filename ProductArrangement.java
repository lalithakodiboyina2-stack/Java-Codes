/*
7. Product Arrangement — Recursion
Scenario
An online shopping company wants to calculate the number of ways products can be arranged.
For N different products, the number of arrangements is N factorial.
For example, 5 products can be arranged in 120 different ways.
Create a recursive method factorial().
The method should accept the number of products.
Use a proper base condition for the recursion.
Return the factorial value to the calling method.
Display the number of possible arrangements.
Input Format
5
Output Format
120
*/

import java.util.Scanner;

public class ProductArrangement {

    // Recursive method
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}