import java.util.Scanner;

public class arrayLINEAR {
    public static void sort012(int[] arr, int n) {
        int lw = 0; // Pointer for 0s
        int md = 0; // Pointer for 1s
        int hi = n - 1; // Pointer for 2s

        while (md <= hi) {
            switch (arr[md]) {
                case 0:
                    swap(arr, lw, md);
                    lw++;
                    md++;
                    break;
                case 1:
                    md++;
                    break;
                case 2:
                    swap(arr, md, hi);
                    hi--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt();
        int[] arr = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            arr[i] = sc.nextInt();
        }

        sort012(arr, total_nums);

        for (int i = 0; i < total_nums; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
