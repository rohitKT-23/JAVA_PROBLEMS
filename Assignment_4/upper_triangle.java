import java.util.Scanner;

public class upper_triangle {
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

        // print upper triangle rest become 0
        for (int row = 0; row < T_rowcol; row++) {
            for (int col = 0; col < T_rowcol; col++) {
                if (col >= row) {
                    System.out.print(array[row][col] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
