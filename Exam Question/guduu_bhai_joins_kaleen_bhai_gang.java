import java.util.Scanner;

public class guduu_bhai_joins_kaleen_bhai_gang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String naam = sc.nextLine();
        int total_operation  = sc.nextInt();

        while (total_operation -- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            String sub = naam.substring(i - 1, j);
            StringBuilder spoiled_name = new StringBuilder(sub);

            for (int l = 0; l < k; l++) {
                char last_name = spoiled_name.charAt(spoiled_name.length() - 1);
                spoiled_name.deleteCharAt(spoiled_name.length() - 1);
                spoiled_name.insert(0, last_name);
            }

            naam = naam.substring(0, i - 1) + spoiled_name + naam.substring(j);
        }

        System.out.println(naam);
    }
}