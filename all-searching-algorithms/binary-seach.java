public class BinarySearchExample {

    // Binary Search function
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // found
            } else if (arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 18, 23, 45, 89};
        int key = 23;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found");
        }
    }
}
