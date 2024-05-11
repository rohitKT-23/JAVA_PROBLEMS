import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int RowCol = sc.nextInt();
        int[][] array = new int[RowCol][RowCol];

        for (int row = 0; row < RowCol; row++) {
            for (int col = 0; col < RowCol; col++) {
                array[row][col] = sc.nextInt();
            }
        }

        int[][] transpose = Transpose(array);
        print_array(transpose);

        sc.close();
    }

    public static int[][] Transpose(int[][] array) {
        int RowCol = array.length;
        int[][] transpose = new int[RowCol][RowCol];

        for (int row = 0; row < RowCol; row++) {
            for (int col = 0; col < RowCol; col++) {
                transpose[row][col] = array[col][row];
            }
        }

        return transpose;
    }

    public static void print_array(int[][] array) {
        int RowCol = array.length;

        for (int row = 0; row < RowCol; row++) {
            for (int col = 0; col < RowCol; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
