import java.util.Scanner;

public class length_of_lcs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str_1 = scn.nextLine();
        String str_2 = scn.nextLine();
        int len_str_1 = str_1.length();
        int len_str_2 = str_2.length();
        int[][] len_LCS = new int[len_str_1 + 1][len_str_2 + 1];
        for (int str1 = 1; str1 <= len_str_1; str1++) {
            for (int str2 = 1; str2 <= len_str_2; str2++) {
                if (str_1.charAt(str1 - 1) == str_2.charAt(str2 - 1)) {
                    len_LCS[str1][str2] = len_LCS[str1 - 1][str2 - 1] + 1;
                } else {
                    len_LCS[str1][str2] = Math.max(len_LCS[str1 - 1][str2], len_LCS[str1][str2 - 1]);
                }
            }
        }
        System.out.println(len_LCS[len_str_1][len_str_2]);
        scn.close();
    }
}
