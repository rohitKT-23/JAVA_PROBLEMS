import java.util.*;

public class o_1_knapsack {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t_itms= scan.nextInt(); 
        int t_capacity= scan.nextInt(); 
        int[] t_size= new int[t_itms];
        int[] vals= new int[t_itms];
        for (int itm= 0; itm< t_itms; itm++) {
            t_size[itm]= scan.nextInt(); 
        }
        for (int itm= 0; itm< t_itms; itm++) {
            vals[itm]= scan.nextInt();
        }
        int max_vals= knapsack(t_itms, t_capacity, t_size, vals);
        System.out.println(max_vals);
    }
    public static int knapsack(int t_itms, int t_capacity, int[] t_size, int[] vals) {
        int[] max_val_cap= new int[t_capacity + 1];
        for (int itm= 0; itm< t_itms; itm++) {
            for (int capacity= t_capacity; capacity>= t_size[itm]; capacity--) {
                max_val_cap[capacity]= Math.max(max_val_cap[capacity], max_val_cap[capacity - t_size[itm]] + vals[itm]);
            }
        }
        return max_val_cap[t_capacity];
    }
}
