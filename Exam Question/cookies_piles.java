import java.util.Scanner;

public class cookies_piles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total_testcases = scanner.nextInt();

        for (int t = 0; t < total_testcases; t++) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int D = scanner.nextInt();

            //total cookies
            int totalCookies = calculateTotalCookies(N, A, D);
            System.out.println(totalCookies);
        }

        scanner.close();
    }

    private static int calculateTotalCookies(int N, int A, int D) {
        // Sum = N/2 * [2*A + (N-1)*D]
        return N * (2 * A + (N - 1) * D) / 2;
    }
}
