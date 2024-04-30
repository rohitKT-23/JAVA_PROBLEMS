import java.util.Scanner;

public class array_BUBBLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_num = sc.nextInt();

        int[] arr = new int[total_num];

        for (int i = 0; i < total_num; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform bubble sort
        for (int i = 0; i < total_num - 1; i++) {
            for (int j = 0; j < total_num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < total_num; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
