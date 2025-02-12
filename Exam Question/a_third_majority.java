import java.util.*;

public class a_third_majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < array_size; i++) {
            cnt.put(array[i], cnt.getOrDefault(array[i], 0) + 1);
        }

        List<Integer> representatives = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            if (entry.getValue() > array_size / 3) {
                representatives.add(entry.getKey());
            }
        }

        Collections.sort(representatives);
        for (int i : representatives) {
            System.out.println(i);
        }
    }
}