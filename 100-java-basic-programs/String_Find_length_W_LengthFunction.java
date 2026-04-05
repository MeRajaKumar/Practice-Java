// Find the Length of a String Without Using length() Method
// 

// 1. method: toCharArray() using
import java.util.*;
class String_Find_length_W_LengthFunction{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int length = 0;

        for(int loop = 0; loop < arr.length ; loop ++ ){
            length++;
        }
        System.out.print("Length is: "+length);
    }
}

// 2. Using try-catch with charAt()
// 4. Using split("")
// 6. Using StringBuilder or StringBuffer
// 7. Using regex / replaceAll()

