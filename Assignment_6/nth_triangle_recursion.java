import java.util.Scanner;
/**
 * nth_triangle_recursion
 */
public class nth_triangle_recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nth_triangle(n));
    }
    public static int nth_triangle(int n) {
        if(n == 1) {
            return 1;
        }
        return n + nth_triangle(n - 1);
    }
}