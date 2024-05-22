import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Call the recursive function
        printLexicographicalOrder(N, 0);
    }

    // Recursive function to print numbers in lexicographical order
    static void printLexicographicalOrder(int N, int current) {
        if (current <= N) {
            // Print the current number
            System.out.print(current + " ");

            // Recursively print numbers for the current number
            for (int i = 0; i <= 9; i++) {
                int next = current * 10 + i;
                if (next <= N && next != 0) {  // Avoid printing leading zeros
                    printLexicographicalOrder(N, next);
                }
            }
        }
    }
}
