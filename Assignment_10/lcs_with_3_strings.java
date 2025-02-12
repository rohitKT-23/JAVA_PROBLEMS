import java.util.*;

public class lcs_with_3_strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str_1 = scn.nextLine();
        String str_2 = scn.nextLine();
        String str_3 = scn.nextLine();
        System.out.println(LCS(str_1, str_2, str_3));
    }
    public static int LCS(String str_1, String str_2, String str_3) {
        int len_1 = str_1.length();
        int len_2 = str_2.length();
        int len_3 = str_3.length();
        int[][][] dp_3D = new int[len_1 + 1][len_2 + 1][len_3 + 1];
        for (int num1 = 1; num1 <= len_1; num1++) {
            for (int num2 = 1; num2 <= len_2; num2++) {
                for (int num3 = 1; num3 <= len_3; num3++) {
                    if (str_1.charAt(num1 - 1) == str_2.charAt(num2 - 1) && str_1.charAt(num1 - 1) == str_3.charAt(num3 - 1)) {
                        dp_3D[num1][num2][num3] = dp_3D[num1 - 1][num2 - 1][num3 - 1] + 1;
                    } else {
                        dp_3D[num1][num2][num3] = Math.max(dp_3D[num1 - 1][num2][num3],
                                Math.max(dp_3D[num1][num2 - 1][num3], dp_3D[num1][num2][num3 - 1]));
                    }
                }
            }
        }
        return dp_3D[len_1][len_2][len_3];
    }
}
