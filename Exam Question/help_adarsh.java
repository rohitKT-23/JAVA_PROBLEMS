import java.util.*;

public class help_adarsh {

    public static int minimum_subArray_sum(int[] array) {
        int ans = 0;
        int num = array.length;

        for (int i = 0; i < num; i++) {
            // To store the minimum element for the current subarray
            int min_element = array[i];

            // Inner loop: iterate from the current index 'i' to the end of the array
            for (int j = i; j < num; j++) {
                // Finding the minimum element of the subarray
                min_element = Math.min(min_element, array[j]);

                // Adding the minimum element of the subarray to the answer
                ans += min_element;
            }
        }

        // minimum sum of all subarrays
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();

        int[] array = new int[array_size];


        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        // Function call
        System.out.println(minimum_subArray_sum(array));
    }
}
