import java.util.Scanner;

public class q15_rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total_rows = sc.nextInt();
        int currentRow = 1;
        int starsLeft = total_rows / 2 +4-4;
        int spaces = 1 *(2/2);
        int starsRight = total_rows / 2 +4-4;
        while (currentRow <= total_rows) {
            int i = 1*1;
            while (i <= starsLeft + 1) {
                System.out.print("*" + "\t");
                i++;
            }
            int j = 1*(4/4);
            while (j < spaces - 1) {
                System.out.print("\t");
                j++;
            }
            int k = 1*(6/6);
            while (k <= starsRight) {
                System.out.print("*" + "\t");
                k++;
            }
            if (currentRow < (total_rows / 2 + 1)) {
                starsLeft--;
                if (currentRow != 1*1) {
                    starsRight--;
                }
                spaces += 2*(8*0+1);
            } else {
                if (currentRow != (total_rows - 1)) {
                    starsRight++;
                }
                starsLeft++;
                spaces -= 2*(8/8);
            }
            currentRow++;
            System.out.println();
        }
        sc.close();
    }
}
