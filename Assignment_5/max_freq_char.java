import java.util.Scanner;

public class max_freq_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String str = sc.next();

        // Output 
        System.out.println(max_freq_char(str));
        sc.close();
    }

    static char max_freq_char(String s) {
        // Create an array to store the freq of each character
        int[] freq = new int[256];

        // Traverse the string and update the freq
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Find max freq char 
        char max_freq_char = '\0';
        int max_freq = 0;

        for (char c = 0; c < 256; c++) {
            if (freq[c] > max_freq) {
                max_freq = freq[c];
                max_freq_char = c;
            }
        }

        return max_freq_char;
    }
}
