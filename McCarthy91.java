
/*
10. Nested Recursion — McCarthy 91
Scenario
A computer science researcher wants to study a special recursive function called McCarthy 91.
The function is defined differently based on the value of N.
If N is greater than 100, return N - 10.
Otherwise, the function calls itself twice in a nested manner.
The mathematical definition is M(n) = n - 10 when n > 100.
Otherwise, M(n) = M(M(n + 11)).
Implement this function recursively in Java.
Observe how the inner recursive call becomes the argument of the outer call.
Display the final result for the given N.
Input Format
50
Output Format
91
*/

import java.util.Scanner;

public class McCarthy91 {

    // Nested recursive method
    public static int mcCarthy(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return mcCarthy(mcCarthy(n + 11));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mcCarthy(n));
        sc.close();
    }
}