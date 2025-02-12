import java.util.Scanner;

public class deepak_and_his_journey {
    
    // Function to calculate the minimum cost of petrol
    static long calculateMinCost(int array_size, int[] C, int[] L) {
        long cost_total = 0;
        int cost_minimum = C[0];

        for (int i = 0; i < array_size; i++) {
            cost_minimum = Math.min(cost_minimum, C[i]);
            cost_total += (long) cost_minimum * L[i];
        }

        return cost_total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();

        for (int t = 0; t < test_cases; t++) {
            int array_size = sc.nextInt();

            int[] C = new int[array_size];
            for (int i = 0; i < array_size; i++) {
                C[i] = sc.nextInt();
            }

            int[] L = new int[array_size];
            for (int i = 0; i < array_size; i++) {
                L[i] = sc.nextInt();
            }

            System.out.println(calculateMinCost(array_size, C, L));
        }

        sc.close();
    }
}
