import java.util.Scanner;

public class HELLO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of songs and moments
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input the playlist durations
        long[] c = new long[n];
        long[] t = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextLong();
            t[i] = scanner.nextLong();
        }

        // Input the moments Rohan has written out
        long[] moments = new long[m];
        for (int i = 0; i < m; i++) {
            moments[i] = scanner.nextLong();
        }

        // Calculate the song numbers for each moment
        long[] songNumbers = calculateSongNumbers(n, m, c, t, moments);

        // Print the result
        for (long songNumber : songNumbers) {
            System.out.print(songNumber + " ");
        }
    }

    // Function to calculate the song numbers for each moment
    private static long[] calculateSongNumbers(int n, int m, long[] c, long[] t, long[] moments) {
        long[] songNumbers = new long[m];
        long totalDuration = 0;

        // Calculate the total duration of the playlist
        for (int i = 0; i < n; i++) {
            totalDuration += c[i] * t[i];
        }

        // Iterate through the moments and find the corresponding song number
        int momentIndex = 0;
        long cumulativeDuration = 0;
        for (int i = 0; i < n; i++) {
            cumulativeDuration += c[i] * t[i];
            while (momentIndex < m && moments[momentIndex] <= cumulativeDuration) {
                songNumbers[momentIndex] = i + 1;
                momentIndex++;
            }
        }

        return songNumbers;
    }
}