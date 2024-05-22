import java.util.*;
/**
 * mapped_string
 */
public class mapped_string {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string_1 = scan.next();
        mapping(string_1, 0, "");
        scan.close();
    }
    public static void mapping(String string_1, int idx, String ans) {
        if(idx == string_1.length()) {
            System.out.println(ans);
            return;
        }
        int digit_1 = string_1.charAt(idx) - '0';
        char alphabets = (char)('A' + digit_1 - 1);
        mapping(string_1, idx + 1, ans + alphabets);
        if(idx + 1 < string_1.length()) {
            int digit_2 = string_1.charAt(idx + 1) - '0';
            int num = digit_1 * 10 + digit_2;
            if(num <= 26) {
                alphabets = (char)('A' + num - 1);
                mapping(string_1, idx + 2, ans + alphabets);
            }
        }
    }
}