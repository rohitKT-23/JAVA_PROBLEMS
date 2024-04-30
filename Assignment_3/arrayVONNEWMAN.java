import java.util.Scanner;

public class arrayVONNEWMAN {
    public static int binaryToDecimal(String binary) {
        int deci = 0;
        int n = binary.length();

        for (int i = 0; i < n; i++) {
            int bit = binary.charAt(i) - '0';
            deci+= bit * Math.pow(2, n - 1 - i);
        }

        return deci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_nums = scanner.nextInt(); // Number of binary numbers

        for (int i = 0; i < total_nums; i++) {
            String binary = scanner.next();
            int decimal = binaryToDecimal(binary);
            System.out.println(decimal);
        }
        scanner.close();
    }
}
