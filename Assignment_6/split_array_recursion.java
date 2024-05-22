import java.util.Scanner;

public class split_array_recursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t_nums = scan.nextInt();
        
        int[] array = new int[t_nums];
        for(int row = 0; row < t_nums; row++) {
            array[row] = scan.nextInt();
        }
        
        int cnt = spliting_arr(array, 0, 0, 0, "", "");
        System.out.println(cnt);
        scan.close();
    }

    public static int spliting_arr(int[] array, int V_IDX, int SUM_1, int SUM_2, String set1, String set2) {
        if(V_IDX == array.length) {
            if(SUM_1 == SUM_2) {
                System.out.println(set1 + " and " + set2);
                return 1; 
            }
            return 0;
        }
        
        int cnt = 0;
        cnt += spliting_arr(array, V_IDX + 1, SUM_1 + array[V_IDX], SUM_2, set1 + array[V_IDX] + " ", set2);
        cnt += spliting_arr(array, V_IDX + 1, SUM_1, SUM_2 + array[V_IDX], set1, set2 + array[V_IDX] + " ");
        
        return cnt;
    }
}
