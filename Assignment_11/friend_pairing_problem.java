import java.util.Scanner;
public class friend_pairing_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] testCases = new int[t];
        int maxN = 0;
        for (int i = 0; i < t; i++) {
            testCases[i] = sc.nextInt();
            maxN = Math.max(maxN, testCases[i]);
        }
        long[] dp = new long[maxN + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= maxN; i++) {
            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }
        for (int n : testCases) {
            System.out.println(dp[n]);
        }
        sc.close();
    }
}
