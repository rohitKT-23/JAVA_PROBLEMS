import java.util.Scanner;

public class nth_fabonacci {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(fibonacci(num));
   }

   public static int fibonacci(int num) {
       if (num <= 1) {
           return num;
       }
       int a = 0;
       int b = 1;
       for (int i = 2; i <= num; i++) {
           int c = a + b;
           a = b;
           b = c;
       }
       return b;
   }
}