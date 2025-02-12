import java.util.Scanner;

public class rohan_and_its_playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read input
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] c = new int[n];
        int[] t = new int[n];

        // read playlist 
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }

        // cumulative duration
        long[] total_duration = new long[n];
        total_duration[0] = c[0] * t[0];
        for (int i = 1; i < n; i++) {
            total_duration[i] = total_duration[i - 1] + c[i] * t[i];
        }

        // Read moments Rohan has written out
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int songs = finding_song(total_duration, v);
            System.out.print(songs + " ");
        }

        sc.close();
    }

    private static int finding_song(long[] total_duration, int v) {
        int lw = 0;
        int hi = total_duration.length - 1;

        while (lw < hi) {
            int mid = lw + (hi - lw) / 2;

            if (total_duration[mid] < v) {
                lw = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lw + 1; // Add 1 to convert from 0-based index to 1-based index
    }
}
