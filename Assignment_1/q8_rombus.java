import java.util.Scanner;

public class q8_rombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int i = 1;

        // Upper part of the rhombus
        while (i <= n) {
            int spaces = 1;

            // Print spaces
            while (spaces <= n - i) {
                System.out.print("\t");
                spaces++;
            }

            int j = 0;

            // Print ascending numbers
            while (j <= i) {
                System.out.print(j+1 + "\t");
                j++;
            }

            // Print descending numbers
            j = i - 1;
            while (j >= 1) {
                System.out.print(j+1 + "\t");
                j--;
            }

            System.out.println();
            i++;
        }

        // Lower part of the rhombus
        i = n - 1;
        while (i >= 1) {
            int spaces = 1;

            // Print spaces
            while (spaces <= n - i) {
                System.out.print("\t");
                spaces++;
            }

            int j = 1;

            // Print ascending numbers
            while (j <= i) {
                System.out.print(j+1 + "\t");
                j++;
            }

            // Print descending numbers
            j = i - 1;
            while (j >= 1) {
                System.out.print(j+1 + "\t");
                j--;
            }

            System.out.println();
            i--;
        }
    }
}
