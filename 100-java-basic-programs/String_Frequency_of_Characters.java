//  Find the Frequency of Characters in a String

import java.util.*;
class String_Frequency_of_Characters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your character to check frequency: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            if(str.indexOf(str.charAt(i)) == i){ 
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            System.out.println("Frequency of String: " +(str.charAt(i))+ " = " +count);
        }
        
        }
    }
}


// 2. Method
import java.util.*;
class String_Frequency_of_Characters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        int totalRepeated = 0;

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            if(str.indexOf(str.charAt(i)) == i){ 
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                if(count > 1){
                    System.out.println(str.charAt(i) + " = " + count + " times");
                    totalRepeated++;  // sirf repeated characters count karo
                }
            }
        }
        System.out.println("Total Repeated Characters = " + totalRepeated);
    }
}

// **Output:**
// ```
// Enter your String: AAYUSH
// A = 2 times
// Total Repeated Characters = 1
// ```

// **Logic:**
// ```
// count > 1  → tabhi print karo (repeated hai)
// totalRepeated++ → sirf repeated ka count badhao