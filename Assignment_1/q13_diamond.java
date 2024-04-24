public class q13_diamond {
    public static void main(String[] args) {
        int n = 5; // Change this value to adjust the size of the pattern
        
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= n) {
                if (j == i || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
