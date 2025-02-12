import java.util.Scanner;

public class minimum_jumps_required {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = minJumps(arr, n);
            System.out.println(result);
        }
        sc.close();
    }
    public static int minJumps(int[] arr, int n) {
        if (n == 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return Integer.MAX_VALUE;
        }
        int maxReach = arr[0];
        int steps = arr[0];  
        int jumps = 1;        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return Integer.MAX_VALUE;
                }
                steps = maxReach - i;
            }
        }
        return Integer.MAX_VALUE; 
    }
}
