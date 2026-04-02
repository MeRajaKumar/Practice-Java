// Reverse a String : number & string
// 1. method
import java.util.*;

class String_Reverse_String{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number/String to Reverse: ");
        String str = sc.nextLine();

        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }

        System.out.println("Actual String: " + str); 
        System.out.println("Reversed String: " + reverse); 


    }
}

// Only number reversed
public class NumberRev {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number: " + rev); // Output: 4321
    }
}
