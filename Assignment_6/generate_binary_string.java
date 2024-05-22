import java.util.Scanner;

public class generate_binary_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test_case = scan.nextInt();

        for (int t = 0; t < test_case; t++) {
            String str = scan.next();

            binary_str(str);
        }
        scan.close();
    }

    private static void binary_str(String str) {
        helper_GBS(str, 0, "");
    }

    private static void helper_GBS(String str, int idx, String curr) {
        if (idx == str.length()) {
            System.out.print(curr + " ");
            return;
        }

        char curr__char = str.charAt(idx);

        if (curr__char == '?') {
            helper_GBS(str, idx + 1, curr + '0');
            helper_GBS(str, idx + 1, curr + '1');
        } else {
            helper_GBS(str, idx + 1, curr + curr__char);
        }
    }
}
