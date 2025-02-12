import java.util.*;
public class sibiling_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		sibiling_BT m = new sibiling_BT();
		BinaryTree bnry_tri = m.new BinaryTree();
		bnry_tri.saathi_bache();
	}

	private class BinaryTree {
		private class Node {
			int DTA;
			Node lft;
			Node rht;
		}

		private Node ROOT;
		private int size;

		public BinaryTree() {
			this.ROOT = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int child_DTA = scn.nextInt();
			Node child = new Node();
			child.DTA = child_DTA;
			this.size++;

			// lft
			boolean lft_child = scn.nextBoolean();

			if (lft_child) {
				child.lft = this.takeInput(child, true);
			}

			// rht
			boolean rht_child = scn.nextBoolean();

			if (rht_child) {
				child.rht = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void saathi_bache() {
			this.saathi_bache(this.ROOT);
		}

		private void saathi_bache(Node ROOT) {
			// write your code here
			if(ROOT == null) return;
			if(ROOT.lft == null && ROOT.rht!=null) System.out.print(ROOT.rht.DTA+" ");
			if(ROOT.lft != null && ROOT.rht==null) System.out.print(ROOT.lft.DTA+" ");
			saathi_bache(ROOT.lft);
			saathi_bache(ROOT.rht);
		}

	}

}