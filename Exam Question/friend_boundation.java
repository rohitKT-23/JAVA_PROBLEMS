import java.util.Scanner;

public class friend_boundation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //total_person
        int n = sc.nextInt();

        int[] ages = new int[n];
        // ages
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int friend_req_total = total_request(ages);
        System.out.println(friend_req_total);

        sc.close();
    }
    
    public static int total_request(int[] ages) {
        int cnt = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i != j && is_valid(ages[i], ages[j])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static boolean is_valid(int ageX, int ageY) {
        return !(ageY <= 0.5 * ageX + 7 || ageY > ageX || (ageY > 100 && ageX < 100));
    }

}
