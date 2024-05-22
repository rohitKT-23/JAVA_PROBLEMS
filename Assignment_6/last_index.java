import java.util.Scanner;

public class last_index {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_elements = scan.nextInt();

        int[] array = new int[total_elements];
        for (int i = 0; i < total_elements; i++) {
            array[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int lst_idx = lst_idx_num(array, total_elements - 1, target);
        System.out.println(lst_idx);
        scan.close();
    }

    private static int lst_idx_num(int[] array, int index, int target) {
        if (index < 0) {
            return -1; // target not found 
        }

        if (array[index] == target) {
            return index; // Found target at current index
        }
        // repeat the search for remaining once
        return lst_idx_num(array, index - 1, target);
    }
}
