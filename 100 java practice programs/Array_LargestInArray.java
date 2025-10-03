// 1 : traditional method
public class Array_LargestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        int max = arr[0];  // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // update max
            }
        }

        System.out.println("Largest element = " + max);
    }
}

// 2 : usning Array.sort()
import java.util.Arrays;

public class Array_LargestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        Arrays.sort(arr);  // sort in ascending order
        int max = arr[arr.length - 1]; // last element is largest

        System.out.println("Largest element = " + max);
    }
}


// 3 : using collection
import java.util.*;

public class LargestInArray {
    public static void main(String[] args) {
        Integer[] arr = {25, 47, 89, 12, 99, 56};

        int max = Collections.max(Arrays.asList(arr));

        System.out.println("Largest element = " + max);
    }
}
