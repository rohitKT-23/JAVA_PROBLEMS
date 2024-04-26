import java.util.Scanner;

public class q5_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int dividend = sc.nextInt();
        int mul = divisor * dividend;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println(mul / divisor);
        sc.close();
    }
}
