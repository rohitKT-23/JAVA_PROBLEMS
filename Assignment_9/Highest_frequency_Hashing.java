import java.util.*;

public class Highest_frequency_Hashing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr_size = scn.nextInt();

        Map<Long, Integer> freq_map = new HashMap<>();

        for (int n = 0; n < arr_size; n++) {
            long num = scn.nextLong();
            freq_map.put(num, freq_map.getOrDefault(num, 0) + 1);
        }

        long max_freq_num = 0;
        int max_freq = 0;

        for (Map.Entry<Long, Integer> entry : freq_map.entrySet()) {
            if (entry.getValue() > max_freq) {
                max_freq = entry.getValue();
                max_freq_num = entry.getKey();
            }
        }

        System.out.println(max_freq_num);
    }
}
