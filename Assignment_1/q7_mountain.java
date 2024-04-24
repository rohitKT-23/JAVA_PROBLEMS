import java.util.Scanner;

public class q7_mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + "  ");
                j++;
            }
            int spaces = 2*(rows - i)-1;
            while (spaces > 0) {
                System.out.print("   ");
                spaces--;
            }
            j = i;
            while (j >= 1) {
                if (j != rows) {
                    System.out.print(j + "  ");
                }
                j--;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
