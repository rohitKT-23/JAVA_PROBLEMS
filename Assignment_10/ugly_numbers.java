import java.util.*;

public class ugly_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_cases = scn.nextInt();
        while (t_cases-- > 0) {
            int n = scn.nextInt();
            System.out.println(fnd_ugly_nums(n));
        }
        scn.close();
    }
    private static int fnd_ugly_nums(int n) {
        if (n == 1) return 1;
        PriorityQueue<Long> min_hp = new PriorityQueue<>();
        HashSet<Long> seen = new HashSet<>();
        min_hp.add(1L);
        seen.add(1L);
        int[] primes = {2, 3, 5};
        long curr_ugly = 1;
        for (int i = 0; i < n; i++) {
            curr_ugly = min_hp.poll();
            for (int prime : primes) {
                long nextUgly = curr_ugly * prime;
                if (!seen.contains(nextUgly)) {
                    min_hp.add(nextUgly);
                    seen.add(nextUgly);
                }
            }
        }
        return (int) curr_ugly;
    }
}
