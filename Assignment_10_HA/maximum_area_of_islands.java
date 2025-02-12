import java.util.Scanner;

public class maximum_area_of_islands {
    public static int largestSafeGroupArea(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Start a DFS only if it's a '1' and hasn't been visited
                if (grid[row][col] == 1 && !visited[row][col]) {
                    // Calculate the area of this safe group
                    int area = dfs(grid, visited, row, col);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private static int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary check and check if the cell is '1' and not visited
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Count the current cell
        int area = 1;

        // Explore all four possible directions
        area += dfs(grid, visited, row - 1, col); // Up
        area += dfs(grid, visited, row + 1, col); // Down
        area += dfs(grid, visited, row, col - 1); // Left
        area += dfs(grid, visited, row, col + 1); // Right

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the grid dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Read the grid map
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Calculate the largest safe group area
        int result = largestSafeGroupArea(grid);
        System.out.println(result);

        sc.close();
    }
}
