public class AverageOfArray {
    public static void main(String args[]) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int length = my_array.length;
        int sum = 0;
        for (int i : my_array)
            sum += i;


        // or 2nd loop can be
        // for (int i = 0; i < my_array.length; i++) {
        //     sum = sum + my_array[i];
        // }

        System.out.println("The sum is " + sum);

        double average = (double) sum / length;  // cast to double
        System.out.println("The average of array is " + average);
    }
}
