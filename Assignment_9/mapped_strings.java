import java.util.*;

public class mapped_strings {

    static char chr_to_num(int num) {
        return (char) (num + 'A' - 1);
    }

    static void str_gen(String num_as_str, int IDX, String curr_strr, List<String> ans) {
        if (IDX == num_as_str.length()) {
            ans.add(curr_strr);
            return;
        }

        int one_DGT = num_as_str.charAt(IDX) - '0';
        if (one_DGT >= 1 && one_DGT <= 9) {
            str_gen(num_as_str, IDX + 1, curr_strr + chr_to_num(one_DGT), ans);
        }

        if (IDX + 1 < num_as_str.length()) {
            int two_DGT = Integer.parseInt(num_as_str.substring(IDX, IDX + 2));
            if (two_DGT >= 10 && two_DGT <= 26) {
                str_gen(num_as_str, IDX + 2, curr_strr + chr_to_num(two_DGT), ans);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String num_as_str = scn.nextLine();
        
        List<String> ans = new ArrayList<>();

        str_gen(num_as_str, 0, "", ans);

        Collections.sort(ans);

        for (String result : ans) {
            System.out.println(result);
        }

        scn.close();
    }
}
