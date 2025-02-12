import java.util.Scanner;

public class rod_cutting_problem {
    public static int max_profit(int[] prices, int n) {
        int[] dp = new int[n + 1]; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], prices[j - 1] + dp[i - j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(max_profit(prices, n));
    }
}
