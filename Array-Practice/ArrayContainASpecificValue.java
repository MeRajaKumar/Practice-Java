public class ArrayContainASpecificValue {

    // Method to check if array contains a value
    public static boolean contain(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;  // found
            }
        }
        return false; // not found after checking all
    }

    public static void main(String args[]) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };

        System.out.println(contain(my_array1, 1457)); // true
        System.out.println(contain(my_array1, 1800)); // false
    }
}

// output Sample Output:
// true                                                                                                       
// false 
