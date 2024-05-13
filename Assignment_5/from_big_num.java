import java.util.*;

public class from_big_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input testcase
        int total_testcase = sc.nextInt();

        for (int testCase = 0; testCase < total_testcase; testCase++) {
            // Input array size
            int n = sc.nextInt();

            // Input array element
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }

            // Sort 
            Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

            // Concatenate
            StringBuilder result = new StringBuilder();
            for (String num : arr) {
                result.append(num);
            }

            // Output
            System.out.println(result.toString());
        }
    }
}
