import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        // Question:
        // Write a Java program to input electricity unit charges and calculate the total electricity bill
        // according to the given conditions:
        // - For first 50 units: Rs. 0.50/unit
        // - For next 100 units (51–150): Rs. 0.75/unit
        // - For next 150 units (151–300): Rs. 1.20/unit
        // - For units above 300: Rs. 1.50/unit
        // - If the total bill exceeds Rs. 300, then a 20% surcharge is added

        Scanner sc = new Scanner(System.in);
        double units, bill = 0, surcharge = 0;

        System.out.print("Enter electricity units consumed: ");
        units = sc.nextDouble();

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 300) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (150 * 1.20) + ((units - 300) * 1.50);
        }

        // Apply surcharge only if bill > 300
        if (bill > 300) {
            surcharge = bill * 0.20;
        }

        double totalBill = bill + surcharge;

        System.out.printf("Total Electricity Bill: Rs. %.2f\n", totalBill);
    }
}
