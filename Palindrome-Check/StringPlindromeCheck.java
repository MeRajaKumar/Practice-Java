import java.util.Scanner;

// Logic class for string palindrome
class Solution {
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

// Main class to test the method
public class PalindromeStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }
}
