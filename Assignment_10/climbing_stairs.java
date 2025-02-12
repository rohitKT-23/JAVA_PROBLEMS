import java.util.*;

public class climbing_stairs {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t_nums= scan.nextInt();
        System.out.println(t_ways(t_nums));
    }
    public static int t_ways(int t_nums) {
        if (t_nums== 1) {
            return 1; 
        }
        if (t_nums== 2) {
            return 2; 
        }
        int[] ways_to_climb= new int[t_nums + 1];
        ways_to_climb[1]= 1; 
        ways_to_climb[2]= 2; 
        for (int num= 3; num<= t_nums; num++) {
            ways_to_climb[num]= ways_to_climb[num - 1]+ ways_to_climb[num - 2];
        }
        return ways_to_climb[t_nums];
    }
}
