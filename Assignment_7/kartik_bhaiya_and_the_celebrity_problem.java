import java.util.*;

public class kartik_bhaiya_and_the_celebrity_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        int[][] mtx = new int[nums][nums];

        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < nums; j++) {
                mtx[i][j] = scan.nextInt();
            }
        }

        int celeb_no = find_celeb(nums, mtx);
        if (celeb_no != -1) {
            System.out.println(celeb_no);
        } else {
            System.out.println("No Celebrity");
        }
    }

    public static int find_celeb(int nums, int[][] mtx) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < nums; i++) {
            stk.push(i);
        }

        while (stk.size() > 1) {
            int a = stk.pop();
            int b = stk.pop();

            if (knows(a, b, mtx)) {
                stk.push(b);
            } else {
                stk.push(a);
            }
        }

        int new_celeb = stk.pop();

        for (int i = 0; i < nums; i++) {
            if (i != new_celeb && (knows(new_celeb, i, mtx) || !knows(i, new_celeb, mtx))) {
                return -1; 
            }
        }

        return new_celeb;
    }

    public static boolean knows(int a, int b, int[][] mtx) {
        return mtx[a][b] == 1;
    }
}
