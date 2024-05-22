import java.util.Scanner;

/**
 * replace_all_0_with_5
 */
public class replace_all_0_with_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(replace(num));
        scan.close();
    }
    public static int replace(int num) {
        if (num == 0) {
            return 5;
        }
        return replace(num, 1);
    }
    private static int replace(int num, int place) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        if (digit == 0) {
            digit = 5;
        }
        return replace(num / 10, place * 10) + digit * place;
    }
}