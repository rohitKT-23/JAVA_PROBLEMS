import java.util.Scanner;

public class q16_inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int nspace = 2 * digit - 1;

        int nrow = 2 * digit + 1;
        int num = digit;
        int a = 0;
        int i = 1;

        while (i <= nrow) {
            if (i > digit + 1)
                a = nrow - i + 1;
            else
                a = i;

            int cstart = 1;
            while (cstart <= a) {
                System.out.print(num + "\t");  // Added space after num
                num--;
                cstart++;
            }

            int cspace = 1;
            while (cspace <= nspace) {
                System.out.print("\t");
                cspace++;
            }

            cstart = 1;
            while (cstart <= a) {
                num++;
                if (num != 0)
                    System.out.print(num + "\t");  // Added space after num
                
                cstart++;
            }

            if (i <= (nrow) / 2)
                nspace -= 2;
            else
                nspace += 2;

            System.out.println();
            i++;
        }
        sc.close();
    }
}
