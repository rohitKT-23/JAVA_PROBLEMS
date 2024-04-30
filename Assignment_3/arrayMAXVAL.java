import java.util.Scanner;

public class arrayMAXVAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // number of elements in array
        int num_limit = sc.nextInt();

    // array elements
        int[] array = new int[num_limit];
        for (int i = 0; i < num_limit; i++) {
            array[i] = sc.nextInt();
        }

    // result
        int maxValue = MAXVAL(array);
        System.out.println(maxValue);
        sc.close();
    }

    private static int MAXVAL(int[] array) {
        if (array.length == 0) {

            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }

        int max_value = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max_value) {
                max_value = array[i];
            }
        }

        return max_value;
    }
}
