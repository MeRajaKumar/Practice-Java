import java.util.Scanner;

public class SumofNnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for sum : ");
        int num = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println("Sum is: " + total);
    }
}

// 2nd method
import java.util.Scanner;

public class SumofNnumber {
    // Function to calculate the sum
    public static int sumOfNaturalNumbers(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number for sum : ");
        int num = sc.nextInt();
        int result = sumOfNaturalNumbers(num);
        System.out.println("Sum is: " + result);
    }
}
