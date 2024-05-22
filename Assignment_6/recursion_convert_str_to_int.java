import java.util.Scanner; 
/**
 * recursion_convert_str_to_int
 */
public class recursion_convert_str_to_int {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string_1 = scan.next();
        System.out.println(str_to_int(string_1, 0));
        scan.close();
    }
    public static int str_to_int(String string_1, int idx) {
        if(idx == string_1.length()) {
            return 0;
        }
        int digit = string_1.charAt(idx) - '0';
        int power = (int)Math.pow(10, string_1.length() - idx - 1);
        int ans = digit * power + str_to_int(string_1, idx + 1);
        return ans;
    }
}