import java.util.Scanner;

public class count_number_of_binary_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t_cases = sc.nextInt();
        int[] t_case = new int[t_cases];
        int max_nums = 0;
        for (int cases = 0; cases < t_cases; cases++) {
            t_case[cases] = sc.nextInt();
            max_nums = Math.max(max_nums, t_case[cases]);
        }
        long[] dp = new long[max_nums + 1];
        dp[1] = 2;
        if (max_nums >= 2) {
            dp[2] = 3;
        for (int cases = 3; cases <= max_nums; cases++) {
            dp[cases] = dp[cases - 1] + dp[cases - 2];
        }
        for (int num : t_case) {
            System.out.println(dp[num]);
        }
        sc.close();
		}
	}
}