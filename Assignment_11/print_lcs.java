import java.util.Scanner;

public class print_lcs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str_1 = scan.nextLine();
        String str_2 = scan.nextLine();
        String lcs = findLCS(str_1, str_2);
        System.out.println(lcs);
        scan.close();
    }
    private static String findLCS(String str_1, String str_2) {
        int len_str_1 = str_1.length();
        int len_str_2 = str_2.length();
        int[][] dp = new int[len_str_1 + 1][len_str_2 + 1];
        for (int str1 = 1; str1 <= len_str_1; str1++) {
            for (int str2 = 1; str2 <= len_str_2; str2++) {
                if (str_1.charAt(str1 - 1) == str_2.charAt(str2 - 1)) {
                    dp[str1][str2] = dp[str1 - 1][str2 - 1] + 1;
                } else {
                    dp[str1][str2] = Math.max(dp[str1 - 1][str2], dp[str1][str2 - 1]);
                }
            }
        }
        StringBuilder lcs = new StringBuilder();
        int str1 = len_str_1;
        int str2 = len_str_2;
        while (str1 > 0 && str2 > 0) {
            if (str_1.charAt(str1 - 1) == str_2.charAt(str2 - 1)) {
                lcs.append(str_1.charAt(str1 - 1));
                str1--;
                str2--;
            } else if (dp[str1 - 1][str2] >= dp[str1][str2 - 1]) {
                str1--;
            } else {
                str2--;
            }
        }
        return lcs.reverse().toString();
    }
}
