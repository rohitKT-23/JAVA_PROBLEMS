import java.util.*;

public class rain_water_trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input 
        int test_cases = sc.nextInt();

        // process
        for (int tcase = 1; tcase <= test_cases; tcase++) {
            int total_towers = sc.nextInt();

            int[] heights = new int[total_towers];
            for (int i = 0; i < total_towers; i++) {
                heights[i] = sc.nextInt();
            }

            int water_collect = total_water_collected(heights);
            System.out.println(water_collect);
        }
    }

    private static int total_water_collected(int[] heights) {
        int n = heights.length;
        int[] lft_max = new int[n];
        int[] rht_max = new int[n];

        // maximum height to the left 
        lft_max[0] = heights[0];
        for (int i = 1; i < n; i++) {
            lft_max[i] = Math.max(lft_max[i - 1], heights[i]);
        }

        // maximum height to the right
        rht_max[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rht_max[i] = Math.max(rht_max[i + 1], heights[i]);
        }

        // units of water collected for each tower
        int water_collect = 0;
        for (int i = 0; i < n; i++) {
            water_collect += Math.max(0, Math.min(lft_max[i], rht_max[i]) - heights[i]);
        }

        return water_collect;
    }
}
