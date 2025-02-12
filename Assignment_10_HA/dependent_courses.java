import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dependent_courses {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build the graph and fill in-degrees
        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int prerequisite = prereq[1];
            adjList.get(prerequisite).add(course);
            inDegree[course]++;
        }

        // Queue for courses with no prerequisites (in-degree of 0)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int visitedCourses = 0;

        // Process courses in topological order
        while (!queue.isEmpty()) {
            int course = queue.poll();
            visitedCourses++;

            for (int neighbor : adjList.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // If we were able to visit all courses, no cycle exists
        return visitedCourses == numCourses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of courses and number of prerequisite pairs
        int numCourses = sc.nextInt();
        int m = sc.nextInt();

        // Read prerequisite pairs
        int[][] prerequisites = new int[m][2];
        for (int i = 0; i < m; i++) {
            prerequisites[i][0] = sc.nextInt();
            prerequisites[i][1] = sc.nextInt();
        }

        // Check if it's possible to finish all courses and print the result
        if (canFinish(numCourses, prerequisites)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
