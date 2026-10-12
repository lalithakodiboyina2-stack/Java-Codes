// Question: 3. ATM Withdrawal System — Methods
// Scenario: An ATM needs to validate withdrawal requests.
// The customer enters their current account balance.
// The customer then enters the amount they want to withdraw.
// The withdrawal amount must be positive.
// It must also be a multiple of 100.
// The withdrawal amount must not exceed the available balance.
// Create a method canWithdraw() to perform these validations.
// The method should return true or false.
// Display whether the transaction is successful.
// Input Format
// 5000
// 1200
// Output Format
// Withdrawal Successful
// Remaining Balance: 3800

import java.util.Scanner;

public class ATMWithdrawal {

    // Method to validate withdrawal
    public static boolean canWithdraw(int balance, int amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount % 100 != 0) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdrawAmount = sc.nextInt();

        if (canWithdraw(balance, withdrawAmount)) {
            int remaining = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + remaining);
        } else {
            System.out.println("Withdrawal Failed");
            System.out.println("Remaining Balance: " + balance);
        }

        sc.close();
    }
}