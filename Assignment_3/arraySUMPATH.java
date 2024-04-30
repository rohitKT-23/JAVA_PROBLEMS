import java.util.Scanner;

public class arraySUMPATH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt(); // Number of test cases

        for (int i = 0; i < test_cases; i++) {
            int n = sc.nextInt(); //input array1 element
            int m = sc.nextInt(); //input array2 element

            int array1[] = new int[n]; //input array 1
            int array2[] = new int[m]; //input array 2

            for (int j = 0; j < n; j++) {
                array1[j] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                array2[j] = sc.nextInt();
            }

            int ans = MAX(array1, array2);
            System.out.println(ans);
        }

        sc.close();
    }

    public static int MAX(int array1[], int array2[]) {
        int s1 = 0; //sum1
        int s2 = 0; //sum2
        int ans = 0; //result
        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                s1 += array1[i];
                i++;
            } else if (array1[i] > array2[j]) {
                s2 += array2[j];
                j++;
            } else {
                ans += Math.max(s2, s1);
                s1 = s2 = 0;

                while (array1[i] == array2[j] && i < array1.length && j < array2.length) {
                    ans += array1[i];
                    i++;
                    j++;
                }
            }
        }

        while (i < array1.length) {
            s1 += array1[i];
            i++;
        }
        while (j < array2.length) {
            s2 += array2[j];
            j++;
        }

        ans += Math.max(s1, s2);

        return ans;
    }
}
