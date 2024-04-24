import java.util.Scanner;

public class q9_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;

        int row = 1;

        while (row <= n) {
            int i = 1;

            while (i <= row) {
                System.out.print(start + "\t");
                start++;
                i++;
            }

            System.out.println();
            row++;
        }
        sc.close();
    }
}
