import java.util.*;

public class aggresive_COW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input reading
        int total_stalls = sc.nextInt();  
        int total_cows = sc.nextInt();  
        int[] stalls = new int[total_stalls];

        for (int i = 0; i < total_stalls; i++) {
            stalls[i] = sc.nextInt();
        }

        // Sorting
        Arrays.sort(stalls);

        // Output
        int result = lagest_min_dist(stalls, total_cows);
        System.out.println(result);

        sc.close();
    }

    public static int lagest_min_dist(int[] stalls, int total_cows) {
        int low = 0;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (POSSIBLE(stalls, total_cows, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static boolean POSSIBLE(int[] stalls, int total_cows, int minDist) {
        int cnt = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                cnt++;
                lastPosition = stalls[i];
            }
        }

        return cnt >= total_cows;
    }
}
