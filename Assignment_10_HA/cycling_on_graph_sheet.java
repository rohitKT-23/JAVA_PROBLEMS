import java.util.ArrayList;
import java.util.Scanner;

public class cycling_on_graph_sheet {
    private ArrayList<ArrayList<Integer>> adjList;
    private boolean[] visited;

    public cycling_on_graph_sheet(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[vertices];
    }

    // Add an edge to the undirected graph
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Function to detect cycle in the graph
    public boolean hasCycle() {
        for (int i = 0; i < adjList.size(); i++) {
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
                // A visited neighbor not equal to parent indicates a cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of vertices and edges
        int V = sc.nextInt();
        int E = sc.nextInt();

        cycling_on_graph_sheet graph = new cycling_on_graph_sheet(V);

        // Read edges
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        // Check for cycle and print result
        if (graph.hasCycle()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
