import java.util.*;
public class sqr_root {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();
        System.out.println(square_root(number));
        sc.close();
    }
    public static long square_root(long number){
        long lw = 1;
        long hig = number ;
        long result = 1;
        while( lw <= hig){
            long md = (lw + hig)/2;
            if((md * md) <= number){
                result = (int)md;
                lw = md+1;
            }
            else{
                hig = md -1;
            }
        }
        return result;
    }
}