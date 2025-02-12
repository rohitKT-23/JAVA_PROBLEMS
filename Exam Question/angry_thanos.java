import java.util.*;

public class angry_thanos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        int new_array_size = removing_duplicates(array);

        for (int i = 0; i < new_array_size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }

    public static int removing_duplicates(int[] array) {
        int array_size = array.length;
        if (array_size <= 2) {
            return array_size;
        }

        int idx = 2;

        for (int i = 2; i < array_size; i++) {
            if (array[i] != array[idx - 2]) {
                array[idx++] = array[i];
            }
        }

        return idx;
    }

}
