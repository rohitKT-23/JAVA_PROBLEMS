import java.util.Scanner;

public class arrayWATERMELON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt(); 

        if (weight >= 4 && weight % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
