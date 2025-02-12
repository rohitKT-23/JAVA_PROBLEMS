import java.util.*;

public class prenace_party {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_of_student = sc.nextInt();

        // performance array
        int[] A = new int[number_of_student];
        for (int i = 0; i < number_of_student; i++) {
            A[i] = sc.nextInt();
        }

        int maximum_charm = cal_max_charm(A);
        System.out.println(maximum_charm);

        sc.close();
    }

    private static int cal_max_charm(int[] A) {
        Arrays.sort(A);

        int maximum_charm = 0;

        for (int i = 0; i < A.length; i += 2) {
            maximum_charm += A[i];
        }

        return maximum_charm;
    }
}
