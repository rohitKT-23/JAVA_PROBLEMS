import java.util.Scanner;

public class q8_BtoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (num != 0) {
            long rem = num % 10;
            num = num / 10;
            sum += rem * Math.pow(2, i);
            ++i;
        }
        System.out.println(sum);
        sc.close();
    }
}
