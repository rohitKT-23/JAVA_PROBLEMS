import java.util.*;

public class cool_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int total_tickets = sc.nextInt();
        int[] tickets = new int[total_tickets];
        for (int i = 0; i < total_tickets; i++) {
            tickets[i] = sc.nextInt();
        }

        // Sort
        Arrays.sort(tickets);

        int total_cool_triplets = 0;

        // all possible triplets
        for (int i = 0; i < total_tickets - 2; i++) {
            for (int j = i + 1; j < total_tickets - 1; j++) {
                for (int k = j + 1; k < total_tickets; k++) {
                    // Check for triplets
                    if (tickets[i] + tickets[j] > tickets[k]) {
                        total_cool_triplets++;
                    } else {
                        break;
                    }
                }
            }
        }

        // Output
        System.out.println(total_cool_triplets);

        sc.close();
    }
}
