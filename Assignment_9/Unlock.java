import java.util.*;

public class Unlock {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> postn_map = new HashMap<>();
        for (int num = 0; num < n; num++) {
            arr[num] = scn.nextInt();
            postn_map.put(arr[num], num); 
        }

        for (int num = 0; num < n && k > 0; num++) {
            int exptd_val = n - num; 

            if (arr[num] == exptd_val) {
                continue;
            }

            int max_val_IDX = postn_map.get(exptd_val);

            postn_map.put(arr[num], max_val_IDX);
            postn_map.put(exptd_val, num);

            int tmp = arr[num];
            arr[num] = arr[max_val_IDX];
            arr[max_val_IDX] = tmp;

            k--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
