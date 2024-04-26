import java.util.Scanner;
public class q1_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int dividend = sc.nextInt();
        while(dividend%divisor!=0){
            int remainder = dividend%divisor;
            dividend=divisor;
            divisor = remainder;
        }
        System.out.println(divisor);
        sc.close();
    }
}
