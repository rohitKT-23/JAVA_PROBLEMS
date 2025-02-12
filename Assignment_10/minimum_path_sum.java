import java.util.*;

public class minimum_path_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_rows = scan.nextInt();
        int t_cols = scan.nextInt();
        int[][] mtx = new int[t_rows][t_cols];
        for (int row = 0; row < t_rows; row++) {
            for (int col = 0; col < t_cols; col++) {
                mtx[row][col] = scan.nextInt();
            }
        }
        System.out.println(MPS(mtx, t_rows, t_cols));
    }
    public static int MPS(int[][] mtx, int t_rows, int t_cols) {
        int[][] min_path_sum = new int[t_rows][t_cols];
        min_path_sum[0][0] = mtx[0][0];
        for (int col = 1; col < t_cols; col++) {
            min_path_sum[0][col] = min_path_sum[0][col - 1] + mtx[0][col];
        }
        for (int row = 1; row < t_rows; row++) {
            min_path_sum[row][0] = min_path_sum[row - 1][0] + mtx[row][0];
        }
        for (int row = 1; row < t_rows; row++) {
            for (int col = 1; col < t_cols; col++) {
                min_path_sum[row][col] = mtx[row][col] + Math.min(min_path_sum[row - 1][col], min_path_sum[row][col - 1]);
            }
        }
        return min_path_sum[t_rows - 1][t_cols - 1];
    }
}
