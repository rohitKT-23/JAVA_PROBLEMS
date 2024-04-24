import java.util.Scanner;

public class q14_pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i = 0;
        while (i < rows) {
            int j = 0;
            int number = 1;
            while (j < i-rows) {
                System.out.print("  ");
                j++;
            }
            j = 0;
            while (j <= i) {
                System.out.print(number);
                System.out.print("  ");
                number = number * (i - j) / (j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
