import java.util.*;

public class board_path_count_print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int board_size = scan.nextInt();
        int dice_face = scan.nextInt();
        vld_path(board_size, dice_face, "");
        System.out.println();
        int ginoo = cnt_t_ways(board_size, dice_face);
        System.out.println(ginoo);
    }
    public static int cnt_t_ways(int board_size, int dice_face) {
        if (board_size == 0) {
            return 1;
        }
        if (board_size < 0) {
            return 0;
        }
        int ginoo = 0;
        for (int dice = 1; dice <= dice_face; dice++) {
            ginoo += cnt_t_ways(board_size - dice, dice_face);
        }
        return ginoo;
    }
    public static void vld_path(int board_size, int dice_face, String path) {
        if (board_size == 0) {
            System.out.print(path + " ");
            return;
        }
        if (board_size < 0) {
            return; 
        }
        for (int dice = 1; dice <= dice_face; dice++) {
            vld_path(board_size - dice, dice_face, path + dice);
        }
    }
}
