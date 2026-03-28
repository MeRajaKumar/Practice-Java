import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Array_Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {14, 40, 60, 23, 14, 4, 50, 34, 40, 23};

        System.out.println("Original array: " + Arrays.toString(arr));

        // 1. Traditional Method
        System.out.println("Traditional Method: " + Arrays.toString(removeDuplicatesTraditional(arr)));

        // 2. HashSet Method
        System.out.println("HashSet Method: " + Arrays.toString(removeDuplicatesUsingHashSet(arr)));

        // 3. Sorting + Compare Method
        System.out.println("Sorting + Compare Method: " + Arrays.toString(removeDuplicatesUsingSorting(arr)));

        // 4. ArrayList + contains() Method
        System.out.println("ArrayList + contains() Method: " + Arrays.toString(removeDuplicatesUsingArrayList(arr)));
    }

    // 1. Traditional Method
    // Check each element manually before storing it in a temporary array
    public static int[] removeDuplicatesTraditional(int[] arr) {
        int[] temp = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size] = arr[i];
                size++;
            }
        }

        return Arrays.copyOf(temp, size);
    }

    // 2. HashSet Method
    // Automatically removes duplicates
    // LinkedHashSet is used to keep original insertion order
    public static int[] removeDuplicatesUsingHashSet(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    // 3. Sorting + Compare Method
    // First sort the array
    // Then compare adjacent elements
    public static int[] removeDuplicatesUsingSorting(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int[] temp = new int[sortedArr.length];
        int size = 1;
        temp[0] = sortedArr[0];

        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != sortedArr[i - 1]) {
                temp[size] = sortedArr[i];
                size++;
            }
        }

        return Arrays.copyOf(temp, size);
    }

    // 4. ArrayList + contains() Method
    // Store elements in ArrayList
    // Add only if the element is not already present
    public static int[] removeDuplicatesUsingArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
