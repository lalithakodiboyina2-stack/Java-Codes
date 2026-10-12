// Question: Electricity Bill Calculator — Methods
// Scenario: A power company wants to automate its monthly electricity billing system.
// Each customer provides the number of units consumed during the month.
// The billing system calculates the amount based on different consumption slabs.
// The first 100 units cost Rs.2 per unit.
// The next 100 units cost Rs.3 per unit.
// Units above 200 cost Rs.5 per unit.
// Create a method calculateBill() to calculate the total bill.
// The method should receive units as a parameter.
// It should return the calculated bill amount.
// Display the final bill to the customer.
// Input Format: 250
// Output Format: 750

import java.util.Scanner;

public class Bill{

    // Method to calculate bill
    public static int calculateBill(int units) {
        int bill = 0;
        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int totalBill = calculateBill(units);
        System.out.println(totalBill);
        sc.close();
    }
}