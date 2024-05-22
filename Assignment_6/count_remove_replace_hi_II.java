import java.util.Scanner;

public class count_remove_replace_hi_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string_1 = sc.nextLine();

        int cnt_no_hit = cnt_hi_not_hit(string_1);
        System.out.println(cnt_no_hit);

        String not_hit = rmv_hi_not_hit(string_1);
        System.out.println(not_hit);

        String replc_bye = replace_hi_with_bye(string_1);
        System.out.println(replc_bye);
    }

    public static int cnt_hi_not_hit(String str_1) {
        if (str_1.length() <= 1) {
            return 0;
        }

        if (str_1.startsWith("hi") && !str_1.startsWith("hit")) {
            return 1 + cnt_hi_not_hit(str_1.substring(2));
        }

        return cnt_hi_not_hit(str_1.substring(1));
    }

    // rmv 'hi' excluding 'hit'
    public static String rmv_hi_not_hit(String str_1) {
        if (str_1.length() <= 1) {
            return str_1;
        }

        if (str_1.startsWith("hi") && !str_1.startsWith("hit")) {
            return rmv_hi_not_hit(str_1.substring(2));
        }

        return str_1.charAt(0) + rmv_hi_not_hit(str_1.substring(1));
    }

    // replace 'hi' with 'bye' excluding 'hit'
    public static String replace_hi_with_bye(String str_1) {
        if (str_1.length() <= 1) {
            return str_1;
        }

        if (str_1.startsWith("hi") && !str_1.startsWith("hit")) {
            return "bye" + replace_hi_with_bye(str_1.substring(2));
        }

        return str_1.charAt(0) + replace_hi_with_bye(str_1.substring(1));
    }
}
