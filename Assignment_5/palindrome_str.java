import java.util.Scanner;

public class palindrome_str {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 
        String str = sc.next();

        // Output 
        System.out.println(IS_PALINDROME(str));
        sc.close();
    }

    static boolean IS_PALINDROME(String s) {
        // cnvrt to lowercase so it become case insensitive
        s = s.toLowerCase();

        // two pointer approach
        int lft = 0;
        int rht = s.length() - 1;

        while (lft < rht) {
            if (s.charAt(lft) != s.charAt(rht)) {
                return false;
            }
            lft++;
            rht--;
        }

        return true;
    }
}
