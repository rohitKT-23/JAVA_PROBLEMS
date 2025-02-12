import java.util.*;

public class corners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();
        int[] directions = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            directions[i] = sc.nextInt();
        }

        int max_loop = longest_loop(directions);
        System.out.println(max_loop);

        sc.close();
    }

    static int longest_loop(int[] directions) {
        int max_loop = 0;

        for (int i = 0; i < directions.length; i++) {
            int curr = i;
            int len_of_cycle = 0;

            while (directions[curr] != -1) {
                int next = directions[curr];
                directions[curr] = -1; // Mark as visited
                curr = next;
                len_of_cycle++;
            }

            max_loop = Math.max(max_loop, len_of_cycle);
        }

        return max_loop;
    }
}
