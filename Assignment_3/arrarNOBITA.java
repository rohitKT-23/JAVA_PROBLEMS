import java.util.Scanner;

public class arrarNOBITA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt(); 

        while (testcase-- > 0) {
            long totalCANDI = scanner.nextLong(); 
            long friend = scanner.nextLong(); 

            long CANDIES = totalCANDI / friend; 
            long REMAIN = totalCANDI % friend; 

            long RETURED = Math.min(REMAIN, friend - REMAIN);

            System.out.println(RETURED);
        }
        scanner.close();
    }
}
