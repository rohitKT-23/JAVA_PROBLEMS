import java.util.*;
public class vikki_loves_array_game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_testcase = scan.nextInt();
        for(int row=0; row<t_testcase; row++){
            int len_ght = scan.nextInt();
            int[] str_array = new int[len_ght]; 
            int h = 0;
            while(h < len_ght){
                str_array[h] = scan.nextInt();
                h++;
            }
            int answer = ARRAY_GAME(str_array, 0, len_ght-1);
            System.out.println(answer);
        }
        scan.close();
    }
    public static int ARRAY_GAME(int[] arr, int start, int end){
        if(end-start < 1){
            return 0;
        }
        int SUM_1 = 0;
        int SUM_2 = 0;
        for(int row=start; row<=end; row++){
            SUM_1 += arr[row];
        }
        int h = start;
        while(h <= end){
            SUM_2 += arr[h];
            SUM_1 -= arr[h];
            if(SUM_1 == SUM_2){
                break;
            }
            h++;
        }
        if(SUM_1 == SUM_2){
            return 1 + Math.max(ARRAY_GAME(arr, start, h), ARRAY_GAME(arr, h + 1, end));
        }
        return 0;
    }
}