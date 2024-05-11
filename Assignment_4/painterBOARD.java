import java.util.Scanner;

public class painterBOARD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int total_painters = sc.nextInt();
        int total_length = sc.nextInt();
        int[] length = new int[total_length];
        for (int i = 0; i < total_length; i++) {
            length[i] = sc.nextInt();
        }

        // Output
        long ans = paint_lenght(total_painters, total_length, length);
        System.out.println(ans);

        sc.close();
    }

    private static long paint_lenght(int total_painters, int total_length, int[] length) {
        long lw = 0;
        long hi = Long.MAX_VALUE;

        while (lw < hi) {
            long mid = lw + (hi - lw) / 2;

            if (canPaint(mid, total_painters, total_length, length)) {
                hi = mid;
            } else {
                lw = mid + 1;
            }
        }

        return lw;
    }

    private static boolean canPaint(long time, int total_painters, int total_length, int[] length) {
        int painters = 1;
        long current_time = 0;

        for (int i = 0; i < total_length; i++) {
            if (length[i] > time) {
                return false; // A single board takes more time than the allocated time
            }

            if (current_time + length[i] <= time) {
                current_time += length[i];
            } else {
                painters++;
                current_time = length[i];

                if (painters > total_painters) {
                    return false; // We need more painters
                }
            }
        }

        return true;
    }
}
