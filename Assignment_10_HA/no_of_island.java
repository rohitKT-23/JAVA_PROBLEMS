import java.util.Scanner;

public class no_of_island {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // If we find an unvisited '1', it means we found an island
                if (grid[row][col] == '1' && !visited[row][col]) {
                    // Perform DFS to mark all cells of this island
                    dfs(grid, visited, row, col);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    private static void dfs(char[][] grid, boolean[][] visited, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary and visited check
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0' || visited[row][col]) {
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Check all four adjacent cells
        dfs(grid, visited, row - 1, col); // Up
        dfs(grid, visited, row + 1, col); // Down
        dfs(grid, visited, row, col - 1); // Left
        dfs(grid, visited, row, col + 1); // Right
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the grid dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Read the grid map
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        // Calculate the number of islands
        int result = numIslands(grid);
        System.out.println(result);

        sc.close();
    }
}
