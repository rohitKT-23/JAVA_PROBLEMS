import java.util.*;

public class mental_maths_problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array_Size = scanner.nextInt();
        int[] array = new int[array_Size];

        for (int i = 0; i < array_Size; i++) {
            array[i] = scanner.nextInt();
        }

        long max_product = MAX_prduct(array);

        System.out.println(max_product);

        scanner.close();
    }

    public static long MAX_prduct(int[] array) {
        int array_Size = array.length;

        Arrays.sort(array);

        // three largest numbers
        long product1 = (long) array[array_Size - 1] * array[array_Size - 2] * array[array_Size - 3];

        // two smallest numbers (possibly negative) and the largest number
        long product2 = (long) array[0] * array[1] * array[array_Size - 1];

        return Math.max(product1, product2);
    }


}
