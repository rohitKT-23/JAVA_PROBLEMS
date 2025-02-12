import java.util.*;

public class Find_kth_Largest_Number {
    public static int kth_lrg_num(int[] nums, int k) {
        PriorityQueue<Integer> minimum_hp = new PriorityQueue<>(k);  
        for (int num : nums) {
            minimum_hp.offer(num);
            if (minimum_hp.size() > k) {
                minimum_hp.poll();  
            }
        }
        return minimum_hp.peek();  
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] array = new int[n];
        for (int number = 0; number < n; number++) {
            array[number] = scn.nextInt();
        }
        System.out.println(kth_lrg_num(array, k));
    }
}
