import java.util.*;
public class is_balanced_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		is_balanced_BT m = new is_balanced_BT();
		bnry_tree BT = m.new bnry_tree();
		System.out.println(BT.is_balance());
	}

	private class bnry_tree {
		private class Node {
			int DTA;
			Node lft;
			Node rht;
		}

		private Node root;
		private int size;

		public bnry_tree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int chld_data = scn.nextInt();
			Node child = new Node();
			child.DTA = chld_data;
			this.size++;

			// lft
			boolean lft_child = scn.nextBoolean();

			if (lft_child) {
				child.lft = this.takeInput(child, true);
			}

			// rht
			boolean right_child = scn.nextBoolean();

			if (right_child) {
				child.rht = this.takeInput(child, false);
			}

			return child;
		}

		public boolean is_balance() {
			return this.is_balance(this.root).is_balance;
		}

		private balance_pair is_balance(Node node) {
			int[] max_diff = {0};
        int max_H8 = display(node, max_diff);
        balance_pair ans = new balance_pair();
        ans.height = max_diff[0];
        if(max_diff[0] <= 1){
            ans.is_balance = true;
        }
        else{
            ans.is_balance = false;
        }
        return ans;
			
		}
        private int display(Node node, int[] max_diff){
        if(node == null){
            return 0;
        }
        int lft_h8 = display(node.lft, max_diff);
        int rht_h8 = display(node.rht, max_diff);
        max_diff[0] = Math.max(max_diff[0], Math.abs(lft_h8 - rht_h8));
        return 1 + Math.max(lft_h8, rht_h8);
    }

		private class balance_pair {
			int height;
			boolean is_balance;
		}

	}
}