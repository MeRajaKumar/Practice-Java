// 1 : traditional method
public class Array_SecondLargestNum {
    public static void main(String args[]) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second Largest element = " + secondlargest);
    }
}

// 2 : usning Array.sort()
import java.util.Arrays;
public class Array_SecondLargestNum {
    public static void main(String args[]) {
        int[] arr = {25, 47, 89, 12, 99, 99};

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        int secondlargest = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondlargest = arr[i];
                break;
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second Largest element = " + secondlargest);
    }
}