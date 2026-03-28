import java.util.Scanner;
import java.util.*;

public class PrimeNumber{
    public static void main(String args[]){

        // method 1
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Prime Number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is Not a Prime Number.");


        // ---- method 2 ----
        // canner sc = new Scanner(System.in);
        
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        
        // boolean isPrime = true;

        // if (num <= 1) {
        //     isPrime = false;
        // } else {
        //     // check divisibility from 2 to sqrt(num)
        //     for (int i = 2; i <= Math.sqrt(num); i++) {
        //         if (num % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }

        // if (isPrime)
        //     System.out.println(num + " is a Prime Number.");
        // else
        //     System.out.println(num + " is Not a Prime Number.");
    }
}