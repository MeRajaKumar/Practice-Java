public class InterpolationSearch {

    // Interpolation Search function
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            // Avoid division by zero
            if (arr[low] == arr[high]) {
                if (arr[low] == x) return low;
                return -1;
            }

            // Estimate position
            int pos = low + ((x - arr[low]) * (high - low)) 
                      / (arr[high] - arr[low]);

            // Check the position
            if (arr[pos] == x)
                return pos;

            // If x is larger, search right
            if (arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int x = 70;

        int result = interpolationSearch(arr, x);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
