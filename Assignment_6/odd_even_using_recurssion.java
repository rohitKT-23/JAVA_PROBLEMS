import java.util.*;
public class odd_even_using_recurssion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd_even(n);
    }
    public static void odd_even(int n) {
        if(n == 0) {
            return;
        }
        if(n % 2 != 0) {
            System.out.println(n);
        }
        odd_even(n - 1);
        if(n % 2 == 0) {
            System.out.println(n);
        }
    }
}