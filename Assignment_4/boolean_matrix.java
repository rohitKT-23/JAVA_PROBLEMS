import java.util.Scanner;

public class boolean_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int T_rows = sc.nextInt();
        int T_cols = sc.nextInt();

        // i =>row
        // j =>col

        int[][] array = new int[T_rows][T_cols];
        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        // Output
        boolean_Matrix(array, T_rows, T_cols);

        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void boolean_Matrix(int[][] array, int T_rows, int T_cols) {
        boolean[] rowF = new boolean[T_rows];
        boolean[] colF = new boolean[T_cols];

        // Find the rows and columns that need to be modified
        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                if (array[row][col] == 1) {
                    rowF[row] = true;
                    colF[col] = true;
                }
            }
        }

        // making the ith row & jth col to 1
        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                if (rowF[row] || colF[col]) {
                    array[row][col] = 1;
                }
            }
        }
    }
}
