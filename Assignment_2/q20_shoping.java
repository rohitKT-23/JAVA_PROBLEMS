import java.util.*;

public class q20_shoping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Ntest = sc.nextInt();
        for (int x = 0; x < Ntest; x++) {
            int Laayush = sc.nextInt();
            int Lharshit = sc.nextInt();
            int i, j;
            int aayushPurchase = 0;
            int s2 = 0;
            for (i = 1; aayushPurchase <= Laayush; i += 2) {
                aayushPurchase += i;
            }
            for (j = 2; s2 <= Lharshit; j += 2) {
                s2 += j;
            }
            if (i > j) {
                System.out.println("Aayush");
            } else {
                System.out.println("Harshit");
            }
        }
        sc.close();
    }
}