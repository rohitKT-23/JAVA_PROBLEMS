import java.util.Scanner;

public class emilys_birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_number_candies = sc.nextInt();

        int[] candies_count = new int[total_number_candies + 1];
        for (int i = 0; i < total_number_candies; i++) {
            int candy = sc.nextInt();
            candies_count[candy]++;
        }

        int candy_from_bf = 0;
        for (int i = 1; i <= total_number_candies; i++) {
            if (candies_count[i] > 1) {
                candy_from_bf = i;
                break;
            }
        }

        System.out.println(candy_from_bf);

        sc.close();
    }
}
