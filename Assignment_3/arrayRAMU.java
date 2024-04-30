import java.util.Scanner;

public class arrayRAMU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt(); // Number of test cases

        while (ticket-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int CABS = sc.nextInt();
            int RICKSHAWS = sc.nextInt();

            int[] rickshaws = new int[CABS];
            int[] cabs = new int[RICKSHAWS];

            for (int i = 0; i < CABS; i++) {
                rickshaws[i] = sc.nextInt();
            }

            for (int i = 0; i < RICKSHAWS; i++) {
                cabs[i] = sc.nextInt();
            }

            //rides for rickshaws and cabs
            int totalRickshawCost = 0;
            for (int i = 0; i < CABS; i++) {
                totalRickshawCost += Math.min(c1 * rickshaws[i], c2);
            }

            int totalCabCost = 0;
            for (int i = 0; i < RICKSHAWS; i++) {
                totalCabCost += Math.min(c1 * cabs[i], c2);
            }

            //minimum cost for unlimited ride 
            totalRickshawCost = Math.min(totalRickshawCost, c3);
            totalCabCost = Math.min(totalCabCost, c3);

            //final minimum cost
            int minCost = Math.min(totalRickshawCost + totalCabCost, c4);

            System.out.println(minCost);
        }
        sc.close();
    }
}
