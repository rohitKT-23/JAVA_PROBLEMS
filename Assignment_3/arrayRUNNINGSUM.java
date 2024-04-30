import java.util.Scanner;

public class arrayRUNNINGSUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt(); // Number of elements
        int[] nums = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            nums[i] = sc.nextInt();
        }

        int[] runningSums = RUNNING(nums);

        for (int i = 0; i < total_nums; i++) {
            System.out.print(runningSums[i] + " ");
        }
        sc.close();
    }
    public static int[] RUNNING(int[] nums) {
        int n = nums.length;
        int[] runningSums = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            runningSums[i] = sum;
        }

        return runningSums;
    }
}
