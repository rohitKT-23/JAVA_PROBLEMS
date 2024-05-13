import java.util.Scanner;

public class strdiff_ascii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String str = sc.next();

        // Output
        System.out.println(ascii(str));
        sc.close();
    }

    static String ascii(String str) {
    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < str.length() - 1; i++) {
        char curr_char = str.charAt(i);
        char nxt_char = str.charAt(i + 1);

        int ascii_diff = nxt_char - curr_char;

        ans.append(curr_char);

        // Append a hyphen before negative differences
        if (ascii_diff < 0) {
            ans.append(ascii_diff);
        } else {
            ans.append("+").append(ascii_diff);
        }
    }

    // append last char of str
    ans.append(str.charAt(str.length() - 1));

    return ans.toString();
}
}
