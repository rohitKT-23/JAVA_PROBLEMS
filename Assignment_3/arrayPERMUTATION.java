import java.util.Scanner;

public class arrayPERMUTATION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tast_cases = scanner.nextInt(); // Number of test cases

        while (tast_cases-- > 0) {
            int total_nums = scanner.nextInt(); // Number of digits
            int[] nums = new int[total_nums];

            for (int i = 0; i < total_nums; i++) {
                nums[i] = scanner.nextInt();
            }

            nextPermutation(nums);

            for (int i = 0; i < total_nums; i++) {
                System.out.print(nums[i] + " ");
            }

            System.out.println();
        }
        scanner.close();
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    
}
