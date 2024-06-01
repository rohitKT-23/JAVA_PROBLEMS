import java.util.*;

public class histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h8 = scan.nextInt();
        long[] h8s = new long[h8];
        for (int i = 0; i < h8; i++) {
            h8s[i] = scan.nextLong();
        }
        long max_area = large_rect_area(h8s);
        System.out.println(max_area);
    }

    public static long large_rect_area(long[] h8s) {
        Stack<Integer> stk = new Stack<>();
        long max_area = 0;
        int i = 0;
        while (i < h8s.length) {
            if (stk.isEmpty() || h8s[i] >= h8s[stk.peek()]) {
                stk.push(i);
                i++;
            } else {
                int top = stk.pop();
                long wid = stk.isEmpty() ? i : i - stk.peek() - 1;
                max_area = Math.max(max_area, h8s[top] * wid);
            }
        }
        while (!stk.isEmpty()) {
            int top = stk.pop();
            long wid = stk.isEmpty() ? h8s.length : h8s.length - stk.peek() - 1;
            max_area = Math.max(max_area, h8s[top] * wid);
        }
        return max_area;
    }
}
