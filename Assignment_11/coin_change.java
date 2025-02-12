import java.util.*;

public class coin_change {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t_amt= scn.nextInt(); 
        int t_coins= scn.nextInt(); 
        int[] coins= new int[t_coins];
        for (int coin= 0; coin< t_coins; coin++) {
            coins[coin] = scn.nextInt();
        }
        System.out.println(t_ways_changes(t_amt, coins));
        scn.close();
    }
    public static int t_ways_changes(int t_amt, int[] coins) {
        int[] t_ways= new int[t_amt + 1];
        t_ways[0]= 1;
        for (int coin: coins) {
            for (int j= coin; j<= t_amt; j++) {
                t_ways[j]+= t_ways[j - coin];
            }
        }
        return t_ways[t_amt]; 
    }
}
