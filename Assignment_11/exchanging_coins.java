import java.util.*;

public class exchanging_coins {
    private static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long coin_val= scan.nextLong();
        System.out.println(mac_gld(coin_val));
        scan.close();
    }
    public static long mac_gld(long coin_val) {
        if (coin_val== 0) return 0;
        if (memo.containsKey(coin_val)) {
            return memo.get(coin_val);
        }
        long Xchng= mac_gld(coin_val / 2) + mac_gld(coin_val / 3) + mac_gld(coin_val / 4);
        long ans = Math.max(coin_val, Xchng);
        memo.put(coin_val, ans);
        return ans;
    }
}
