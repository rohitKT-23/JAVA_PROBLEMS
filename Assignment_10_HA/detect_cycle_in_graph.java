import java.util.ArrayList;
import java.util.Scanner;

public class detect_cycle_in_graph {
    private ArrayList<ArrayList<Integer>> adjList;
    private boolean[] visited;

    public detect_cycle_in_graph(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i <= vertices; i++) {  // Use 1-based indexing
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[vertices + 1];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public boolean hasCycle() {
        for (int i = 1; i < adjList.size(); i++) {
            if (!visited[i]) {
                if (dfs(i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int current, int parent) {
        visited[current] = true;

        for (int neighbor : adjList.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, current)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // Found a back edge to a previously visited node that is not the parent
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Number of vertices
            int M = sc.nextInt(); // Number of edges

            detect_cycle_in_graph graph = new detect_cycle_in_graph(N);

            // Read edges
            for (int i = 0; i < M; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph.addEdge(u, v);
            }

            // Check if the graph has a cycle and print result
            if (graph.hasCycle()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}
