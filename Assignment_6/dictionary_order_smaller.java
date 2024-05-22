import java.util.*;

public class dictionary_order_smaller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string_1 = scan.nextLine();
        char[] array = string_1.toCharArray();
        Arrays.sort(array);
        order_by_smaller(array, "", string_1);
        scan.close();

    }
    static boolean main_value = false;
    public static void order_by_smaller(char[] str, String answer, String target_val){
        if (answer.length() == str.length && answer.equals(target_val)) {
            main_value = true;
            return;
        }
        if (main_value != true && answer.length() == str.length) {
            System.out.println(answer);
            return;
        }

        for (int row = 0; row < str.length; row++) {
            if(answer.indexOf(str[row]) == -1){
                order_by_smaller(str, answer + str[row], target_val);
            }
        }
    }
}
