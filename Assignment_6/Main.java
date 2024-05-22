import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        int disconnectedEdges = countDisconnectedEdges(adjList);
        System.out.println(disconnectedEdges);
        sc.close();
    }
    
    public static int countDisconnectedEdges(List<List<Integer>> adjList) {
        int n = adjList.size();
        boolean[] visited = new boolean[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(adjList, visited, i);
            }
        }
        
        return count - 1;
    }
    
    public static void dfs(List<List<Integer>> adjList, boolean[] visited, int u) {
        visited[u] = true;
        for (int v : adjList.get(u)) {
            if (!visited[v]) {
                dfs(adjList, visited, v);
            }
        }
    }
}
