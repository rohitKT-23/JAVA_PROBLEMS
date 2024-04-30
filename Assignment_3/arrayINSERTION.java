import java.util.Scanner;

public class arrayINSERTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_nums = sc.nextInt();

        int[] arr = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform insertion sort
        for (int i = 1; i < total_nums; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int i = 0; i < total_nums; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
