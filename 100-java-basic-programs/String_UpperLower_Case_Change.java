//  **Convert a String to Uppercase and Lowercase**

// 1 method: 

import java.util.*;
class String_UpperLower_Case_Change{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        boolean hasCapital = false;

        for( int loop = 0; loop < str.length() ; loop ++) {
            if( str.charAt(loop) >= 'A' && str.charAt(loop) <= 'Z'){
                hasCapital = true;
                break;
            }
        }

        if(hasCapital){
            System.out.print(str.toLowerCase());
        }else{
            System.out.print(str.toUpperCase());
        }
        }
}