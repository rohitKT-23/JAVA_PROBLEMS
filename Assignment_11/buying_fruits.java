import java.util.Scanner;

public class buying_fruits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_cases = scn.nextInt();
        while (t_cases-- > 0) {
            int t_seller = scn.nextInt();
            int[] sebh_DP = new int[t_seller];
            int[] aam_DP = new int[t_seller];
            int[] santra_DP = new int[t_seller];
            sebh_DP[0] = scn.nextInt();
            aam_DP[0] = scn.nextInt();
            santra_DP[0] = scn.nextInt();
            for (int i = 1; i < t_seller; i++) {
                int seb = scn.nextInt();
                int aam = scn.nextInt();
                int santra = scn.nextInt();
                sebh_DP[i] = seb + Math.min(aam_DP[i - 1], santra_DP[i - 1]);
                aam_DP[i] = aam + Math.min(sebh_DP[i - 1], santra_DP[i - 1]);
                santra_DP[i] = santra + Math.min(sebh_DP[i - 1], aam_DP[i - 1]);
            }
            int ans = Math.min(sebh_DP[t_seller - 1], Math.min(aam_DP[t_seller - 1], santra_DP[t_seller - 1]));
            System.out.println(ans);
        }
        scn.close();
    }
}
