// Count the Number of Words in a String
import java.util.*;

class String_Count_Number_of_Words{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int count = 0;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ' '){
                count++;
            }
            
        }
        System.out.println("total words: "+ (count+1));
    }
}