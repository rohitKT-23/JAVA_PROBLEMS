import java.util.*;

public class move_all_zero_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();

        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        zeros_to_end(array);

        // Print the modified array
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    private static void zeros_to_end(int[] array) {
        int idx_nonzero = 0;

        // non-zero elements to the first
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap non-zero  with the first zero  
                int temp = array[i];
                array[i] = array[idx_nonzero];
                array[idx_nonzero] = temp;

                // Increment the index for non-zero 
                idx_nonzero++;
            }
        }
    }
}
