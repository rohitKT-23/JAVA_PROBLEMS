import java.util.Scanner;

public class local_maxima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        int local_maximaIndex = find_local_maxima(array);
        System.out.println(local_maximaIndex);

        sc.close();
    }

    private static int find_local_maxima(int[] array) {
        int lft = 0;
        int rht = array.length - 1;

        while (lft <= rht) {
            int mid = lft + (rht - lft) / 2;

            if ((mid == 0 || array[mid] > array[mid - 1]) && (mid == array.length - 1 || array[mid] > array[mid + 1])) {
                // array[mid] -> local maximum
                return mid;
            } else if (mid > 0 && array[mid - 1] > array[mid]) {
                // lft is greater, search in the lft 
                rht = mid - 1;
            } else {
                // rht is greater, search in the rht 
                lft = mid + 1;
            }
        }

        return -1;
    }
}
