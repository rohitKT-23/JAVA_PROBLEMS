import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class largest_bst_in_a_binary_tree {
    private TreeNode root;
    private int maxSize;

    // Function to construct the binary tree from preorder and inorder traversals
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        root = buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
        return root;
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode node = new TreeNode(preorder[preStart]);
        int inIndex = inMap.get(node.data);
        int leftTreeSize = inIndex - inStart;

        node.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inIndex - 1, inMap);
        node.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inIndex + 1, inEnd, inMap);

        return node;
    }

    // Function to find the largest BST subtree in the binary tree
    public int largestBSTSubtree(TreeNode root) {
        maxSize = 0;
        largestBSTHelper(root);
        return maxSize;
    }

    private Info largestBSTHelper(TreeNode node) {
        if (node == null) return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        Info left = largestBSTHelper(node.left);
        Info right = largestBSTHelper(node.right);

        Info curr = new Info();
        curr.size = left.size + right.size + 1;

        if (left.isBST && right.isBST && node.data > left.max && node.data < right.min) {
            curr.isBST = true;
            curr.min = Math.min(left.min, node.data);
            curr.max = Math.max(right.max, node.data);
            maxSize = Math.max(maxSize, curr.size);
        } else {
            curr.isBST = false;
        }

        return curr;
    }

    // Class to store information of each subtree
    class Info {
        boolean isBST;
        int size;
        int min, max;

        Info() {}

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];

        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }

        largest_bst_in_a_binary_tree tree = new largest_bst_in_a_binary_tree();
        tree.buildTree(preorder, inorder);
        System.out.println(tree.largestBSTSubtree(tree.root));
        sc.close();
    }
}
