import java.util.Scanner;

public class rotate_img {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int array_size = sc.nextInt();
        int[][] array = new int[array_size][array_size];

        for (int i = 0; i < array_size; i++) {
            for (int j = 0; j < array_size; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Rotate and print
        transpose(array);
        reverse(array);
        for (int i = 0; i < array_size; i++) {
            for (int j = 0; j < array_size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void transpose(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[0].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] array) {
        int minROW = 0;
        int maxROW = array.length - 1;
        while (minROW < maxROW) {
            int[] temp = array[minROW];
            array[minROW] = array[maxROW];
            array[maxROW] = temp;
            minROW++;
            maxROW--;
        }
    }
}
