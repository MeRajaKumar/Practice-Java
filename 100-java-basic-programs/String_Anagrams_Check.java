// Check if Two Strings are Anagrams


// 1 Methods: Sort & Compare
  
import java.util.*;
// class String_Anagrams_Check{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter 1st string: ");
//         String str1 = sc.nextLine();
//         System.out.print("enter 2nd string: ");
//         String str2 = sc.nextLine();

//         // String str1 = sc.nextLine().toLowerCase();
//         // String str2 = sc.nextLine().toLowerCase();

//         char[] chArrStr1 = str1.toCharArray(); 
//         Arrays.sort(chArrStr1);     
        
//         char[] chArrStr2 = str2.toCharArray(); 
//         Arrays.sort(chArrStr2); 

//         if(Arrays.equals(chArrStr1, chArrStr2)){
//             System.out.print("String is Anagrams!");
//         }else{
//             System.out.print("String is not Anagrams!");
//         }

//     }
// }

// 2 method:  Frequency Counter
class String_Anagrams_Check{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("enter 2nd string: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.print("Both Strings are not Anagrams!");
            return;
        }

        int[] freq = new int[26];

            for(int first = 0; first < str1.length(); first++){
                    freq[str1.charAt(first) - 'a']++;  
                    freq[str2.charAt(first) - 'a']--;  
                }

            for(int second = 0; second < freq.length; second++){
                if(freq[second] != 0){
                    System.out.print("Both Strings are not Anagrams!");
                    return;
                }
            }
            
            System.out.print("Both Strings are Anagrams!");
       
    }
}
