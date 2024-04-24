import java.util.Scanner;

public class q12_arrow {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int n = row;
        int start = 1;

        int nst = 1;
        int nspace1 = n - 1;
        int nspace2 = -1;
        int val1 = start;
        int val2 = 1;

        while (start <= n) {

            int cspace1 = 1;
            while (cspace1 <= nspace1) {
                System.out.print("\t");
                cspace1 = cspace1 + 1;
            }

            int cst1 = 1;
            while (cst1 <= nst) {
                System.out.print(val1 + "\t");
                val1 = val1 - 1;
                cst1 = cst1 + 1;
            }

            int cspace2 = 1;
            while (cspace2 <= nspace2) {
                System.out.print("\t");
                cspace2 = cspace2 + 1;
            }

            if (start != 1 && start != n) {
                int cst2 = 1;
                while (cst2 <= nst) {
                    System.out.print(val2 + "\t");
                    val2 = val2 + 1;
                    cst2 = cst2 + 1;
                }
            }
            System.out.println();

            if (start <= n / 2) {
                nst = nst + 1;
                nspace1 = nspace1 - 2;
                nspace2 = nspace2 + 2;
                val1 = start + 1;
                val2 = 1;
            } else {
                nst = nst - 1;
                nspace1 = nspace1 + 2;
                nspace2 = nspace2 - 2;
                val1 = n - start;
                val2 = 1;
            }
            start = start + 1;
        }
        sc.close();
    }
}
