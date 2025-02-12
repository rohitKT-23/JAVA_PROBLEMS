import java.util.Scanner;

public class count_subsequences {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(countDistinctSubsequences(s));
        }
        sc.close();
    }
    public static int countDistinctSubsequences(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < 26; i++) {
            lastOccurrence[i] = -1; 
        }
        for (int i = 1; i <= n; i++) {
            char currentChar = s.charAt(i - 1);
            int charIndex = currentChar - 'A';
            dp[i] = (2 * dp[i - 1]) % MOD;
            if (lastOccurrence[charIndex] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[charIndex] - 1] + MOD) % MOD;
            }
            lastOccurrence[charIndex] = i;
        }
        return dp[n];
    }
}
