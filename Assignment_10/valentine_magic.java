
import java.util.*;
public class valentine_magic {
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int total_ladkaa = scan.nextInt();
		int total_ladkii = scan.nextInt();

		int[] ladkaas = new int[total_ladkaa];
		int[] ladkiis = new int[total_ladkii];
		for (int ladka = 0; ladka < total_ladkaa; ladka++) {
			ladkaas[ladka] = scan.nextInt();
		}
		for (int ladka = 0; ladka < total_ladkii; ladka++) {
			ladkiis[ladka] = scan.nextInt();
		}

		Arrays.sort(ladkaas);
		Arrays.sort(ladkiis);

		int[][] dp = new int[total_ladkaa][total_ladkii];
		for (int[] r: dp) {
			Arrays.fill(r, -1);
		}
		System.out.print(valantine(ladkaas, ladkiis, 0, 0, dp));
    }
	public static int valantine(int[] ladkaas, int[] ladkiis, int ladka, int j, int[][] dp) {
		if (ladka == ladkaas.length)
			return 0;
		if (j == ladkiis.length)
			return 10000000;
		if (dp[ladka][j] != -1)
			return dp[ladka][j];
		int p_a_i_r = Math.abs(ladkaas[ladka] - ladkiis[j]) + valantine(ladkaas, ladkiis, ladka+1, j+1, dp);
		int not_p_aire = valantine(ladkaas, ladkiis, ladka, j+1, dp);

		return dp[ladka][j] = Math.min(p_a_i_r, not_p_aire);
	}
}