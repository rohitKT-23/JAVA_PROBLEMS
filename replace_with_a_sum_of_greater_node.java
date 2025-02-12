import java.util.*;

class TreeNode {
    int DTA;
    TreeNode lft, rht;
    TreeNode(int DTA) {
        this.DTA = DTA;
        this.lft = this.rht = null;
    }
}

public class replace_with_a_sum_of_greater_node {
    static int IDX = 0;

    public static TreeNode srt_arr_bst(int[] in_odr, int suruu, int khatamm) {
        if (suruu > khatamm) {
            return null;
        }
        int beech = (suruu + khatamm) / 2;
        TreeNode ROOT = new TreeNode(in_odr[beech]);
        ROOT.rht = srt_arr_bst(in_odr, beech + 1, khatamm);
        ROOT.lft = srt_arr_bst(in_odr, suruu, beech - 1);
        return ROOT;
    }

    public static void update_NOD_val(TreeNode node, int[] t_sum) {
        if (node == null) {
            return;
        }
        update_NOD_val(node.rht, t_sum);
        
        node.DTA += t_sum[0];
        
        t_sum[0] = node.DTA;
        
        update_NOD_val(node.lft, t_sum);
    }

    // Function to perform preorder traversal
    public static void pre_odr_making(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.DTA + " ");
        pre_odr_making(node.lft);
        pre_odr_making(node.rht);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t_nums = scn.nextInt();
        int[] in_odr = new int[t_nums];
        for (int num = 0; num < t_nums; num++) {
            in_odr[num] = scn.nextInt();
        }
        scn.close();
        
        TreeNode ROOT = srt_arr_bst(in_odr, 0, t_nums - 1);
        
        int[] t_sum = {0};
        update_NOD_val(ROOT, t_sum);
        
        pre_odr_making(ROOT);
    }
}
