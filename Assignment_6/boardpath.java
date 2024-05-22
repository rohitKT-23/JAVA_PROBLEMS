import java.util.Scanner;

public class boardpath {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int brd_size = scan.nextInt();
        int di_face = scan.nextInt();

        int t_paths = cnt_paths(brd_size, di_face);
        System.out.println(t_paths);

        possible_paths(brd_size, di_face, "");
        scan.close();
    }

    public static int cnt_paths(int brd_size, int di_face) {
        return total_paths(brd_size, di_face, 0);
    }

    private static int total_paths(int brd_size, int di_face, int currentPosition) {
        if (currentPosition == brd_size) {
            return 1;
        }

        if (currentPosition > brd_size) {
            return 0;
        }

        int cnt = 0;

        for (int face = 1; face <= di_face; face++) {
            cnt += total_paths(brd_size, di_face, currentPosition + face);
        }

        return cnt;
    }

    public static void possible_paths(int brd_size, int di_face, String path) {
        total_paths(brd_size, di_face, 0, path);
    }

    private static void total_paths(int brd_size, int di_face, int currentPosition, String path) {
        if (currentPosition == brd_size) {
            System.out.print(path + " ");
            return;
        }

        if (currentPosition > brd_size) {
            return;
        }

        for (int face = 1; face <= di_face; face++) {
            total_paths(brd_size, di_face, currentPosition + face, path + face);
        }
    }
}
