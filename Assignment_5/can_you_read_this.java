import java.util.Scanner;

public class can_you_read_this {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        String text = sc.nextLine();

        // output
        fnd_and_prt(text);

        sc.close();
    }

    private static void fnd_and_prt(String text) {

        StringBuilder word = new StringBuilder();


        for (char ch : text.toCharArray()) {
            // Check if uppercase letter
            if (Character.isUpperCase(ch)) {
                //word is not empty, print it
                if (word.length() > 0) {
                    System.out.println(word);
                    // Reset  StringBuilder for next 
                    word.setLength(0);
                }
            }
            // Append
            word.append(ch);
        }

        // Print the last word
        if (word.length() > 0) {
            System.out.println(word);
        }
    }
}
