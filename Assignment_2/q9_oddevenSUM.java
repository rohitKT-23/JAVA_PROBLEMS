import java.util.Scanner;

public class q9_oddevenSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenS = 0;
        int oddS = 0;
        int position = 1;
        while (n > 0) {
            int digit = n % 10;

            if (position % 2 == 0) {
                evenS += digit;
            } else {
                oddS += digit;
            }
            n /= 10;
            position++;
        }
        System.out.println(oddS);
        System.out.println(evenS);
        sc.close();
    }
}
