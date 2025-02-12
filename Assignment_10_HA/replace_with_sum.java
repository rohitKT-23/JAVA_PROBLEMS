import java.util.Scanner;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    private BinaryTreeNode root;
    private int accumulatedSum = 0;

    // Insert a node in the BST
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private BinaryTreeNode insertRecursive(BinaryTreeNode node, int data) {
        if (node == null) {
            return new BinaryTreeNode(data);
        }
        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }
        return node;
    }

    // Replace each node with the sum of all greater nodes
    public void replaceWithSumOfGreaterNodes() {
        accumulatedSum = 0;
        replaceWithSumOfGreaterNodesRecursive(root);
    }

    private void replaceWithSumOfGreaterNodesRecursive(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        // Traverse the right subtree first (greater values)
        replaceWithSumOfGreaterNodesRecursive(node.right);

        // Update node value with the accumulated sum
        int originalValue = node.data;
        node.data = accumulatedSum;
        accumulatedSum += originalValue;

        // Traverse the left subtree (lesser values)
        replaceWithSumOfGreaterNodesRecursive(node.left);
    }

    // Print the BST in the specified format
    public void printTree() {
        printTreeRecursive(root);
    }

    private void printTreeRecursive(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        String left = (node.left != null) ? String.valueOf(node.left.data) : "END";
        String right = (node.right != null) ? String.valueOf(node.right.data) : "END";
        
        System.out.println(left + " => " + node.data + " <= " + right);

        printTreeRecursive(node.left);
        printTreeRecursive(node.right);
    }
}

public class replace_with_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of nodes
        int n = sc.nextInt();
        
        // Create a BST and add nodes
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            bst.insert(data);
        }
        
        // Replace each node with the sum of all greater nodes
        bst.replaceWithSumOfGreaterNodes();
        
        // Print the resulting tree
        bst.printTree();
        
        sc.close();
    }
}
