import java.util.Scanner;

public class WAVE_anti_colwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int total_rows = sc.nextInt();
        int total_cols = sc.nextInt();
        int[][] array = new int[total_rows][total_cols];

        for (int row = 0; row < total_rows; row++) {
            for (int col = 0; col < total_cols; col++) {
                array[row][col] = sc.nextInt();
            }
        }
        sc.close();

        WAVE_anti_colwise(total_rows, total_cols, array);
    }

    public static void WAVE_anti_colwise(int total_rows, int total_cols, int[][] arr) {
        int upper = 0;
        int lower = total_rows - 1;
        int lft = 0;
        int rht = total_cols - 1;

        while (upper <= lower && lft <= rht) {
            // upper row
            for (int row = lft; row <= rht; row++) {
                System.out.print(arr[upper][row] + ", ");
            }
            upper++;

            // Print rht column
            for (int row = upper; row <= lower; row++) {
                System.out.print(arr[row][rht] + ", ");
            }
            rht--;

            // lower row
            if (upper <= lower) {
                for (int row = rht; row >= lft; row--) {
                    System.out.print(arr[lower][row] + ", ");
                }
                lower--;
            }

            // lft column
            if (lft <= rht) {
                for (int row = lower; row >= upper; row--) {
                    System.out.print(arr[row][lft] + ", ");
                }
                lft++;
            }
        }

        System.out.println("END");
    }
}
