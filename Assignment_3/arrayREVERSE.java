import java.util.Scanner;

public class arrayREVERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of elements in array
        int num_limit = sc.nextInt();

        // Input the elements of the array
        int[] array = new int[num_limit];
        for (int i = 0; i < num_limit; i++) {
            array[i] = sc.nextInt();
        }

        //results
        REVERSE(array);

        //reverse the array
        for (int i = 0; i < num_limit; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }

    private static void REVERSE(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements 
        while (start < end) {
            // Swap array
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            //moving to center
            start++;
            end--;
        }
    }
}
