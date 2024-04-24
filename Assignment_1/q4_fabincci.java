import java.util.*;

public class q4_fabincci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 0;
        int b = 1;
        int rowNum = 0;
        while (rowNum < n) {
            int count = 0;
            while (count <= rowNum) {
                System.out.print(start + "\t");
                int next = start + b;
                start = b;
                b = next;
                count++;
            }
            System.out.println();
            rowNum++;
        }
        sc.close();
    }
}
