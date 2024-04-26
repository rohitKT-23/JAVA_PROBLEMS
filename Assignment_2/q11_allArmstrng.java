import java.util.Scanner;

public class q11_allArmstrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        findArmstrngNum(Num1, Num2);
        sc.close();
    }

    static void findArmstrngNum(int Num1, int Num2) {
        for (int number = Num1; number <= Num2; number++) {
            if (chk_Armstrng(number)) {
                System.out.println(number);
            }
        }
    }

    static boolean chk_Armstrng(int num) {
        int Onum = num;
        int i = Onum;
        num = i;
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
        return sum == num;
    }
}
