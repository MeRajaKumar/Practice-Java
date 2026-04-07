import java.util.*;


// 1. print 1 to n 
public class Print1ToN {
    public static void print(int n){
        if(n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }   

    public static void main(String[] args){
        print(5);
    }
}

// 2. print n to 1 
public class PrintNTo1 {
    public static void print(int n){
        if(n == 0) return;
        print(n);
        System.out.print(n + " ");
    }   

    public static void main(String[] args){
        print(6);
    }
}

// 3. sum of string 
public class SumOfString {
    public static int sum(String str){
        if(str.length() == 0) return 0;

        char ch = str.charAt(str.length() - 1);
        int digit = ch - '0';

        String remaining = str.substring(0, str.length() - 1);

        return digit + sum(remaining);
    }

    public static void main(String[] args){
        System.out.println(sum("123"));
    }
}

// 4. Factorial
public class FactorialOfNum {
    public static int fact(int num){
        if(num == 0) return 1;
        
        return n * fact(n-1);
    }

    public static void main(String[] args){
        int fact = fact(5);
        System.out.println(fact);
    }
}

public class FactorialPrint {
    public static void printFact(int num){
        if(num == 1){
            System.out.print(1);
            return;
        }

        System.out.print(num + "*");
        printFact(num - 1);
    }

    public static void main(String[] args){
        printFact(5);
    }
}

