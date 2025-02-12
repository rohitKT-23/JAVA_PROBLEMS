import java.util.Scanner;

public class perimeter_of_an_island {
    public static int calculatePerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Start with 4 for each land cell
                    perimeter += 4;

                    // Check for adjacent land cells to subtract shared edges
                    if (i > 0 && grid[i - 1][j] == 1) perimeter--; // Up
                    if (i < rows - 1 && grid[i + 1][j] == 1) perimeter--; // Down
                    if (j > 0 && grid[i][j - 1] == 1) perimeter--; // Left
                    if (j < cols - 1 && grid[i][j + 1] == 1) perimeter--; // Right
                }
            }
        }
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the grid dimensions
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Initialize the grid
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Calculate and print the perimeter
        int result = calculatePerimeter(grid);
        System.out.println(result);

        sc.close();
    }
}
