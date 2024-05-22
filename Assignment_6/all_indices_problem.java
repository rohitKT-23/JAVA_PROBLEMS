import java.util.Scanner;

public class all_indices_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int[] ans = findIndices(array, target, 0, 0);
        
        for (int i : ans) {
            System.out.print(i + " ");
        }
        scan.close();
    }

    private static int[] findIndices(int[] array, int target, int curr_idx, int cnt) {
        if (curr_idx >= array.length) {
            int[] indices = new int[cnt];
            return cpy_idx(array, target, 0, 0, indices);
        }

        if (array[curr_idx] == target) {
            cnt++;
        }

        return findIndices(array, target, curr_idx + 1, cnt);
    }

    private static int[] cpy_idx(int[] array, int target, int curr_idx, int idx_cpy, int[] indices) {
        if (curr_idx >= array.length) {
            return indices;
        }

        if (array[curr_idx] == target) {
            indices[idx_cpy] = curr_idx ; 
            idx_cpy++;
        }

        return cpy_idx(array, target, curr_idx + 1, idx_cpy, indices);
    }
}
