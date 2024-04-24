import java.util.Scanner;

public class q7_mountain1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 1;
        int stars = 1;
        int spaces = 2 * n - 3;
        while (rows <= n) {
            // stars
            int i = 1;
            int count = 1;
            while (i <= stars) {
                System.out.print(count + " ");
                count++;
                i++;
            }
            // spaces
            int j = 1;
            while (j <= spaces) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            if (rows == n) {
                k = 2;
            }
            int c = n / 2 + 1;
            while (k <= stars) {
                System.out.print(c + " ");
                k++;
                c--;
            }
            System.out.println();
            stars++;
            spaces -= 2;
            rows++;
        }
        sc.close();
    }
}