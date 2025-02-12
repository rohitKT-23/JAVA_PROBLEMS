import java.util.*;

class TreeNode {
    int DTA;
    TreeNode lft, rht;
    public TreeNode(int DTA) {
        this.DTA = DTA;
        lft = rht = null;
    }
}

public class Tree_Bottom_View {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] ip = scn.nextLine().split(" ");
        
        TreeNode ROT = tre_bld(ip);
        
        List<Integer> btm_vw = getBottomView(ROT);
        for (int val : btm_vw) {
            System.out.print(val + " ");
        }
    }

    private static TreeNode tre_bld(String[] ip) {
        if (ip.length == 0 || ip[0].equals("-1")) {
            return null;
        }

        TreeNode ROT = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(ROT);
        int num = 1;

        while (!qu.isEmpty() && num < ip.length) {
            TreeNode curr_NOD = qu.poll();

            if (!ip[num].equals("-1")) {
                curr_NOD.lft = new TreeNode(Integer.parseInt(ip[num]));
                qu.add(curr_NOD.lft);
            }
            num++;

            if (num < ip.length && !ip[num].equals("-1")) {
                curr_NOD.rht = new TreeNode(Integer.parseInt(ip[num]));
                qu.add(curr_NOD.rht);
            }
            num++;
        }

        return ROT;
    }

    private static List<Integer> getBottomView(TreeNode ROT) {
        List<Integer> ans = new ArrayList<>();
        if (ROT == null) {
            return ans;
        }

        TreeMap<Integer, Integer> btm_vw_mp = new TreeMap<>();
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(ROT, 0));

        while (!qu.isEmpty()) {
            Pair pair = qu.poll();
            TreeNode curr_NOD = pair.NODE;
            int hori_dist = pair.hori_dist;

            btm_vw_mp.put(hori_dist, curr_NOD.DTA);

            if (curr_NOD.lft != null) {
                qu.add(new Pair(curr_NOD.lft, hori_dist - 1));
            }

            if (curr_NOD.rht != null) {
                qu.add(new Pair(curr_NOD.rht, hori_dist + 1));
            }
        }

        ans.addAll(btm_vw_mp.values());
        return ans;
    }

    static class Pair {
        TreeNode NODE;
        int hori_dist;
        public Pair(TreeNode NODE, int hori_dist) {
            this.NODE = NODE;
            this.hori_dist = hori_dist;
        }
    }
}
