import java.util.Scanner;

public class arraySELECTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_nums = sc.nextInt();

        int[] arr = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform selection sort
        for (int i = 0; i < total_nums - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < total_nums; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i = 0; i < total_nums; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
