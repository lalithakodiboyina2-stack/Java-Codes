
// Question: Delivery Route Countdown — Recursion
// Input: 5
// Output: 5 4 3 2 1

import java.util.Scanner;

public class DeliveryCountdown {

    // Recursive method
    public static void countDown(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n);
        if (n > 1) {
            System.out.print(" ");
            countDown(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countDown(n);
        sc.close();
    }
}