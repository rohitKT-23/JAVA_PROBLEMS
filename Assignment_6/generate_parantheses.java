import java.util.*;
/**
 * parantheses
 */
public class generate_parantheses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paranthese = scan.nextInt();
        parantheses(paranthese, 0, 0, "");
        scan.close();
    }
    public static void parantheses(int paranthese, int opn, int cls, String ans) {
        if (opn == paranthese && cls == paranthese) {
            System.out.println(ans);
            return;
        }

        if (cls < opn) {
            parantheses(paranthese, opn, cls + 1, ans + ")");
        }
        if (opn < paranthese) {
            parantheses(paranthese, opn + 1, cls, ans + "(");
        }
    }
}