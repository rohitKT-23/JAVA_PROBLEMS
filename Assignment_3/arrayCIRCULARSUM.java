import java.util.Scanner;

public class arrayCIRCULARSUM {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tst_case = sc.nextInt(); 

        while (tst_case-- > 0) {
            int total_nums = sc.nextInt();
            int[] nums = new int[total_nums];

            for (int i = 0; i < total_nums; i++) {
                nums[i] = sc.nextInt();
            }

            int maxCirSum = circularSubarraySum(nums);
            System.out.println(maxCirSum);
        }
        sc.close();
    }
    public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static int circularSubarraySum(int[] nums) {
        int n = nums.length;

        int maxNonCirSum = maxSubarraySum(nums);

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = -nums[i];
        }

        int minSubarraySum = maxSubarraySum(nums);

        int maxCircularSum = totalSum + minSubarraySum;

        if (maxCircularSum == 0) {
            return maxNonCirSum;
        }

        return Math.max(maxNonCirSum, maxCircularSum);
    }

}
