import java.util.Scanner;

public class money_change {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int M = sc.nextInt();
            int[] S = new int[M];
            for (int i = 0; i < M; i++) {
                S[i] = sc.nextInt();
            }
            int N = sc.nextInt();
            System.out.println(countWays(S, M, N));
        }
        sc.close();
    }
    public static int countWays(int[] S, int M, int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 0; i < M; i++) { 
            for (int j = S[i]; j <= N; j++) { 
                dp[j] = (dp[j] + dp[j - S[i]]) % MOD;
            }
        }

        return dp[N];
    }
}
