import java.util.Scanner;

public class minimum_money_needed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int W = scan.nextInt();
        int[] price_ARR = new int[W + 1];
        for (int i = 1; i <= W; i++) {
            price_ARR[i] = scan.nextInt();
        }
        int[] dp = new int[W + 1];
        for (int i = 1; i <= W; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= W; i++) {
            if (price_ARR[i] != -1) { 
                for (int j = i; j <= W; j++) {
                    if (dp[j - i] != Integer.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[j - i] + price_ARR[i]);
                    }
                }
            }
        }
        System.out.println(dp[W] == Integer.MAX_VALUE ? -1 : dp[W]);
        scan.close();
    }
}
