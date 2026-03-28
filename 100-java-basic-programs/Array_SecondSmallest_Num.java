// 1 : traditional method
public class Array_SecondSmallest_Num {
    public static void main(String args[]) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
        System.out.println("Second Smallest element = " + secondSmallest);
    }
}

// 2 : usning Array.sort()
import java.util.Arrays;

public class Array_SecondSmallest_Num {
    public static void main(String args[]) {
        int[] arr = {25, 47, 89, 12, 99, 12};

        Arrays.sort(arr);

        int smallest = arr[0];
        int secondSmallest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        System.out.println("Smallest element = " + smallest);
        System.out.println("Second Smallest element = " + secondSmallest);
    }
}