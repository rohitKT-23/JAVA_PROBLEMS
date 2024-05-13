import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // output
        String result = REPLACE(input);
        System.out.println(result);
    }

    private static String REPLACE(String str) {
        char[] CHARATER = str.toCharArray();

        for (int i = 0; i < CHARATER.length; i++) {
            char CURRENT_CHAR = CHARATER[i];

            if (i % 2 == 0) {
                // REPLACE EVEN WITH NEXT
                CHARATER[i] = (char) (CURRENT_CHAR + 1);
            } else {
                // REPLACE ODD WITH PREVIOUS
                CHARATER[i] = (char) (CURRENT_CHAR - 1);
            }
        }

        return new String(CHARATER);
    }
}
