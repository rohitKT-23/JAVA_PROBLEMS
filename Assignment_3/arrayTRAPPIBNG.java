import java.util.Scanner;

public class arrayTRAPPIBNG {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt(); // Number of test cases

        while (test_case-- > 0) {
            int n = sc.nextInt(); // Number of towers
            int[] towers = new int[n];

            for (int i = 0; i < n; i++) {
                towers[i] = sc.nextInt();
            }

            long water = Water(towers);
            System.out.println(water);
        }
        sc.close();
    }
    public static long Water(int[] towers) {
        int n = towers.length;
        long water = 0;

        int lft = 0, rht = n - 1;
        int lftMax = 0, rhtMax = 0;

        while (lft < rht) {
            if (towers[lft] < towers[rht]) {
                if (towers[lft] > lftMax) {
                    lftMax = towers[lft];
                } else {
                    water += lftMax - towers[lft];
                }
                lft++;
            } else {
                if (towers[rht] > rhtMax) {
                    rhtMax= towers[rht];
                } else {
                    water += rhtMax - towers[rht];
                }
                rht--;
            }
        }

        return water;
    }
}
