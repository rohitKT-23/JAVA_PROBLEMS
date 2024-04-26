import java.util.Scanner;

public class q4_nthFacbo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 0;
        int b = 1;
        int n_term = 0;
        if (num == 0) {
            n_term = start;
        } 
        else if (num == 1) {
            n_term = b;
        } 
        else {
            for (int i = 2; i <= num; i++) {
                n_term = start + b;
                start = b;
                b = n_term;
            }
        }
        System.out.println(n_term);

        sc.close();
    }
}
