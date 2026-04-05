// Remove White Spaces from a String
import java.util.*;

// 1. method:  (loop + condition)
// eg: Ayush Gupta - AyushGupta
// class String_Remove_WhiteSpaces{

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your string: ");
//         String str = sc.nextLine();

//         char[] arr = str.toCharArray();
//         String result = "";

//         for(int loop = 0; loop < arr.length ; loop ++ ){
//             if(arr[loop] != ' '){
//                 result += arr[loop];
//             } 
            
//         }
//         System.out.println("Your reformed string is: " +result);
//     }
// }

// method 1: but
// eg: Aaysuh Gupta -> AayushGupta
// class String_Remove_WhiteSpaces{

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your string: ");
//         String str = sc.nextLine();

//         char[] arr = str.toCharArray();
//         String result = "";

//         for(int loop = 0; loop < arr.length ; loop ++ ){
//             if(arr[loop] != ' '){
//                 result += arr[loop];
//             }else{
//                 if(loop+1 < arr.length && arr[loop+1] != ' '){
//                 result += Character.toLowerCase(arr[loop+1]);
//                 loop++;
//                 }
//             }
//         }
//         System.out.println("Your reformed string is: " +result);
//     }
// }

// method 2: replace(" ", "") & replaceAll("//s+","")
class String_Remove_WhiteSpaces{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        str = str.replace(" ","");
        str = str.replaceAll("\\s+","");
        System.out.println("Your reformed string is: " +str);
    }
}