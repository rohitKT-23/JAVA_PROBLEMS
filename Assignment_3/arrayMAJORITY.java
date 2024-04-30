import java.util.Scanner;

public class arrayMAJORITY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt(); // Size of the array
        int[] nums = new int[total_nums];

        for (int i = 0; i < total_nums; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int MAJORITY = MAJORITY(nums);
        System.out.println(MAJORITY);
    }
    public static int MAJORITY(int[] nums) {
        int candidate = 0;
        int cnt = 0;

        for (int num : nums) {
            if (cnt == 0) {
                candidate = num;
                cnt = 1;
            } else if (candidate == num) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return candidate;
    }

}
