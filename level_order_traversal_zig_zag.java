import java.util.*;

class Node {
    int DTA;
    Node lft, rht;

    Node(int DTA) {
        this.DTA = DTA;
        this.lft = this.rht = null;
    }
}

public class level_order_traversal_zig_zag {

    // Function to construct the binary tree from input
    public static Node tree_making(Scanner scn) {
        int DTA = scn.nextInt();
        Node root = new Node(DTA);
        if (scn.nextBoolean()) {
            root.lft = tree_making(scn);
        }
        if (scn.nextBoolean()) {
            root.rht = tree_making(scn);
        }
        return root;
    }

    public static void soln_zig_zag(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> curr_lvl = new Stack<>();
        Stack<Node> nxt_lvl = new Stack<>();

        curr_lvl.push(root);
        boolean lft_to_rht = true;

        while (!curr_lvl.isEmpty()) {
            Node node = curr_lvl.pop();
            System.out.print(node.DTA + " ");

            if (lft_to_rht) {
                if (node.lft != null) {
                    nxt_lvl.push(node.lft);
                }
                if (node.rht != null) {
                    nxt_lvl.push(node.rht);
                }
            }
            else {
                if (node.rht != null) {
                    nxt_lvl.push(node.rht);
                }
                if (node.lft != null) {
                    nxt_lvl.push(node.lft);
                }
            }

            if (curr_lvl.isEmpty()) {
                lft_to_rht = !lft_to_rht;
                Stack<Node> temp = curr_lvl;
                curr_lvl = nxt_lvl;
                nxt_lvl = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Node root = tree_making(scn);
        soln_zig_zag(root);
    }
}
