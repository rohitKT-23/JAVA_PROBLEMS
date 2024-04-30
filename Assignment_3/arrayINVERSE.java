import java.util.Scanner;

public class arrayINVERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // number of elements in array
        int num_limit = sc.nextInt();

    // array elements
        int[] arr = new int[num_limit];
        for (int i = 0; i < num_limit; i++) {
            arr[i] = sc.nextInt();
        }

    // calling function
        INVERSE(arr, 1, num_limit - 1);

    
        for (int i = 0; i < num_limit; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }


    private static void INVERSE(int[] array, int start, int end) {
        if (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            INVERSE(array, start + 1, end - 1);
        }
    }
}
