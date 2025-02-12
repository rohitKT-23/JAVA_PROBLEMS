import java.util.*;

public class monu_and_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of arrays
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // element of the arrays
        int[] A = new int[n1];
        int[] B = new int[n2];
        int[] C = new int[n3];

        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n3; i++) {
            C[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        // minimum absolute difference
        int min_abs_diff = min_absolute_diff(A, B, C);

        // ans
        System.out.println(min_abs_diff);

        sc.close();
    }

    private static int min_absolute_diff(int[] A, int[] B, int[] C) {
        int i = 0;
        int j = 0;
        int k = 0;
        int min_abs_diff = Integer.MAX_VALUE;

        while (i < A.length && j < B.length && k < C.length) {
            int max_val = Math.max(A[i], Math.max(B[j], C[k]));
            int min_val = Math.min(A[i], Math.min(B[j], C[k]));

            min_abs_diff = Math.min(min_abs_diff, max_val - min_val);

            if (A[i] == min_val) {
                i++;
            } else if (B[j] == min_val) {
                j++;
            } else {
                k++;
            }
        }

        return min_abs_diff;
    }
}
