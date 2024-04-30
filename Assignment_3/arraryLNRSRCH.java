import java.util.Scanner;

public class arraryLNRSRCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // number of elements in array
        int N = sc.nextInt();

    // array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
    // target
        int target = sc.nextInt();

        int result = lnrSearch(array, target);
        System.out.println(result);
        sc.close();
    }

    private static int lnrSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
