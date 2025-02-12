import java.util.*;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t_cases= scan.nextInt();
        while (t_cases-- > 0) {
            int arr_size= scan.nextInt();
            int[] t_houses= new int[arr_size];
            for (int num= 0; num< arr_size; num++) {
                t_houses[num]= scan.nextInt();
            }

            System.out.println(max_mny(t_houses));
        }
    }

    public static int max_mny(int[] t_houses) {
        int arr_size= t_houses.length;
        if (arr_size== 0) return 0; 
        if (arr_size== 1) return t_houses[0]; 
        int prev_2= 0;
        int prev_1= 0; 
        for (int house: t_houses) {
            int curr= Math.max(prev_1, prev_2 + house);
            prev_2= prev_1;
            prev_1= curr;
        }
        return prev_1; 
    }
}
