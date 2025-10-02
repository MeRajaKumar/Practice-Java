import java.util.*;
import java.util.Scanner;

// public class FactorialSteps {
//     public static void main(String[] args) {
//         int n = 5;
//         long result = 1;

//         System.out.print("Factorial of " + n + " = ");

//         for (int i = 1; i <= n; i++) {
//             result *= i;
//             System.out.print(i);
//             if (i < n) {
//                 System.out.print(" * "); 
//             }
//         }

//         System.out.println(" = " + result);
//     }
// }


// fun method
public class FactorialSteps {

    public static long factorialFind(int n) {
        long result = 1;

        System.out.print("Factorial of " + n + " = ");

        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" * ");
            }
        }

        System.out.println(" = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // S capital
        System.out.print("Enter the num value for the factorial: ");
        int num = sc.nextInt();

        int num= 5;
        
        // calling
        long fact = factorialFind(num);

        
    }
}

