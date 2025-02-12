import java.util.Scanner;
public class HouseRobberII {
        private static int linear_rob(int[] nums) {
        int t_nums = nums.length;
        if (t_nums == 0) return 0;
        if (t_nums == 1) return nums[0];
        int[] dp = new int[t_nums];        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < t_nums; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[t_nums-1];
    }
    private static int rob(int[] nums) {
        int t_nums = nums.length;
        if (t_nums == 1) return nums[0]; // If only one house, rob it
        int case1 = linear_rob(java.util.Arrays.copyOfRange(nums, 0, t_nums-1));
        int case2 = linear_rob(java.util.Arrays.copyOfRange(nums, 1, t_nums));
        return Math.max(case1, case2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int t_nums = sc.nextInt();        
        int[] nums = new int[t_nums];
        for (int i = 0; i < t_nums; i++) {
            nums[i] = sc.nextInt();
        }        
        System.out.println(rob(nums));
    }
}
