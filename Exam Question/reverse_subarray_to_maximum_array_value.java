import java.util.Scanner;

public class reverse_subarray_to_maximum_array_value {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array size
        int n = scanner.nextInt();

        int[] nums = new int[n];
        // array element
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int ans = maximum_value(nums);
        System.out.println(ans);

        scanner.close();
    }
    
    public static int maximum_value(int[] nums) {
        int n = nums.length;
        // starting sum of absolute differences
        int total_sum = 0;
        for (int i = 0; i < n - 1; ++i) {
            total_sum += Math.abs(nums[i] - nums[i + 1]);
        }
        // initial total sum
        int maximum_sum = total_sum;
      
        // reversing subarray starting from the beginning or ending at the end gives better sum
        for (int i = 0; i < n - 1; ++i) {
            maximum_sum = Math.max(maximum_sum, total_sum + Math.abs(nums[0] - nums[i + 1]) - Math.abs(nums[i] - nums[i + 1]));
            maximum_sum = Math.max(maximum_sum, total_sum + Math.abs(nums[n - 1] - nums[i]) - Math.abs(nums[i] - nums[i + 1]));
        }
      
        // Prepare directions for the operations to be applied
        int[] directions = {1, -1, -1, 1, 1};
        // Use infinity to initialize max and min difference
        final int infinity = Integer.MAX_VALUE;
        // Check for all four combinations of directions
        for (int k = 0; k < 4; ++k) {
            int direction1 = directions[k], direction2 = directions[k + 1];
            int maxDiff = -infinity, minDiff = infinity;
            // Traverse and find maximum and minimum values
            for (int i = 0; i < n - 1; ++i) {
                int a = direction1 * nums[i] + direction2 * nums[i + 1];
                int absoluteDifference = Math.abs(nums[i] - nums[i + 1]);
                maxDiff = Math.max(maxDiff, a - absoluteDifference);
                minDiff = Math.min(minDiff, a + absoluteDifference);
            }
            // Update if the difference between maxDiff and minDiff improves the sum
            maximum_sum = Math.max(maximum_sum, total_sum + Math.max(0, maxDiff - minDiff));
        }
        return maximum_sum; // Return the maximized sum after operations
    }

}
