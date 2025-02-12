import java.util.*;

public class Exit_Or_Not {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_cases = scn.nextInt(); 
        
        while (t_cases-- > 0) {
            int arr_len = scn.nextInt();
            int[] arr = new int[arr_len];
            
            for (int num = 0; num < arr_len; num++) {
                arr[num] = scn.nextInt();
            }
            
            HashSet<Integer> SET = new HashSet<>();
            for (int num : arr) {
                SET.add(num);
            }
            
            int qry = scn.nextInt();
            for (int num = 0; num < qry; num++) {
                int t_searches = scn.nextInt(); 
                if (SET.contains(t_searches)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        
        scn.close();
    }
}
