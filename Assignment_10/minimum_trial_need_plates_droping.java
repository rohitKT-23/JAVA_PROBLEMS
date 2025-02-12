import java.util.Scanner;

public class minimum_trial_need_plates_droping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_cases = scan.nextInt(); 
        while (t_cases-- > 0) {
            int t_paltes = scan.nextInt(); 
            int t_floors = scan.nextInt(); 
            System.out.println(min_trials(t_paltes, t_floors)); 
        }
        scan.close();
    }
    private static int min_trials(int t_paltes, int t_floors) {
        int[][] dp = new int[t_paltes + 1][t_floors + 1];
        for (int i = 1; i <= t_paltes; i++) {
            dp[i][0] = 0;  
            dp[i][1] = 1; 
        }
        for (int j = 1; j <= t_floors; j++) {
            dp[1][j] = j;  
        }
        for (int k = 2; k <= t_paltes; k++) {
            for (int n = 2; n <= t_floors; n++) {
                dp[k][n] = Integer.MAX_VALUE;  
                int lw = 1;
                int hi = n;
                while (lw <= hi) {
                    int md = (lw + hi) / 2;
                    int brk_case = dp[k - 1][md - 1]; 
                    int no_brk_cs = dp[k][n - md]; 
                    int trl = 1 + Math.max(brk_case, no_brk_cs);
                    if (brk_case > no_brk_cs) {
                        hi = md - 1;
                    } else {
                        lw = md + 1;
                    }
                    dp[k][n] = Math.min(dp[k][n], trl);
                }
            }
        }

        return dp[t_paltes][t_floors];  
    }
}
