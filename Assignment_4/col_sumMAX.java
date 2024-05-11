import java.util.Scanner;

public class col_sumMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int T_rolcol = sc.nextInt();

        // i => row
        // j => col
        int[][] array = new int[T_rolcol][T_rolcol];
        for (int row = 0; row < T_rolcol; row++) {
            for (int col = 0; col < T_rolcol; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        // finding index of max sum
        int[] ans = colMAXSUM(array, T_rolcol);

        // output
        System.out.println((ans[0] + 1) + " " + ans[1]);

        sc.close();
    }

    private static int[] colMAXSUM(int[][] array, int T_rolcol) {
        int maxSum = Integer.MIN_VALUE;
        int INDEX = -1;

        for (int col = 0; col < T_rolcol; col++) {
            int sum = 0;
            for (int row = 0; row < T_rolcol; row++) {
                sum += array[row][col];
            }

            if (sum > maxSum) {
                maxSum = sum;
                INDEX = col;
            }
        }

        return new int[]{INDEX, maxSum};
    }
}
