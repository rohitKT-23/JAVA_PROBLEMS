import java.util.*;

public class q1_prime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = 2;
    while(i <= num/2){
        if(num % i == 0){
            System.out.println("Not Prime");
            break;
        }
        else{
            System.out.println("Prime");
            break;
        }
    }
    sc.close();
    }
}
