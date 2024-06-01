import java.util.*;

public class playing_with_cards_in_stacks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_cards = scn.nextInt();
        int shuffling = scn.nextInt(); 

        Stack<Integer> stk = new Stack<>();

        for (int num = 0; num < t_cards; num++) {
            int x = scn.nextInt();
            stk.push(x);
        }

        cardStacking(stk, t_cards, shuffling);
    }

    public static int PRIME(int num) {
        if (num == 1) return 2;
        num = num - 1;
        int j = 3;
        while (num > 0) {
            boolean validity_of_prime = true;
            for (int k = 2; k <= Math.sqrt(j); k++) {
                if (j % k == 0) {
                    validity_of_prime = false;
                    break;
                }
            }
            if (validity_of_prime) {
                num--;
            }
            j += 2;
        }
        return j - 2;
    }

    public static void prt_stk(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void cardStacking(Stack<Integer> num1_pre, int t_cards, int shuffling) {
        Stack<Integer> num1 = new Stack<>();
        Stack<Integer> num2 = new Stack<>();
        Stack<Integer> xchng = new Stack<>();

        if (shuffling == 0) {
            prt_stk(num1_pre);
            return;
        }

        for (int num = 1; num <= shuffling; num++) {
            while (!num1_pre.isEmpty()) {
                int top = num1_pre.pop();
                if (top % PRIME(num) == 0) {
                    num2.push(top);
                } else {
                    num1.push(top);
                }
            }
            prt_stk(num2);
            while (!num1.isEmpty()) {
                xchng.push(num1.pop());
            }
            while (!xchng.isEmpty()) {
                num1_pre.push(xchng.pop());
            }
        }
        prt_stk(num1_pre);
    }
}