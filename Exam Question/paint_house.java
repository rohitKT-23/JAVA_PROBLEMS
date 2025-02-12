import java.util.Scanner;

public class paint_house {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_houses = sc.nextInt();

        int[][] cost = new int[total_houses][3];
        for (int i = 0; i < total_houses; i++) {
            for (int j = 0; j < 3; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        int ans = minimun_cost(cost);

        // Output 
        System.out.println(ans);

        sc.close();
    }

    private static int minimun_cost(int[][] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int total_houses = cost.length;

        for (int i = 1; i < total_houses; i++) {
            cost[i][0] += Math.min(cost[i - 1][1], cost[i - 1][2]);
            cost[i][1] += Math.min(cost[i - 1][0], cost[i - 1][2]);
            cost[i][2] += Math.min(cost[i - 1][0], cost[i - 1][1]);
        }

        return Math.min(Math.min(cost[total_houses - 1][0], cost[total_houses - 1][1]), cost[total_houses - 1][2]);
    }
}
