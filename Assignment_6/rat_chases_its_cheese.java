import java.util.Scanner;

public class rat_chases_its_cheese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_rows = scan.nextInt();
        int t_cols = scan.nextInt();
        char[][] maze = new char[t_rows][t_cols];
        for (int i = 0; i < t_rows; i++) {
            String row = scan.next();
            maze[i] = row.toCharArray();
        }
        scan.close();
        int[][] path = new int[t_rows][t_cols];
        if (possible_paths(maze, path, 0, 0)) {
            prt_paths(path);
        } else {
            System.out.println("NO PATH FOUND");
        }
    }

    public static boolean possible_paths(char[][] maze, int[][] path, int row, int col) {
        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 'X' || path[row][col] == 1) {
            return false;
        }
        path[row][col] = 1;

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return true;
        }

        if (possible_paths(maze, path, row - 1, col) || possible_paths(maze, path, row + 1, col)
                || possible_paths(maze, path, row, col - 1) || possible_paths(maze, path, row, col + 1)) {
            return true;
        }

        path[row][col] = 0; // Backtracking
        return false;
    }

    public static void prt_paths(int[][] path) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
