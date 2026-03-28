// 1. traditional method
import java.util.Scanner;

public class Array_Sum_of_Array {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number for sum : ");
        // int num = sc.nextInt();

        int tot = 0;
        int[] arr = {20,30,40,50,60,70,80};

        for(int i = 0; i < arr.length; i++){
            tot +=  arr[i];
        }
        
        System.out.print("The sum of Array element is : " + tot);

    }
}