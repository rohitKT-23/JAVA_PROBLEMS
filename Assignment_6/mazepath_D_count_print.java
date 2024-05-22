import java.util.Scanner;

public class mazepath_D_count_print {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int total_rows = scan.nextInt();
        int total_cols = scan.nextInt();
        
        int t_paths = cnt_path(total_rows, total_cols);
        System.out.println(t_paths);
        
        possible_paths(total_rows, total_cols, "");
        scan.close();  
    }

    public static int cnt_path(int total_rows, int total_cols) {
        if (total_rows == 1 || total_cols == 1) {
            return 1;
        }
        
        return cnt_path(total_rows - 1, total_cols) + cnt_path(total_rows, total_cols - 1) + cnt_path(total_rows - 1, total_cols - 1);
    }

    public static void possible_paths(int total_rows, int total_cols, String path) {
        if (total_rows == 1 && total_cols == 1) {
            System.out.print(path + " ");
            return;
        }

        if (total_rows > 1) {
            possible_paths(total_rows - 1, total_cols, path + "V");
        }

        if (total_cols > 1) {
            possible_paths(total_rows, total_cols - 1, path + "H");
        }

        if (total_rows > 1 && total_cols > 1) {
            possible_paths(total_rows - 1, total_cols - 1, path + "D");
        }
    }
}
