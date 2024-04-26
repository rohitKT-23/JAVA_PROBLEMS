import java.util.Scanner;

public class q14_cumilativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cumulativeSum = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            cumulativeSum += num;

            if (cumulativeSum >= 0) {
                System.out.println(num);
            } else {
                break;
            }
        }

        sc.close();
    }
}
