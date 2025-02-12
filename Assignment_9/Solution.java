import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        insert(root, v, 1, d);
        return root;
    }

    private void insert(TreeNode node, int v, int currentDepth, int depth) {
        if (node == null) return;
        if (currentDepth == depth - 1) {
            TreeNode tempLeft = node.left;
            TreeNode tempRight = node.right;
            node.left = new TreeNode(v);
            node.right = new TreeNode(v);
            node.left.left = tempLeft;
            node.right.right = tempRight;
        } else {
            insert(node.left, v, currentDepth + 1, depth);
            insert(node.right, v, currentDepth + 1, depth);
        }
    }

    // Method to print the tree for visualization
    public void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println((root.left != null ? root.left.val + " <- " : " <- ") + root.val + (root.right != null ? " -> " + root.right.val : " -> "));
        printTree(root.left);
        printTree(root.right);
    }
    public static TreeNode buildTree(Scanner scanner) {
        if (!scanner.hasNext()) return null;
        
        int val = scanner.nextInt();
        TreeNode node = new TreeNode(val);
        
        if (scanner.nextBoolean()) {
            node.left = buildTree(scanner);
        }
        if (scanner.nextBoolean()) {
            node.right = buildTree(scanner);
        }
        
        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // Read the tree structure
        TreeNode root = buildTree(scanner);

        // Read v and d
        int v = scanner.nextInt();
        int d = scanner.nextInt();

        // Add the new row and print the tree
        root = solution.addOneRow(root, v, d);
        solution.printTree(root);
    }
}
