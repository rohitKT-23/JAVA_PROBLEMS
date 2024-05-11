import java.util.*;

public class MATRIX_srch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T_rows = sc.nextInt();
        int T_cols = sc.nextInt();
        int[][] array = new int[T_rows][T_cols];

        // i => row of an array
        // j => col of an array
        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        // Output
        int ans = array2Dsearch(array, target);
        System.out.println(ans);

        sc.close();
    }
    public static int array2Dsearch(int[][] array, int target) {
        int rows = array.length;
        int cols = array[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int currentElement = array[row][col];

            if (currentElement == target) {
                return 1; // found!!
            } else if (currentElement > target) {
                col--; // go left
            } else {
                row++; // go down
            }
        }

        return 0; // not found
    }

}
