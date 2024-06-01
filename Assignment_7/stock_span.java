import java.util.*;

public class stock_span {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] cost = new int[num];

        for (int i = 0; i < num; i++) {
            cost[i] = scan.nextInt();
        }

        int[] spns = calculateStockSpan(cost);
        
        for (int i = 0; i < num; i++) {
            System.out.print(spns[i] + " ");
        }
        System.out.println("END");
    }

    public static int[] calculateStockSpan(int[] cost) {
        int num = cost.length;
        int[] spns = new int[num];
        Stack<Integer> stks = new Stack<>(); // Stack to store indices

        spns[0] = 1;
        stks.push(0);

        for (int i = 1; i < num; i++) {
            while (!stks.isEmpty() && cost[i] >= cost[stks.peek()]) {
                stks.pop();
            }

            spns[i] = stks.isEmpty() ? i + 1 : i - stks.peek();

            stks.push(i);
        }

        return spns;
    }
}
