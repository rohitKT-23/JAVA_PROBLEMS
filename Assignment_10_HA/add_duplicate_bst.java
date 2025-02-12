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

    // Duplicate each node and make the duplicate as the left child
    public void duplicateNodes() {
        root = duplicateNodesRecursive(root);
    }

    private BinaryTreeNode duplicateNodesRecursive(BinaryTreeNode node) {
        if (node == null) {
            return null;
        }
        
        // Recursively duplicate nodes in the left and right subtrees
        node.left = duplicateNodesRecursive(node.left);
        node.right = duplicateNodesRecursive(node.right);

        // Create a duplicate node and set it as the left child
        BinaryTreeNode duplicate = new BinaryTreeNode(node.data);
        duplicate.left = node.left;
        node.left = duplicate;

        return node;
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

public class add_duplicate_bst {
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
        
        // Duplicate each node
        bst.duplicateNodes();
        
        // Print the tree
        bst.printTree();
        
        sc.close();
    }
}
