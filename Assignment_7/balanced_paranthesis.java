import java.util.*;

public class balanced_paranthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        
        if (is_vld(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean is_vld(String input) {
        Stack<Character> stk = new Stack<>();
        
        for (char bkt : input.toCharArray()) {
            if (bkt == '(' || bkt == '{' || bkt == '[') {
                stk.push(bkt);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                
                char top = stk.pop();
                if ((bkt == ')' && top != '(') ||
                    (bkt == '}' && top != '{') ||
                    (bkt == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stk.isEmpty();
    }
}
