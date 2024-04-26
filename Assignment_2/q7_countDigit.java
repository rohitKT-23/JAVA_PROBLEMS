import java.util.Scanner;

public class q7_countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        int count = 0;
        if (digit < 0 || digit > 9) {
            System.out.println("Invalid");
        } else {
            if (digit == 0 && num == 0) {
                count = 1;
            } else {
                while (num != 0) {
                    int l_Digit = num % 10;
                    if (l_Digit == digit) {
                        count++;
                    }
                    num /= 10;
                }
            }
            System.out.println(count);
            sc.close();
        }
    }
}