
public class tiling_problem_1 {
    public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int t_nums = scan.nextInt();
		long[] DP = new long[t_nums+1];
		System.out.print(total_problem(t_nums, DP));
    }
	public static long total_problem(int t_nums, long[] DP) {
		if (t_nums <= 2)
			return t_nums;
		if (DP[t_nums] != 0)
			return DP[t_nums];
		long horiii = total_problem(t_nums-2, DP);
		long vertiii = total_problem(t_nums-1, DP);

		return DP[t_nums] = horiii + vertiii;
	}
}