import java.util.Scanner;

public class rmv_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String ip_str = sc.nextLine().trim();

        String op_str = remove_duplicates(ip_str);
        System.out.println(op_str);
        sc.close();
    }
    public static String remove_duplicates(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            ans.append(s.charAt(i));
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
            i++;
        }
        return ans.toString();
    }

}
