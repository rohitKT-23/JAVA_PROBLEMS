import java.util.*;

public class string_sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t_str = scn.nextInt();
        scn.nextLine();  

        List<String> strgss = new ArrayList<>();

        for (int s = 0; s < t_str; s++) {
            strgss.add(scn.nextLine());
        }

        Collections.sort(strgss, new Comparator<String>() {
            @Override
            public int compare(String str_1, String str_2) {
                if (str_1.startsWith(str_2)) {
                    return str_2.length() - str_1.length();
                }
                if (str_2.startsWith(str_1)) {
                    return str_2.length() - str_1.length();
                }
                return str_1.compareTo(str_2);
            }
        });

        for (String s : strgss) {
            System.out.println(s);
        }

        scn.close();
    }
}
