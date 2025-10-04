// Find the Smallest Element in an Array
// 1 : traditional method
public class Array_SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        int min = arr[0];  // assume first element is min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // update min
            }
        }

        System.out.println("Smallest element = " + min);
    }
}


// 2 : usning Array.sort()
import java.util.Arrays;

public class Array_SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 89, 12, 99, 56};

        Arrays.sort(arr);  // ascending order
        int min = arr[0]; // smallest element

        System.out.println("Smallest element = " + min);
    }
}



// 3 : using collection
import java.util.*;

public class SmallestInArray {
    public static void main(String[] args) {
        Integer[] arr = {25, 47, 89, 12, 99, 56};

        int min = Collections.min(Arrays.asList(arr));

        System.out.println("Smallest element = " + min);
    }
}

