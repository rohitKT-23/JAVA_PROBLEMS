import java.util.*;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode rht;
	TreeNode(int data){
		this.data = data;
	}
}

public class print_all_leaf_nodes_BT {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		List<Integer> INPUT = new ArrayList<>();
		while(scn.hasNextInt()){
			INPUT.add(scn.nextInt());
		}
		SHOW(INPUT);
    }
	public static void SHOW(List<Integer> INPUT){
		if(INPUT == null || INPUT.isEmpty() || INPUT.get(0) == -1){
			return;
		}
		Queue<TreeNode> qu = new LinkedList<>();
		TreeNode root = new TreeNode(INPUT.get(0));
		qu.add(root);
        int i = 1;

        while (!qu.isEmpty() && i < INPUT.size()) {
            TreeNode curr = qu.poll();

            if (i < INPUT.size() && INPUT.get(i) != -1) {
                curr.left = new TreeNode(INPUT.get(i));
                qu.add(curr.left);
            }
            i++;

            if (i < INPUT.size() && INPUT.get(i) != -1) {
                curr.rht = new TreeNode(INPUT.get(i));
                qu.add(curr.rht);
            }
            i++;

            if (curr.left == null && curr.rht == null) {
                System.out.print(curr.data + " ");
            }
        }
	}
}