import java.util.*;

public class good_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String str = sc.next();

        // Output 
        System.out.println(aeiou_goodstr(str));
        sc.close();
    }

    static int aeiou_goodstr(String str) {
        int max_len = 0;
        int curr_len = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // if vowel...inc the curr_lenght
            if (is_vovel(currentChar)) {
                curr_len++;
            } else {
                // if not...update it
                max_len = Math.max(max_len, curr_len);
                curr_len = 0;
            }
        }

        // update last time if str end with a vowel
        max_len = Math.max(max_len, curr_len);

        return max_len;
    }

    static boolean is_vovel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
