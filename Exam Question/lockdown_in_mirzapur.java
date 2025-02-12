import java.util.*;

public class lockdown_in_mirzapur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
    
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(total_ways(n, r));
        }
    
        sc.close();
    }
    
    private static long total_ways(int n, int r) {
        long ans = 1;
    
        // nC0 = 1
        // nCn = 1
        if (r > n - r) {
            r = n - r;
        }
    
        // nCr
        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;
        }
    
        return ans;
    }

}
