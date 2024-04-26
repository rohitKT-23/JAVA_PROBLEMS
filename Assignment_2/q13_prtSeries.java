import java.util.Scanner;

public class q13_prtSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        prtSeries(num1, num2);
        sc.close();
    }

    static void prtSeries(int num1, int num2) {
        int start = 0;
        int n = 1;
        while (start < num1) {
            int series = 3 * n + 2;
            if (series % num2 != 0) {
                System.out.println(series);
                start++;
            }
            n++;
        }
    }
}
