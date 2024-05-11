import java.util.*;

public class SORT_rowwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 
        int T_rows = sc.nextInt();
        int T_cols = sc.nextInt();
        int[][] array = new int[T_rows][T_cols];

        for (int row = 0; row < T_rows; row++) {
            for (int col = 0; col < T_cols; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        // Sort
        SORTING_ROWS(array);

        // result
        print_array(array);

        sc.close();
    }

    public static void SORTING_ROWS(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            Arrays.sort(array[row]);
        }
    }

    public static void print_array(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
