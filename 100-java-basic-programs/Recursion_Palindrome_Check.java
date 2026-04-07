// Palindrome Number Check

import java.util.*;

public class FactorialPrint {
    public static boolean palindrome(String str){
        if(str.length() <= 1) return true;

        if(str.charAt(0) == str.charAt(str.length()-1)){
            String remainingString = str.substring(1, str.length() - 1);
            return palindrome(remainingString);
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.print(palindrome("madam"));
    }
}

public class NumberPalindrome {

    public static boolean palindrome(String str){
        if(str.length() <= 1) return true;

        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }

        return palindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args){
        int num = 121;

        String str = String.valueOf(num); // number → string
        System.out.println(palindrome(str));
    }
}