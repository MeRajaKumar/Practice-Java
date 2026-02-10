// method 1
public class FindIndexOfAnArray {

    // Method to find index of a value in array
    public static int contain(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;  // found, return index
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };

        int ind = contain(my_array1, 1457);
        if(ind != -1) {
            System.out.println("1457 found at index: " + ind);
        } else {
            System.out.println("1457 not found");
        }

        int ind2 = contain(my_array1, 1800);
        if(ind2 != -1) {
            System.out.println("1800 found at index: " + ind2);
        } else {
            System.out.println("1800 not found");
        }
    }
}


// method 2
public class FindIndexOfAnArray {

    // Method to find index of a value in array
    public static int contain(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;  // found, return index
            }
        }
        return -1; // not found
    }

    public static void main(String args[]) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };

        // Directly inside println
        System.out.println(
            contain(my_array1, 1457) != -1 
            ? "1457 found at index: " + contain(my_array1, 1457) 
            : "1457 not found"
        );

        System.out.println(
            contain(my_array1, 1800) != -1 
            ? "1800 found at index: " + contain(my_array1, 1800) 
            : "1800 not found"
        );
    }
}

// method 3
public class FindIndexOfAnArray {

    // Method to find index of a value in array
    public static int contain(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;  // found, return index
            }
        }
        return -1; // not found
    }

    // Helper method to print result
    public static void printResult(int[] arr, int val) {
        int index = contain(arr, val);  // call once
        if (index != -1) {
            System.out.println(val + " found at index: " + index);
        } else {
            System.out.println(val + " not found");
        }
    }

    public static void main(String args[]) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };

        // Call helper method for each value
        printResult(my_array1, 1457);
        printResult(my_array1, 1800);
    }
}
