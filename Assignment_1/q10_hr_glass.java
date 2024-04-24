import java.util.Scanner;

public class q10_hr_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i = 0;
        while (i <= rows) {
            int spaces = 1;
            while (spaces <= i) {
                System.out.print("  ");
                spaces++;
            }
            int j = rows - i;
            while (j >= 0) {
                System.out.print(j + " ");
                j--;
            }
            j = 1;
            while (j <= rows - i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while (i >= 0) {
            int spaces = 1;
            while (spaces <= i) {
                System.out.print("  ");
                spaces++;
            }
            int j = rows - i;
            while (j >= 0) {
                System.out.print(j + " ");
                j--;
            }
            j = 1;
            while (j <= rows - i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
