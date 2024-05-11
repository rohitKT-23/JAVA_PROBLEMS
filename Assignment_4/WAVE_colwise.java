import java.util.*;

public class WAVE_colwise {

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

        wave_colwise(array, T_rows, T_cols);
        sc.close();
    }

    static void wave_colwise(int[][] array, int T_rows, int T_cols) {
        // i = row
        // j = col 
        for (int col = 0; col < T_cols; col++) {
            if (col % 2 == 0) {
                // top to bottom
                for (int i = 0; i < T_rows; i++) {
                    System.out.print(array[i][col] + ", ");
                }
            } else {
                // bottom to top
                for (int row = T_rows - 1; row >= 0; row--) {
                    System.out.print(array[row][col] + ", ");
                }
            }
        }

        System.out.println("END");
    }
}
