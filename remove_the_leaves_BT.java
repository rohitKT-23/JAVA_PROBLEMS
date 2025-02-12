import java.util.*;
public class remove_the_leaves_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		remove_the_leaves_BT m = new remove_the_leaves_BT();
		BinaryTree bnry_tri = m.new BinaryTree();
		bnry_tri.rmv_leaves();
		bnry_tri.show();
	}

	private class BinaryTree {
		private class Node {
			int DTA;
			Node lft;
			Node rht;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node papa, boolean lft_child) {

			int child_DTA = scn.nextInt();
			Node child = new Node();
			child.DTA = child_DTA;
			this.size++;

			// lft
			boolean h_lft_child = scn.nextBoolean();

			if (h_lft_child) {
				child.lft = this.takeInput(child, true);
			}

			// rht
			boolean h_right_child = scn.nextBoolean();

			if (h_right_child) {
				child.rht = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void show() {
			this.show(this.root);
		}

		private void show(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.lft != null) {
				str += node.lft.DTA;
			} else {
				str += "END";
			}

			str += " => " + node.DTA + " <= ";

			if (node.rht != null) {
				str += node.rht.DTA;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.show(node.lft);
			this.show(node.rht);
		}

		public void rmv_leaves() {
			this.root = this.rmv_leaves(this.root);
		}

		private Node rmv_leaves( Node root) {
			 
			if(root == null) return null;
			if(root.lft == null && root.rht == null){
				root = null;
				return root;
			}
			root.rht = rmv_leaves(root.rht);
			root.lft = rmv_leaves(root.lft);
			return root;
			
		}

	}

}