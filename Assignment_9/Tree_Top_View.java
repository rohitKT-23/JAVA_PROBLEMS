import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;
    
    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree_Top_View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        // Build the binary tree from level order input
        TreeNode root = buildTree(input);

        // Get the top view of the binary tree
        List<Integer> topView = getTopView(root);

        // Print the top view
        for (int val : topView) {
            System.out.print(val + " ");
        }
    }

    // Method to build the binary tree from level order input
    private static TreeNode buildTree(String[] input) {
        if (input.length == 0 || input[0].equals("-1")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < input.length) {
            TreeNode currentNode = queue.poll();

            // Add the left child
            if (!input[i].equals("-1")) {
                currentNode.left = new TreeNode(Integer.parseInt(input[i]));
                queue.add(currentNode.left);
            }
            i++;

            // Add the right child
            if (i < input.length && !input[i].equals("-1")) {
                currentNode.right = new TreeNode(Integer.parseInt(input[i]));
                queue.add(currentNode.right);
            }
            i++;
        }

        return root;
    }

    // Method to get the top view of the binary tree
    private static List<Integer> getTopView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Map to store the topmost node for each horizontal distance
        Map<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            TreeNode currentNode = pair.node;
            int horizontalDistance = pair.horizontalDistance;

            // If this horizontal distance is not already present in the map, add it
            if (!topViewMap.containsKey(horizontalDistance)) {
                topViewMap.put(horizontalDistance, currentNode.data);
            }

            // Add the left child to the queue
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, horizontalDistance - 1));
            }

            // Add the right child to the queue
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, horizontalDistance + 1));
            }
        }

        // Extract the values from the map in order of horizontal distances
        result.addAll(topViewMap.values());
        return result;
    }

    // Helper class to store the node and its horizontal distance from the root
    static class Pair {
        TreeNode node;
        int horizontalDistance;
        
        public Pair(TreeNode node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
}
