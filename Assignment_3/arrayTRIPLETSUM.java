import java.util.Arrays;
import java.util.Scanner;

public class arrayTRIPLETSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // number of elements in array
        int num_limit = sc.nextInt();

    // array elements 
        int[] array = new int[num_limit];
        for (int i = 0; i < num_limit; i++) {
            array[i] = sc.nextInt();
        }

        
        int target = sc.nextInt();

        
        Triplets(array, target);
        sc.close();
    }

    private static void Triplets(int[] array, int target) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            int lft = i + 1;
            int rht = array.length - 1;

            while (lft < rht) {
                int cSum = array[i] + array[lft] + array[rht];

                if (cSum == target) {
                    System.out.println(array[i] + ", " + array[lft] + " and " + array[rht]);
                    lft++;
                    rht--;

                    // Skip duplicates
                    while (lft < rht && array[lft] == array[lft - 1]) {
                        lft++;
                    }
                    while (lft < rht && array[rht] == array[rht + 1]) {
                        rht--;
                    }
                } else if (cSum < target) {
                    lft++;
                } else {
                    rht--;
                }
            }
        }
    }
}
