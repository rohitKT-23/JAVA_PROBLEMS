import java.util.*;
public class structurally_identical_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		structurally_identical_BT m = new structurally_identical_BT();
		BinaryTree bnry_tri_1 = m.new BinaryTree();
		BinaryTree bnry_tri_2 = m.new BinaryTree();
		System.out.println(bnry_tri_1.is_valid(bnry_tri_2));
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node lft;
			Node rht;
		}

		private Node rt;
		private int size;

		public BinaryTree() {
			this.rt = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int c_dta = scn.nextInt();
			Node chld = new Node();
			chld.data = c_dta;
			this.size++;

			boolean lft_side = scn.nextBoolean();

			if (lft_side) {
				chld.lft = this.takeInput(chld, true);
			}

			boolean right_side = scn.nextBoolean();

			if (right_side) {
				chld.rht = this.takeInput(chld, false);
			}

			return chld;
		}

		public boolean is_valid(BinaryTree other) {
			return this.is_valid(this.rt, other.rt);
		}

		private boolean is_valid(Node root_1, Node root_2) {
			if(root_1 == null || root_2 == null){
				return root_1 == root_2;
			}
			boolean lft = is_valid(root_1.lft, root_2.lft);
			boolean rht = is_valid(root_1.rht, root_2.rht);
			return lft && rht;
		}

	}
}