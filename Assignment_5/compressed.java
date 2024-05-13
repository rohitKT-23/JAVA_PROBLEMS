import java.util.Scanner;

public class compressed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        String input = sc.nextLine();

        // output
        String ans = COMPRESSSED(input);
        System.out.println(ans);

        sc.close();
    }

    private static String COMPRESSSED(String str) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            // if same, increment +1
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // if differen, count in other 
                compressed.append(str.charAt(i)).append(count);
                count = 1; // Reset for next character
            }
        }

        // Append
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }
}
