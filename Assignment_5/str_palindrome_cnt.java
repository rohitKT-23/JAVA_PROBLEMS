import java.util.*;

public class str_palindrome_cnt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 
        String str = sc.next();

        // Output 
        System.out.println(cnt_str_palindrome(str));
        sc.close();
    }

    static int cnt_str_palindrome(String str) {
        int cnt = 0;

        // loop for each character
        for (int i = 0; i < str.length(); i++) {
            // substring with odd length
            cnt += expnd_arnd_cntr(str, i, i);

            // substrings with even length
            cnt += expnd_arnd_cntr(str, i, i + 1);
        }

        return cnt;
    }

    static int expnd_arnd_cntr(String str, int left, int right) {
        int cnt = 0;

        // left and right are equal
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }
}
