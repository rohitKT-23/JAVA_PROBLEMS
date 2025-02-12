import java.util.*;

public class from_biggest_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();

        while (array_size-- > 0) {
            int numbers = sc.nextInt();
            int[] array = new int[numbers];

            for (int i = 0; i < numbers; i++) {
                array[i] = sc.nextInt();
            }

            biggest_one(array);
        }

        sc.close();
    }

    private static void biggest_one(int[] array) {
        Integer[] arrInteger = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // sorting based on concatenated values
        Arrays.sort(arrInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String ab = String.valueOf(a) + String.valueOf(b);
                String ba = String.valueOf(b) + String.valueOf(a);
                return ba.compareTo(ab);
            }
        });

        // Concatenate sorted array -> max
        StringBuilder result = new StringBuilder();
        for (Integer num : arrInteger) {
            result.append(num);
        }

        System.out.println(result);
    }
}
