import java.util.*;

public class Arrays_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr_size = scn.nextInt();

        int[] arr_1 = new int[arr_size];
        for (int num = 0; num < arr_size; num++) {
            arr_1[num] = scn.nextInt();
        }

        int[] arr_2 = new int[arr_size];
        for (int num = 0; num < arr_size; num++) {
            arr_2[num] = scn.nextInt();
        }

        List<Integer> intersctn = t_intersctn(arr_1, arr_2);

        System.out.println(intersctn);
    }

    private static List<Integer> t_intersctn(int[] arr_1, int[] arr_2) {
        Map<Integer, Integer> freq_map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : arr_1) {
            freq_map.put(num, freq_map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr_2) {
            if (freq_map.getOrDefault(num, 0) > 0) {
                ans.add(num);
                freq_map.put(num, freq_map.get(num) - 1);
            }
        }

        Collections.sort(ans);

        return ans;
    }
}
