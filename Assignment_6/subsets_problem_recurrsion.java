import java.util.*;
public class subsets_problem_recurrsion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        int[] array = new int[nums];
        for(int row=0; row<nums; row++){
            array[row] = scan.nextInt();
        }
        int target_val = scan.nextInt();
        List<Integer> answer = new ArrayList<>();
        t_substes(array, 0, target_val, answer);
        System.out.println();
        System.out.println(cnt);
        scan.close();
    }
    static int cnt = 0;
    public static void t_substes(int[] arr, int IDX, int target_val, List<Integer> answer){
        if(target_val == 0){
            for(int row : answer){
                System.out.print(row + " ");
            }
            System.out.print(" ");
            cnt++;
            return;
        }
        for(int row =IDX; row<arr.length; row++){
            answer.add(arr[row]);
            t_substes(arr, row+1, target_val-arr[row], answer);
            answer.remove(answer.size()-1);
        }
    }
}
