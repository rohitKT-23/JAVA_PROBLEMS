import java.util.Scanner;

public class q16_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int cNum = sc.nextInt();
            if (RUN(cNum)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

    public static boolean RUN(int cNum) {
        int eSum = 0;
        int oSum = 0;
        while (cNum > 0) {     
            int digit = cNum % 10;
            if (digit % 2 == 0) {
                eSum += digit;
            } else {
                oSum += digit;
            }
            cNum /= 10;
        }

        return (oSum % 3 == 0) || (eSum % 4 == 0);
    }
}
