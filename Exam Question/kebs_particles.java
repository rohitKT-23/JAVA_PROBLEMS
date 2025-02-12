import java.util.*;

public class kebs_particles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array_size = sc.nextInt();

        // charges of Z-particles
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        // prefix product
        // suffix product 
        long[] pre_product = new long[array_size];
        long[] suf_product = new long[array_size];

        pre_product[0] = 1;
        for (int i = 1; i < array_size; i++) {
            pre_product[i] = pre_product[i - 1] * array[i - 1];
        }

        suf_product[array_size - 1] = 1;
        for (int i = array_size - 2; i >= 0; i--) {
            suf_product[i] = suf_product[i + 1] * array[i + 1];
        }

        // effect on each
        for (int i = 0; i < array_size; i++) {
            long effect = pre_product[i] * suf_product[i];
            System.out.print(effect + " ");
        }

        sc.close();
    }
}
