import java.util.*;

public class beautifull_vertices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of vertices and edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read the edges
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        boolean[] visited = new boolean[n + 1];
        int beautifulCount = 0;

        // Traverse each connected component
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                beautifulCount += bfsCountBeautifulVertices(graph, visited, i);
            }
        }

        System.out.println(beautifulCount);
        sc.close();
    }

    private static int bfsCountBeautifulVertices(List<List<Integer>> graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parentMap = new HashMap<>();
        Map<Integer, Integer> childrenCount = new HashMap<>();

        // Start BFS from the master parent (smallest node in the component)
        int masterParent = start;
        queue.add(start);
        visited[start] = true;
        parentMap.put(start, -1);  // Master parent has no parent

        // Perform BFS to explore the component and track parent-child relationships
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node < masterParent) masterParent = node; // Update master parent if smaller node found
            
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parentMap.put(neighbor, node);  // Set the current node as parent of the neighbor
                }
            }
        }

        // Count children for each node
        for (int node : parentMap.keySet()) {
            int parent = parentMap.get(node);
            if (parent != -1) {  // If the node has a parent
                childrenCount.put(parent, childrenCount.getOrDefault(parent, 0) + 1);
            }
        }

        // Count beautiful vertices
        int beautifulVertices = 0;
        for (int node : parentMap.keySet()) {
            int parent = parentMap.get(node);
            if (parent != -1 && childrenCount.getOrDefault(node, 0) > childrenCount.getOrDefault(parent, 0)) {
                beautifulVertices++;
            }
        }

        return beautifulVertices;
    }
}
