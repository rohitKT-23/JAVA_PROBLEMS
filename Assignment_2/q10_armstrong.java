import java.util.Scanner;

public class q10_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Onum = sc.nextInt();
        int i = Onum;
        int num = i;
        int digit = 0;
        int sum = 0;
        while (Onum > 0) {
            Onum /= 10;
            digit++;
        }
        while (i > 0) {
            int rem = i % 10;
            sum += Math.pow(rem, digit);
            i /= 10;
        }
        if (sum == num) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();

    }
}
