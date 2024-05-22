import java.util.Scanner;

public class nth_triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = scanner.nextInt();

        int nthTriangle = calculateNthTriangle(N);
        System.out.println(nthTriangle);

        scanner.close();
    }

    // Recursive function to calculate the Nth triangle
    private static int calculateNthTriangle(int N) {
        if (N == 1) {
            return 1;
        }

        // The Nth triangle is the sum of numbers from 1 to N
        return N + calculateNthTriangle(N - 1);
    }
}
