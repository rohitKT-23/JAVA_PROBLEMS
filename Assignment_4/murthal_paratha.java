import java.util.*;
public class murthal_paratha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int paratha = sc.nextInt();
        int cooks = sc.nextInt();
        int[] array = new int[cooks];
        for (int i = 0; i < cooks; i++) {
            array[i] = sc.nextInt();
        }

        // Output 
        int time = Pranthas(paratha, cooks, array);
        System.out.println(time);

        sc.close();
    }

    private static int Pranthas(int paratha, int cooks, int[] array) {
        Arrays.sort(array); // Sorting 

        int lw = 0;
        int hi = paratha * (paratha + 1) / 2 * array[cooks - 1]; // Maximum time

        while (lw < hi) {
            int mid = lw + (hi - lw) / 2;

            if (canPranthas(mid, paratha, cooks, array)) {
                hi = mid;
            } else {
                lw = mid + 1;
            }
        }

        return lw;
    }

    private static boolean canPranthas(int time, int paratha, int cooks, int[] array) {
        int cooked_paratha = 0;

        for (int i = 0; i < cooks; i++) {
            int rnk = array[i];
            int time_taken = 0;
            int cnt = 1;

            while (time_taken + rnk * cnt <= time) {
                time_taken += rnk * cnt;
                cnt++;
                cooked_paratha++;
                if (cooked_paratha >= paratha) {
                    return true;
                }
            }
        }

        return false;
    }
}
