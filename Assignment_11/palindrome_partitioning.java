import java.util.Scanner;

public class palindrome_partitioning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t_cases = scanner.nextInt();
        scanner.nextLine();
        while (t_cases-- > 0) {
            String str = scanner.nextLine();
            System.out.println(min_part(str));
        }
        scanner.close();
    }
    private static int min_part(String str) {
        int t_str = str.length();
        boolean[][] vld_palindrome = new boolean[t_str][t_str];
        int[] dp = new int[t_str];
        for (int i = 0; i < t_str; i++) {
            vld_palindrome[i][i] = true;
            dp[i] = i; 
        }
        for (int length = 2; length <= t_str; length++) {
            for (int i = 0; i <= t_str - length; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    if (length == 2) {
                        vld_palindrome[i][j] = true; 
                    } else {
                        vld_palindrome[i][j] = vld_palindrome[i + 1][j - 1]; 
                    }
                }
            }
        }
        for (int i = 1; i < t_str; i++) {
            if (vld_palindrome[0][i]) {
                dp[i] = 0; 
            } else {
                for (int j = 0; j < i; j++) {
                    if (vld_palindrome[j + 1][i]) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[t_str - 1]; 
    }
}
