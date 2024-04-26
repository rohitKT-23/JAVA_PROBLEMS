import java.util.Scanner;

public class q12_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num == 0) {
            num = 5;
            System.out.println(num);
        } else {
            long ans = replace(num);
            System.out.println(ans);
        }

        sc.close();
    }

    static long replace(long num) {
        long ans = 0;
        long multi = 1;

        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            ans = ans + digit * multi;
            multi = multi * 10;
            num = num / 10;
        }

        return ans;
    }
}