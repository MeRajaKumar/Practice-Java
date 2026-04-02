// Count the Number of Vowels and Consonants in a String

// 1. Method
import java.util.Scanner;

// public class String_Vowel_Consonant_Check {

//     public static int vowelCountCheck(String str) {
//         int vowelCount = 0;
//         for (int i = 0; i <= str.length() - 1; i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                 vowelCount++;
//             }
//         }
//         return vowelCount;
//     }

//     public static int consonantCountCheck(String str) {
//         int consonantCount = 0;
//         for (int i = 0; i <= str.length() - 1; i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                 // vowel hai, skip
//             } else if (Character.isLetter(ch)) {
//                 consonantCount++;
//             }
//         }
//         return consonantCount;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your string to count: ");
//         String str = sc.nextLine();

//         int vowelCount = vowelCountCheck(str);
//         int consonantCount = consonantCountCheck(str);

//         System.out.println("Total num of Vowels: " + vowelCount);
//         System.out.println("Total num of Consonants: " + consonantCount);
//     }

// }

// 2. Methods String.contains() ya indexOf()

public class String_Vowel_Consonant_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string to count: ");
        String str = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i <= str.length()-1; i++){
            Character ch = str.charAt(i);

            // or
            // String vowels = "aeiou";
            // char ch = Character.toLowerCase(str.charAt(i));

            if(vowels.indexOf(ch) != -1){ vowelCount ++; }
            else if(Character.isLetter(ch)){ consonantCount++; }
        }


        System.out.println("Total num of Vowels: " + vowelCount);
        System.out.println("Total num of Consonants: " + consonantCount);
    }

}

// 3. Method : toLowerCase() se simplify 