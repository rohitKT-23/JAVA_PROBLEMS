import java.util.ArrayList;
import java.util.Scanner;

public class q17_Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        ArrayList<Long> array1 = new ArrayList<Long>();

        int numOFdigit = 0;
        while (num > 0) {
            long rem = num % 10;
            array1.add(rem);
            num = num / 10;
            numOFdigit++;
        }

        for (int i = 0; i < numOFdigit; i++) {
            long digit = array1.get(i);
            if (i == numOFdigit - 1 && digit == 9) {
                continue;
            } else if (digit > 4) {
                array1.set(i, (long) 9 - digit);
            }
        }
        for (int i = numOFdigit - 1; i >= 0; i--) {
            System.out.print(array1.get(i));
        }
        sc.close();
    }
}