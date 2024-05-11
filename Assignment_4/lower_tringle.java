import java.util.*;

public class lower_tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int T_rowcol = sc.nextInt();

        // i => row
        // j => col

        int[][] array = new int[T_rowcol][T_rowcol];
        for (int row = 0; row < T_rowcol; row++) {
            for (int col = 0; col < T_rowcol; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        //check
        boolean isLowerTriangular = isLowerTriangular(array, T_rowcol);

        // output
        System.out.println(isLowerTriangular ? "true" : "false");

        sc.close();
    }

    private static boolean isLowerTriangular(int[][] array, int T_rowcol) {
        for (int row = 0; row < T_rowcol; row++) {
            for (int col = row + 1; col < T_rowcol; col++) {
                //check for lower triangle
                if (array[row][col] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
