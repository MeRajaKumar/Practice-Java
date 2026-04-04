//  **Replace a Character in a String**

import java.util.*;
// 1 pettern : char ko replace kro sare
// class String_Replace_Character{
//     public static void main(String args[]){
//         String str = "yush";

//         int loop = 0;
//         char[] arr = str.toCharArray();
//         while (loop < str.length()) {
//             if(str.charAt(loop) == 'A' || str.charAt(loop) == 'a'){
//                 arr[loop] = 'b';
//             }
//             loop++;
//         }
//         System.out.print(new String(arr));  
//     }
// }

// 2 pettern : index wise replace kro
class String_Replace_Character{
    public static void main(String args[]){
        String str = "yush";

        char[] arr = str.toCharArray();
        arr[1] = 'y';
        
        System.out.print(new String(arr));  
    }
}

Pattern 3: Ek Word ko Doosre Word se Replace karo