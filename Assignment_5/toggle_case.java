import java.util.Scanner;

public class toggle_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        String input = sc.nextLine();

        // output
        String ans = toggle(input);
        System.out.println("Toggled case: " + ans);
        sc.close();
    }

    private static String toggle(String str) {
        char[] charater = str.toCharArray();

        for (int i = 0; i < charater.length; i++) {
            char currentChar = charater[i];

            if (Character.isUpperCase(currentChar)) {
                charater[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charater[i] = Character.toUpperCase(currentChar);
            }
            // Ignore non-alphabetic characters
        }

        return new String(charater);
    }
}
