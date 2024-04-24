import java.util.Scanner;

public class q3_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_num = sc.nextInt();
        int num = 1;
        int spaces = total_num - 1;
        while (num <= total_num) {
            int count = 1;
            while (count <= spaces) {
                System.out.print("\t");
                count++;
            }
            int cNum = num;
            count = 1;
            while (count <= num) {
                System.out.print(cNum + "\t");
                cNum++;
                count++;
            }
            cNum -= 2;
            count = 1;
            while (count < num) {
                System.out.print(cNum + "\t");
                cNum--;
                count++;
            }
            System.out.println();
            spaces--;
            num++;
        }
        sc.close();
    }
}
