import java.util.Scanner;

class Solution {
    // Check if number is palindrome
    public boolean isPalindrome(int n) {
        int rev = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    // Check if string is palindrome
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a number or string to check palindrome: ");
        String input = sc.nextLine();

        // Check if input is a number
        if (input.matches("-?\\d+")) {
            int num = Integer.parseInt(input);
            if (sol.isPalindrome(num)) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is not a palindrome.");
            }
        } else {
            if (sol.isPalindrome(input)) {
                System.out.println("\"" + input + "\" is a palindrome.");
            } else {
                System.out.println("\"" + input + "\" is not a palindrome.");
            }
        }

        sc.close();
    }
}
