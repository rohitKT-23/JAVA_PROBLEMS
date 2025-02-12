import java.util.Scanner;

public class o_n_knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_size = sc.nextInt();
        int capicity = sc.nextInt();

        int[] w8s = new int[arr_size];
        int[] arr_vals = new int[arr_size];
        for (int arr = 0; arr < arr_size; arr++) {
            w8s[arr] = sc.nextInt();
        }
        for (int arr = 0; arr < arr_size; arr++) {
            arr_vals[arr] = sc.nextInt();
        }

        int[] max_val = new int[capicity + 1];

        for (int arr = 0; arr < arr_size; arr++) {
            for (int j = w8s[arr]; j <= capicity; j++) {
                max_val[j] = Math.max(max_val[j], max_val[j - w8s[arr]] + arr_vals[arr]);
            }
        }

        System.out.println(max_val[capicity]);

        sc.close();
    }
}
