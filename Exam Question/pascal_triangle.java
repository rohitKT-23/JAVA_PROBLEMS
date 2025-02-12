import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        //i -> row
        //j -> col
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row = 0;
        while (row < rows) {
            int col = 0;
            int number = 1;
            while (col < row-rows) {
                System.out.print("  ");
                col++;
            }
            col = 0;
            while (col <= row) {
                System.out.print(number);
                System.out.print("  ");
                number = number * (row - col) / (col + 1);
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
