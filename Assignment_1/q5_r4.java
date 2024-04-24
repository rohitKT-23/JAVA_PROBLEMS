import java.util.Scanner;

public class q5_r4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t_no_row = sc.nextInt();
        int row = 1;
        while (row <= t_no_row) {
            int star = 1;
            while (star <= row) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
