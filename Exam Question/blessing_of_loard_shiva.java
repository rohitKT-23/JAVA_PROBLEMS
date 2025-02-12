import java.util.*;

public class blessing_of_loard_shiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt(); 

        for (int t = 0; t < test_cases; t++) {
            String str = sc.next(); // Input string for each test case
            int ans = alternate_char(str);
            System.out.println(ans);
        }

        sc.close();
    }

    public static int alternate_char(String str) {
        int fliping_A = 0;
        int fliping_B = 0;

        // alternate string pattern for "a"
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && str.charAt(i) != 'a') {
                fliping_A++;
            } else if (i % 2 == 1 && str.charAt(i) != 'b') {
                fliping_A++;
            }
        }

        // alternate string pattern for "b"
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && str.charAt(i) != 'b') {
                fliping_B++;
            } else if (i % 2 == 1 && str.charAt(i) != 'a') {
                fliping_B++;
            }
        }
        // minimun
        return Math.min(fliping_A, fliping_B);
    }
}
