import java.util.Scanner;

public class kill_the_duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();
        int[] array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        int newSize = kill_duplicates(array);

        for (int i = 0; i < newSize; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }

    static int kill_duplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int idx = 1; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[idx++] = array[i];
            }
        }

        return idx;
    }
}
