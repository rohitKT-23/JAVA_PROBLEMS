import java.util.*;

class stks2qu1 {
    private Stack<Integer> qu_stk;
    private Stack<Integer> dequ_stk;

    public stks2qu1() {
        qu_stk = new Stack<>();
        dequ_stk = new Stack<>();
    }

    public void qu(int element) {
        qu_stk.push(element);
    }

    public int dequ() {
        if (dequ_stk.isEmpty()) {
            trnsfr();
        }
        return dequ_stk.pop();
    }

    private void trnsfr() {
        while (!qu_stk.isEmpty()) {
            dequ_stk.push(qu_stk.pop());
        }
    }
}

public class dequeue_effiecent_queue_using_stacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();

        stks2qu1 queue = new stks2qu1();

        for (int i = 0; i < nums; i++) {
            queue.qu(i);
        }

        for (int i = 0; i < nums; i++) {
            System.out.print(queue.dequ() + " ");
        }
    }
}
