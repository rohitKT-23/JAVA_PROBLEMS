import java.util.Scanner;

public class replace_all_pie {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < number; i++) {
            String str = scan.nextLine();
            String ans = pie_replacing(str);
            System.out.println(ans);
        }
        scan.close();  
    }

    static String pie_replacing(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.startsWith("pi")) {
            return "3.14" + pie_replacing(str.substring(2));
        }

        return str.charAt(0) + pie_replacing(str.substring(1));
    }
}
