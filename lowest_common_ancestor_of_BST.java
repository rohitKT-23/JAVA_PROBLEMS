import java.util.Scanner;

class TreeNode {
    int DTA;
    TreeNode lft, rht;
    TreeNode(int DTA) {
        this.DTA = DTA;
        this.lft = this.rht = null;
    }
}

public class lowest_common_ancestor_of_BST {
    public static TreeNode insrt(TreeNode ROOT, int DTA) {
        if (ROOT == null) {
            return new TreeNode(DTA);
        }
        if (DTA < ROOT.DTA) {
            ROOT.lft = insrt(ROOT.lft, DTA);
        } else if (DTA > ROOT.DTA) {
            ROOT.rht = insrt(ROOT.rht, DTA);
        }
        return ROOT;
    }

    public static TreeNode fnd_lowest_common_ancestor(TreeNode ROOT, int num_1, int num_2) {
        while (ROOT != null) {
            if (num_1 < ROOT.DTA && num_2 < ROOT.DTA) {
                ROOT = ROOT.lft;
            } else if (num_1 > ROOT.DTA && num_2 > ROOT.DTA) {
                ROOT = ROOT.rht;
            } else {
                return ROOT;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t_nums = scn.nextInt();
        TreeNode ROOT = null;

        for (int num = 0; num < t_nums; num++) {
            int DTA = scn.nextInt();
            ROOT = insrt(ROOT, DTA);
        }

        int num_1 = scn.nextInt();
        int num_2 = scn.nextInt();


        TreeNode ans = fnd_lowest_common_ancestor(ROOT, num_1, num_2);


        System.out.println(ans.DTA);

        scn.close();
    }
}