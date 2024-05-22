import java.util.*;

public class mazepath {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t_rows = scan.nextInt();
        int t_cols = scan.nextInt();

        int t_paths = cnt_paths(t_rows, t_cols);

        System.out.println();
        print_paths(t_rows, t_cols, "");
        System.out.println("\n"+t_paths);

        scan.close();
    }

    public static int cnt_paths(int t_rows, int t_cols) {
        if (t_rows == 1 || t_cols == 1) {
            return 1;
        }

        return cnt_paths(t_rows - 1, t_cols) + cnt_paths(t_rows, t_cols - 1);
    }

    public static void all_paths(int t_rows, int t_cols, String path, ArrayList<String> paths) {
        if (t_rows == 1 && t_cols == 1) {
            paths.add(path);
            return;
        }

        if (t_rows > 1) {
            all_paths(t_rows - 1, t_cols, path + "V", paths);
        }

        if (t_cols > 1) {
            all_paths(t_rows, t_cols - 1, path + "H", paths);
        }
    }

    public static void print_paths(int t_rows, int t_cols, String path) {
        if (t_rows == 1 && t_cols == 1) {
            System.out.print(path + " ");
            return;
        }

        if (t_rows > 1) {
            print_paths(t_rows - 1, t_cols, path + "V");
        }

        if (t_cols > 1) {
            print_paths(t_rows, t_cols - 1, path + "H");
        }
    }
}
