import java.util.Scanner;
public class mixtures {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }
        int result = min_smoke(colors, n);
        System.out.println(result);
        sc.close();
    }
    public static int min_smoke(int[] colors, int n) {
        int[][] dp = new int[n][n];
        int[][] sum = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum[i][i] = colors[i];
            for (int j = i + 1; j < n; j++) {
                sum[i][j] = (sum[i][j - 1] + colors[j]) % 100;
            }
        }
        for (int length = 2; length <= n; length++) { 
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int smoke = dp[i][k] + dp[k + 1][j] + sum[i][k] * sum[k + 1][j];
                    dp[i][j] = Math.min(dp[i][j], smoke);
                }
            }
        }
        return dp[0][n - 1];
    }
}
