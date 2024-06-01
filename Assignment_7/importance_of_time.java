import java.util.*;

public class importance_of_time {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_nums = scn.nextInt();
        List<Integer> lst_arr = new ArrayList<>(t_nums);
        Queue<Integer> qu = new LinkedList<>();

        for (int num = 0; num < t_nums; num++) {
            int x = scn.nextInt();
            qu.add(x);
        }

        for (int num = 0; num < t_nums; num++) {
            lst_arr.add(scn.nextInt());
        }

        System.out.println(time_slv(qu, lst_arr));
    }
    static int time_slv(Queue<Integer> qu, List<Integer> A) {
        int ans = 0;
        for (int num = 0; num < A.size(); num++) {
            if (qu.peek() == A.get(num)) {
                ans++;
                qu.poll();
            } else {
                while (qu.peek() != A.get(num)) {
                    int var = qu.peek();
                    qu.add(var);
                    qu.poll();
                    ans++;
                }
                ans++;
                qu.poll();
            }
        }
        return ans;
    }

}