import java.util.*;
public class sun_of_nodes_BT {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		sun_of_nodes_BT m = new sun_of_nodes_BT();
		BinaryTree bnry_tree = m.new BinaryTree();
		System.out.println(bnry_tree.t_sum_NOD());
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

		public int t_sum_NOD() {
			return this.t_sum_NOD(this.root) ;
		}
		
		private int t_sum_NOD(Node node) {
			if(node == null) return 0;
			
       		int lft = t_sum_NOD(node.lft);
        	int rht = t_sum_NOD(node.rht);
			return lft+rht+node.DTA;
		}
	}
}