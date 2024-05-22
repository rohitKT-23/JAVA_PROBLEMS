import java.util.Scanner;

public class first_index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int ans = first_idx_num(array, target, 0);
        System.out.println(ans);
        scan.close();
    }

    private static int first_idx_num(int[] array, int target, int curr_idx) {
        if (curr_idx >= array.length) {
            return -1;
        }

        if (array[curr_idx] == target) {
            return curr_idx;
        }

        return first_idx_num(array, target, curr_idx + 1);
    }
}
