
import java.util.*;
public class count_of_differenr_ways_to_express_n_as_a_sum_of_1_3_and_4 {
    public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int t_nums = scan.nextInt();
		long[] DP = new long[t_nums+1];
		Arrays.fill(DP, -1);
		System.out.print(contigg_suruu(t_nums, DP));
    }
	public static long contigg_suruu(int t_nums, long[] DP) {
		if (t_nums == 0)
			return 1;
		if (t_nums < 0)
			return 0;

		if (DP[t_nums] != -1)
			return DP[t_nums];

		long tarekeee = 0;
		tarekeee += contigg_suruu(t_nums-1, DP);
		tarekeee += contigg_suruu(t_nums-3, DP);
		tarekeee += contigg_suruu(t_nums-4, DP);

		return DP[t_nums] = tarekeee;
	}
}