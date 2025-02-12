import java.util.*;

public class longest_increasing_subsequence {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int nums= scn.nextInt();
        int[] ARR= new int[nums];
        for (int num= 0; num< nums; num++) {
            ARR[num]= scn.nextInt();
        }
        System.out.println(LIS(ARR));
        scn.close();
    }
    public static int LIS(int[] ARR) {
        if (ARR.length== 0) {
            return 0;
        }
        int[] fnd_LIS= new int[ARR.length];
        Arrays.fill(fnd_LIS, 1); // Initialize all lengths to 1
        int maxLIS= 1;
        for (int num= 1; num< ARR.length; num++) {
            for (int num1= 0; num1< num; num1++) {
                if (ARR[num]> ARR[num1]) {
                    fnd_LIS[num]= Math.max(fnd_LIS[num], fnd_LIS[num1] + 1);
                }
            }
            maxLIS= Math.max(maxLIS, fnd_LIS[num]); 
        }

        return maxLIS;
    }
}
