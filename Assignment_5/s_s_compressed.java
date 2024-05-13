import java.util.Scanner;

public class s_s_compressed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        String string = sc.nextLine();

        String result = COMPRESSED(string);
        System.out.println(result);
    }

    private static String COMPRESSED(String str) {
        StringBuilder compressed_CHAR = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed_CHAR.append(str.charAt(i));
                if (count > 1) {
                    compressed_CHAR.append(count);
                }
                count = 1;
            }
        }

        return compressed_CHAR.toString();
    }
}
