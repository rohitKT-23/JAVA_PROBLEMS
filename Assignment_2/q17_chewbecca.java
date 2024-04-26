import java.util.Scanner;

public class q17_chewbecca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long ans = Chewbacca(num);
        System.out.println(ans);
        sc.close();
    }

    public static long Chewbacca(long num) {
        long ans = 0;
        long multi = 1;

        while (num > 0) {
            long digit = num % 10;
            long iDigit = Math.min(digit, 9 - digit);
            if (iDigit != 0 || ans != 0) {
                ans += iDigit * multi;
                multi *= 10;
            }

            num /= 10;
        }

        return ans;
    }
}
