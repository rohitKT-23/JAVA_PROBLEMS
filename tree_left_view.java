import java.util.*;
import java.io.*;

public class tree_left_view {
    public static void main(String args[]) throws Exception {
        BufferedReader buffer_read = new BufferedReader(new InputStreamReader(System.in));
        String[] A = buffer_read.readLine().split(" ");
        BinaryTree bnry_trii = new BinaryTree(A);
        bnry_trii.lft_vu_mdl();
    }
}

class BinaryTree {
    private class TreeNode {
        int DTA;
        TreeNode lft, rht;

        TreeNode(int DTA) {
            this.DTA = DTA;
        }
    }

    TreeNode ROOT;

    BinaryTree(String[] A) {
        Queue<TreeNode> quu = new LinkedList<>();
        this.ROOT = cnst(A, quu);
    }

    public void lft_vu_mdl() {
        lft_vu_mdl(this.ROOT);
    }

    private void lft_vu_mdl(TreeNode ROOT) {
        if (ROOT == null){
			return;
		}
        Queue<TreeNode> quu = new LinkedList<>();
        quu.add(ROOT);
        while (!quu.isEmpty()) {
            int s = quu.size();
            for (int num = 0; num < s; num++) {
                TreeNode curr_node = quu.poll();
                if (num == 0) {
                    System.out.print(curr_node.DTA + " ");
                }
                if (curr_node.lft != null) {
                    quu.add(curr_node.lft);
                }
                if (curr_node.rht != null) {
                    quu.add(curr_node.rht);
                }
            }
        }
    }

    private TreeNode cnst(String[] A, Queue<TreeNode> quu) {
        if (A.length == 0 || A[0].equals("-1")) return null;

        TreeNode ROOT = new TreeNode(Integer.parseInt(A[0]));
        quu.add(ROOT);
        int num = 1;

        while (!quu.isEmpty() && num < A.length) {
            TreeNode meri_NODE = quu.poll();

            // Handle lft child
            if (!A[num].equals("-1")) {
                meri_NODE.lft = new TreeNode(Integer.parseInt(A[num]));
                quu.add(meri_NODE.lft);
            }
            num++;

            // Handle rht child
            if (num < A.length && !A[num].equals("-1")) {
                meri_NODE.rht = new TreeNode(Integer.parseInt(A[num]));
                quu.add(meri_NODE.rht);
            }
            num++;
        }

        return ROOT;
    }
}