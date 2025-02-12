import java.util.*;

public class Merge_K_sorted_Arrays {
    static class elmnt implements Comparable<elmnt> {
        long val;
        int arr_IDX;
        int elmnt_IDX;

        public elmnt(long val, int arr_IDX, int elmnt_IDX) {
            this.val = val;
            this.arr_IDX = arr_IDX;
            this.elmnt_IDX = elmnt_IDX;
        }

        @Override
        public int compareTo(elmnt other) {
            return Long.compare(this.val, other.val);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int K = scn.nextInt();
        int N = scn.nextInt();

        long[][] arr_2d = new long[K][N];

        for (int num = 0; num < K; num++) {
            for (int num1 = 0; num1 < N; num1++) {
                arr_2d[num][num1] = scn.nextLong();
            }
        }

        List<Long> mrgd_lst = mrge_srtd_arr_2d(arr_2d, K, N);

        for (long num : mrgd_lst) {
            System.out.print(num + " ");
        }
    }

    private static List<Long> mrge_srtd_arr_2d(long[][] arr_2d, int K, int N) {
        PriorityQueue<elmnt> min_hp = new PriorityQueue<>();
        List<Long> ans = new ArrayList<>();

        for (int num = 0; num < K; num++) {
            if (N > 0) {
                min_hp.add(new elmnt(arr_2d[num][0], num, 0));
            }
        }

        while (!min_hp.isEmpty()) {
            elmnt curr = min_hp.poll();
            ans.add(curr.val);

            if (curr.elmnt_IDX + 1 < N) {
                min_hp.add(new elmnt(arr_2d[curr.arr_IDX][curr.elmnt_IDX + 1], curr.arr_IDX, curr.elmnt_IDX + 1));
            }
        }

        return ans;
    }
}
