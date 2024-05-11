import java.util.Scanner;

public class kth_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_test_cases = sc.nextInt(); // Number of test cases

        for (int test_case = 0; test_case < total_test_cases; test_case++) {
            long n = sc.nextLong(); 
            int k = sc.nextInt();

            long result = GREATEST(n, k);
            System.out.println(result);
        }

        sc.close();
    }

    public static long GREATEST(long n, int k) {
        long lw = 1;
        long hi = n;
        long ans = -1;

        while (lw <= hi) {
            long mid = (lw + hi) / 2;
            long midPower = (long) Math.pow(mid, k);

            if (midPower <= n) {
                ans = mid;
                lw = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}
