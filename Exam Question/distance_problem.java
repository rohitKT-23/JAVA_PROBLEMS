import java.util.*;

public class distance_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();
        int k = sc.nextInt();

        // array elements
        int[] numbers = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sorting
        Arrays.sort(numbers);

        // binary search -> kth smallest distance
        int lw = 0, hi = numbers[array_size - 1] - numbers[0];

        while (lw < hi) {
            int mid = (lw + hi) / 2;
            if (kth_distance_pairs(numbers, mid) < k) {
                lw = mid + 1;
            } else {
                hi = mid;
            }
        }

        // Output 
        System.out.println(lw);

        sc.close();
    }

    // Function to cnt pairs with distance less than or equal to mid
    private static int kth_distance_pairs(int[] numbers, int mid) {
        int cnt = 0;
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            while (j < numbers.length && numbers[j] - numbers[i] <= mid) {
                j++;
            }
            cnt += j - i - 1;
        }

        return cnt;
    }
}
