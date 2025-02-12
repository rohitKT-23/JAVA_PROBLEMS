import java.util.*;

public class bfs_shortest_path {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();  // Number of queries

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();  // Number of nodes
            int m = sc.nextInt();  // Number of edges

            List<List<Integer>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            // Reading the edges and constructing the graph
            for (int j = 0; j < m; j++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            int s = sc.nextInt();  // Starting node for BFS

            // Calculate shortest distances using BFS
            int[] distances = bfsShortestPath(graph, s, n);

            // Print the results excluding the starting node `s`
            for (int j = 1; j <= n; j++) {
                if (j != s) {
                    System.out.print(distances[j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    private static int[] bfsShortestPath(List<List<Integer>> graph, int start, int n) {
        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1);  // Initialize all distances to -1
        distances[start] = 0;  // Distance to the start node is 0

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        // BFS to calculate shortest paths
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph.get(current)) {
                if (distances[neighbor] == -1) {  // If the neighbor hasn't been visited
                    distances[neighbor] = distances[current] + 6;
                    queue.add(neighbor);
                }
            }
        }

        return distances;
    }
}
