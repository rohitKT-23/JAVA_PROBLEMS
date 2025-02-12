import java.util.*;
public class optimal_game_strategy {
    public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int t_nums=scan.nextInt();
		int[] ARR =new int[t_nums];
		for (int num= 0; num < t_nums; num++) {
			ARR[num] = scan.nextInt();
		}
		int[][] DP = new int[t_nums][t_nums];
		for (int[] arrr : DP) {
			Arrays.fill(arrr, -1);
		}
		System.out.print(fun_gaming(ARR, 0, t_nums-1, DP));
    }
	public static int fun_gaming(int[] ARR, int num, int j, int[][] DP) {	
		if (num > j)
			return 0;
		if (DP[num][j] != -1)
			return DP[num][j];
		int phelaaa = ARR[num] + Math.min(fun_gaming(ARR, num+2, j, DP), fun_gaming(ARR, num+1, j-1, DP));
		int aqaakhirri = ARR[j] + Math.min(fun_gaming(ARR, num+1, j-1, DP), fun_gaming(ARR, num, j-2, DP));
		return DP[num][j] = Math.max(phelaaa, aqaakhirri);
	}
}