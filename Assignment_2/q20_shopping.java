import java.util.*;

public class q20_shopping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Ntest = sc.nextInt();
        for (int x = 0; x < Ntest; x++) {
            int Laayush = sc.nextInt();
            int Lharshit = sc.nextInt();
            int i = 1;
            int j = 2;
            int aayushPurchase = 0;
            int s2 = 0;

            while (aayushPurchase <= Laayush) {
                aayushPurchase += i;
                i += 2;
            }

            while (s2 <= Lharshit) {
                s2 += j;
                j += 2;
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
