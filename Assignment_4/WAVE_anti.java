
import java.util.Scanner;

public class WAVE_anti {

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

        WAVE_anti(array, T_rows, T_cols);
        sc.close();
    }

    static void WAVE_anti(int[][] array, int T_rows, int T_cols) {
        int RStart = 0, REnd = T_rows - 1, colStart = 0, CEnd = T_cols - 1;

        while (RStart <= REnd && colStart <= CEnd) {
            // first col
            for (int row = RStart; row <= REnd; row++) {
                System.out.print(array[row][colStart] + ", ");
            }
            colStart++;

            // last row
            for (int row = colStart; row <= CEnd; row++) {
                System.out.print(array[REnd][row] + ", ");
            }
            REnd--;

            // last col
            if (colStart <= CEnd) {
                for (int row = REnd; row >= RStart; row--) {
                    System.out.print(array[row][CEnd] + ", ");
                }
                CEnd--;
            }

            // first row
            if (RStart <= REnd) {
                for (int row = CEnd; row >= colStart; row--) {
                    System.out.print(array[RStart][row] + ", ");
                }
                RStart++;
            }
        }

        System.out.println("END");
    }
}
