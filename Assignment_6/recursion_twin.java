import java.util.Scanner;

public class recursion_twin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        int twins = total_twins(str);
        System.out.println(twins);
        scanner.close();
    }

    public static int total_twins(String str) {
        if (str.length() < 3) {
            return 0;
        }

        int cnt = 0;

        if (str.charAt(0) == str.charAt(2)) {
            cnt = 1;
        }

        return cnt + total_twins(str.substring(1));
    }
}
