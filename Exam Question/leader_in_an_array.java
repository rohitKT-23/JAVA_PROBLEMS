import java.util.*;

public class leader_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size_of_array = sc.nextInt();
        
        // Input 
        int[] array = new int[size_of_array];
        for (int i = 0; i < size_of_array; i++) {
            array[i] = sc.nextInt();
        }

        LEADERS(array);
        sc.close();
    }

    static void LEADERS(int[] array) {
        int n = array.length;

        int max_at_right = array[n - 1];
        System.out.print(max_at_right + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > max_at_right) {
                max_at_right = array[i];
                System.out.print(max_at_right + " ");
            }
        }
    }
}
