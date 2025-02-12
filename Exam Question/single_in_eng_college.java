import java.util.*;

public class single_in_eng_college {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        int array_size = scanner.nextInt();
        int[] trees_heights = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            trees_heights[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        // output
        int ans = trees_height_cutting(trees_heights, x);
        System.out.println(ans);

        scanner.close();
    }

    public static int trees_height_cutting(int[] trees, int x) {
        int lw = 1;
        int hi = maximum_height(trees);
        int ans = 0;

        while (lw <= hi) {
            int mid = (lw + hi) / 2;
            int total_cut_wood = total_wood_cut(trees, mid);

            if (total_cut_wood >= x) {
                ans = mid;
                lw = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }

    public static int maximum_height(int[] trees) {
        int maxH8 = Integer.MIN_VALUE;
        for (int height : trees) {
            maxH8 = Math.max(maxH8, height);
        }
        return maxH8;
    }

    public static int total_wood_cut(int[] trees, int height) {
        int total_cut_wood = 0;
        for (int tree : trees) {
            total_cut_wood += Math.max(0, tree - height);
        }
        return total_cut_wood;
    }

}
