import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    private TreeNode root;

    // Insert a node in the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Public function to find nodes at distance k from target
    public List<Integer> nodesAtDistanceK(int target, int k) {
        List<Integer> result = new ArrayList<>();
        findNodesAtDistanceK(root, target, k, result);
        return result;
    }

    // Helper function to locate the target node and find nodes at distance k
    private int findNodesAtDistanceK(TreeNode node, int target, int k, List<Integer> result) {
        if (node == null) return -1;

        if (node.data == target) {
            addSubtreeNodesAtDistanceK(node, k, result);
            return 0;
        }

        int leftDistance = findNodesAtDistanceK(node.left, target, k, result);
        if (leftDistance != -1) {
            if (leftDistance + 1 == k) {
                result.add(node.data);
            } else {
                addSubtreeNodesAtDistanceK(node.right, k - leftDistance - 2, result);
            }
            return leftDistance + 1;
        }

        int rightDistance = findNodesAtDistanceK(node.right, target, k, result);
        if (rightDistance != -1) {
            if (rightDistance + 1 == k) {
                result.add(node.data);
            } else {
                addSubtreeNodesAtDistanceK(node.left, k - rightDistance - 2, result);
            }
            return rightDistance + 1;
        }

        return -1;
    }

    // Helper function to add all nodes at distance k from the given node
    private void addSubtreeNodesAtDistanceK(TreeNode node, int k, List<Integer> result) {
        if (node == null || k < 0) return;
        if (k == 0) {
            result.add(node.data);
            return;
        }
        addSubtreeNodesAtDistanceK(node.left, k - 1, result);
        addSubtreeNodesAtDistanceK(node.right, k - 1, result);
    }
}

public class print_till_k_bst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of nodes in the BST
        int n = sc.nextInt();
        
        // Create the Binary Search Tree (BST)
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            tree.insert(data);
        }

        // Target node and distance k
        int target = sc.nextInt();
        int k = sc.nextInt();

        // Find and print nodes at distance k
        List<Integer> result = tree.nodesAtDistanceK(target, k);
        for (int node : result) {
            System.out.println(node);
        }

        sc.close();
    }
}
