import java.util.Scanner;

public class q2_magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i = 1;
        while (i <= row) {
            int j = 1;
            while (j <= row - i) {
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                j++;
            }
            j = 1;
            while (j <= row - i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
        i = row - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= row - i) {
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            j = 1;
            while (j <= row - i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
