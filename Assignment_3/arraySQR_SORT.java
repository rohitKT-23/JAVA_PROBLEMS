import java.util.*;

public class arraySQR_SORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt();
        int[] nums = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            nums[i] = sc.nextInt();
        }

        int[] sortedSquaredArray = srq_sorted(nums);

        for (int value : sortedSquaredArray) {
            System.out.print(value + " ");
        }
        sc.close();
    }
    public static int[] srq_sorted(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }
}
