import java.util.Scanner;

public class arrayZERO_ONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_num = sc.nextInt();

        // Read the sequence of 0s and 1s
        int[] seq = new int[total_num];

        for (int i = 0; i < total_num; i++) {
            seq[i] = sc.nextInt();
        }

        int cnt_0 = 0;
        int cnt_1 = 0;

        for (int i = 0; i < total_num; i++) {
            if (seq[i] == 0) {
                cnt_0++;
            } else {
                cnt_1++;
            }
        }

        int[] sorted_seq = new int[total_num];

        for (int i = 0; i < cnt_0; i++) {
            sorted_seq[i] = 0;
        }

        for (int i = cnt_0; i < total_num; i++) {
            sorted_seq[i] = 1;
        }

        // Print the sorted sequence
        for (int i = 0; i < total_num; i++) {
            System.out.print(sorted_seq[i] + " ");
        }
        sc.close();
    }
}
