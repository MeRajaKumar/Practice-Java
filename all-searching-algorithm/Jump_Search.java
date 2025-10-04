import java.util.Arrays;

public class JumpSearchExample {

    // Method for Jump Search
    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;

        // Step size (√n)
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        // Jump until we pass the element or reach the end
        while (arr[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; // not found
            }
        }

        // Linear search within the block
        while (arr[prev] < key) {
            prev++;
            // If we reach the end of array
            if (prev == Math.min(step, n)) {
                return -1;
            }
        }

        // If element found
        if (arr[prev] == key) {
            return prev;
        }

        return -1; // Not found
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 16;

        int index = jumpSearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }
}
