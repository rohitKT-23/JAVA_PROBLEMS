import java.util.Scanner;

public class k_order_lcs {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();
        int k = scann.nextInt();
        int[] seq1 = new int[N];
        int[] seq2 = new int[M];
        for (int i = 0; i < N; i++) {
            seq1[i] = scann.nextInt();
        }
        for (int i = 0; i < M; i++) {
            seq2[i] = scann.nextInt();
        }
        int[][][] dp = new int[N + 1][M + 1][k + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                for (int l = 0; l <= k; l++) {
                    if (seq1[i - 1] == seq2[j - 1]) {
                        dp[i][j][l] = Math.max(dp[i][j][l], dp[i - 1][j - 1][l] + 1);
                    }
                    if (l < k) {
                        dp[i][j][l + 1] = Math.max(dp[i][j][l + 1], dp[i - 1][j - 1][l] + 1);
                    }
                    dp[i][j][l] = Math.max(dp[i][j][l], Math.max(dp[i - 1][j][l], dp[i][j - 1][l]));
                }
            }
        }
        int result = 0;
        for (int l = 0; l <= k; l++) {
            result = Math.max(result, dp[N][M][l]);
        }
        System.out.println(result);
        scann.close();
    }
}
