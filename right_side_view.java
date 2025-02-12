import java.util.*;

class TreeNode {
    int DTA;
    TreeNode lft, rht;
    
    TreeNode(int DTA) {
        this.DTA = DTA;
        this.lft = null; 
        this.rht = null;
    }
}

public class right_side_view{
    public static TreeNode bld_trii(List<Integer> lvl_odr) {
        if (lvl_odr == null || lvl_odr.isEmpty() || lvl_odr.get(0) == -1) {
            return null;
        }

        TreeNode ROOT = new TreeNode(lvl_odr.get(0));
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(ROOT);
        int i = 1;

        while (!qu.isEmpty() && i < lvl_odr.size()) {
            TreeNode curr = qu.poll();
            if (i < lvl_odr.size() && lvl_odr.get(i) != -1) {
                curr.lft = new TreeNode(lvl_odr.get(i));
                qu.add(curr.lft);
            }
            i++;
            if (i < lvl_odr.size() && lvl_odr.get(i) != -1) {
                curr.rht = new TreeNode(lvl_odr.get(i));
                qu.add(curr.rht);
            }
            i++;
        }

        return ROOT;
    }

    private static void DFS(TreeNode meri_NOD, int lvl, List<Integer> rht_vu) {
        if (meri_NOD == null) {
            return;
        }

        if (lvl == rht_vu.size()) {
            rht_vu.add(meri_NOD.DTA);
        }

        DFS(meri_NOD.rht, lvl + 1, rht_vu);
        DFS(meri_NOD.lft, lvl + 1, rht_vu);
    }

    public static List<Integer> ans(TreeNode ROOT) {
        List<Integer> rht_vu = new ArrayList<>();
        DFS(ROOT, 0, rht_vu);
        return rht_vu;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> lvl_odr = new ArrayList<>();

        while (scn.hasNextInt()) {
            lvl_odr.add(scn.nextInt());
        }

        TreeNode ROOT = bld_trii(lvl_odr);

        List<Integer> rht_vu = ans(ROOT);
        for (int DTA : rht_vu) {
            System.out.print(DTA + " ");
        }
    }
}