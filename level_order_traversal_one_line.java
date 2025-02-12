import java.util.*;
public class level_order_traversal_one_line {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		level_order_traversal_one_line m = new level_order_traversal_one_line();
		BT bnry_tree = m.new BT();
		bnry_tree.lvl_odr_nw_line();
	}

	private class BT {
		private class Node {
			int DTA;
			Node lft;
			Node rht;
		}

		private Node root;
		private int size;

		public BT() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int C_dta = scn.nextInt();
			Node child = new Node();
			child.DTA = C_dta;
			this.size++;

			// lft
			boolean left_child = scn.nextBoolean();

			if (left_child) {
				child.lft = this.takeInput(child, true);
			}

			// rht
			boolean right_child = scn.nextBoolean();

			if (right_child) {
				child.rht = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void lvl_odr_nw_line() {
			Queue<Node> qu = new LinkedList<>();
			qu.offer(root);
			while(!qu.isEmpty()){
				int size = qu.size();
				ArrayList<Integer> lvl = new ArrayList<>();
				for(int num=0; num<size; num++){
					Node NOD = qu.poll();
					lvl.add(NOD.DTA);
					if(NOD.lft != null){
						qu.offer(NOD.lft);
					}
					if(NOD.rht != null){
						qu.offer(NOD.rht);
					}
				}
				for(int item : lvl){
					System.out.print(item + " ");
				}
				System.out.println();
			}
		}

	}

}