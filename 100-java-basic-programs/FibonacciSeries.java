import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(a);  

            if (i < num) {
                System.out.print(", "); 
            }

            int next = a + b; 
            a = b;           
            b = next;
        }
    }
}
