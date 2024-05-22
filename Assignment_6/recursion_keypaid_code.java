import java.util.*;

public class recursion_keypaid_code {

    static String[] keypad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        wrds_combinations(str, "");

        int cnt = cnt_wrds(str, "");
        System.out.println("\nCount: " + cnt);
        scan.close();
    }

    static void wrds_combinations(String digits, String curr_wrd) {
        if (digits.length() == 0) {
            System.out.print(curr_wrd + " ");
            return;
        }

        int digit = digits.charAt(0) - '0';
        String alphabets = keypad[digit];

        for (int i = 0; i < alphabets.length(); i++) {
            wrds_combinations(digits.substring(1), curr_wrd + alphabets.charAt(i));
        }
    }

    static int cnt_wrds(String digits, String curr_wrd) {
        if (digits.length() == 0) {
            return 1;
        }

        int cnt = 0;
        int digit = digits.charAt(0) - '0';
        String alphabets = keypad[digit];

        for (int i = 0; i < alphabets.length(); i++) {
            cnt += cnt_wrds(digits.substring(1), curr_wrd + alphabets.charAt(i));
        }

        return cnt;
    }
}
