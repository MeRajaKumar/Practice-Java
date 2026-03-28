import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;  // Save original number for comparison
        int rev = 0;

        while (num != 0) {
            int rem = num % 10;      // Get last digit
            rev = rev * 10 + rem;    // Add it to reversed number
            num = num / 10;          // Remove last digit
        }

        if (originalNum == rev) {
            System.out.println(originalNum + " is a palindrome number!");
        } else {
            System.out.println(originalNum + " is not a palindrome number!");
        }


        // // ---- method 2 : with string value ----
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a word or number: ");
        // String input = sc.nextLine();  // Accept any input as string

        // String reversed = "";

        // // Reverse the input
        // for (int i = input.length() - 1; i >= 0; i--) {
        //     reversed = reversed + input.charAt(i);
        // }

        // // Check palindrome
        // if (input.equals(reversed)) {
        //     System.out.println(input + " is a palindrome!");
        // } else {
        //     System.out.println(input + " is not a palindrome!");
        //}
    }
}
