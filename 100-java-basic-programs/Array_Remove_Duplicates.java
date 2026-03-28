// 1. tradition methods
public class Array_Remove_Duplicate {
    public static void main(String args[]) {
        int[] arr = {14, 40, 60, 23, 14, 4, 50, 34};

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

        // print unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

// 2. hashset method