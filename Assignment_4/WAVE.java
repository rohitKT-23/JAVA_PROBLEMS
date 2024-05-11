import java.util.*;

public class WAVE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input reading
        int T_rows = sc.nextInt();
        int T_cols = sc.nextInt();

        int[][] array = new int[T_rows][T_cols];

        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        wave(array, T_rows, T_cols);
        sc.close();
    }

    static void wave(int[][] array, int T_rows, int T_cols) {
        // i = row
        // j = col 
        for (int row = 0; row < T_rows; row++) {
            if (row % 2 == 0) {
                //left to right
                for (int col = 0; col < T_cols; col++) {
                    System.out.print(array[row][col] + ", ");
                }
            } else {
                //right to left
                for (int col = T_cols - 1; col >= 0; col--) {
                    System.out.print(array[row][col] + ", ");
                }
            }
        }

        System.out.println("END");
    }
}
