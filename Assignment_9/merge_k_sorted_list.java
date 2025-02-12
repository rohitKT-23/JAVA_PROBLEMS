import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int val, lst_IDX, elmnt_IDX;

    Node(int val, int lst_IDX, int elmnt_IDX) {
        this.val = val;
        this.lst_IDX = lst_IDX;
        this.elmnt_IDX = elmnt_IDX;
    }

    @Override
    public int compareTo(Node other) {
        return this.val - other.val; // Min-heap based on val
    }
}

public class merge_k_sorted_list {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int K = scn.nextInt();
        int N = scn.nextInt();

        int[][] lsts = new int[K][N];
        
        for (int num = 0; num < K; num++) {
            for (int num1 = 0; num1 < N; num1++) {
                lsts[num][num1] = scn.nextInt();
            }
        }

        PriorityQueue<Node> min_hp = new PriorityQueue<>();

        for (int num = 0; num < K; num++) {
            min_hp.offer(new Node(lsts[num][0], num, 0));
        }

        StringBuilder ans = new StringBuilder();

        while (!min_hp.isEmpty()) {
            Node curr = min_hp.poll();
            ans.append(curr.val).append(" ");

            if (curr.elmnt_IDX + 1 < N) {
                min_hp.offer(new Node(lsts[curr.lst_IDX][curr.elmnt_IDX + 1], curr.lst_IDX, curr.elmnt_IDX + 1));
            }
        }

        System.out.println(ans.toString().trim());
        
        scn.close();
    }
}
