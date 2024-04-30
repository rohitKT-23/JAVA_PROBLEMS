import java.util.Arrays;
import java.util.Scanner;

public class arrayPAIRSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // number of elements in array
        int num_limit = sc.nextInt();

    // array elements
        int[] array = new int[num_limit];
        for (int i = 0; i < num_limit; i++) {
            array[i] = sc.nextInt();
        }

    // target
        int target = sc.nextInt();

    // result
        PAIRS(array, target);
        sc.close();
    }

    private static void PAIRS(int[] array, int target) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            int result_value = target - array[i];

            // Use binary search to find the result_value in the array
            int index = Arrays.binarySearch(array, i + 1, array.length, result_value);

            if (index >= 0) {
            //PAIR FOUND!!
                System.out.println(array[i] + " and " + array[index]);
            }
        }
    }
}
