import java.util.Scanner;

public class q15_bostonNO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_NUM = scanner.nextInt();
        scanner.close();

        int ans = chkBOSTON(input_NUM);
        System.out.println(ans);
    }

    public static int DigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static int chkBOSTON(int num) {
        if (num <= 1)
            return 0;

        int Osum = DigitSum(num);
        int PFsum = 0;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                PFsum += DigitSum(i);
                num /= i;
            }
        }

        if (num > 1 && isPrime(num)) {
            PFsum += DigitSum(num);
        }

        return Osum == PFsum ? 1 : 0;
    }

}
