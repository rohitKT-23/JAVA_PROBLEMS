import java.util.Scanner;

public class q3_FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int step = sc.nextInt();
        int i = minF;
        while (i <= maxF) {
            double c = 5.0 / 9.0 * (i - 32);
            System.out.println(i + " " + (int) c);
            i += step;
        }
        sc.close();
    }
}
