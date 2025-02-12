
import java.util.*;

public class Subarrays_with_distinct_elements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_lennn = scn.nextInt();
        int[] arr_size = new int[t_lennn];
        for(int num=0; num<t_lennn; num++){
            arr_size[num] = scn.nextInt();
        }

        int lft = 0;
        int rht = 0;
        int ginoo = 0;
        HashMap<Integer, Integer> hash_maping = new HashMap<>();
        while(rht < t_lennn){
            int ITM = arr_size[rht];
            hash_maping.put(ITM, hash_maping.getOrDefault(ITM, 0)+1);
            while(hash_maping.get(ITM) >= 2){
                int left = arr_size[lft];
                hash_maping.put(left, hash_maping.get(left) - 1);
                lft++;
            }
            ginoo += sum(rht-lft+1);
            rht++;
        }
        System.out.println(ginoo);
    }
    public static int sum(int numberr){
        return numberr * (numberr+1)/2;
    }
}
