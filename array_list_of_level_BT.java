import java.util.*;
public class array_list_of_level_BT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		array_list_of_level_BT m = new array_list_of_level_BT();
		bnry_tree bnry_tre_1 = m.new bnry_tree();
		System.out.println(bnry_tre_1.levelArrayList());
	}

	private class bnry_tree {
		private class Node {
			int data;
			Node lft;
			Node rht;
		}

		private Node root;
		private int size;

		public bnry_tree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int child_root = scn.nextInt();
			Node child = new Node();
			child.data = child_root;
			this.size++;

			// lft
			boolean child_left = scn.nextBoolean();

			if (child_left) {
				child.lft = this.takeInput(child, true);
			}

			// rht
			boolean child_right = scn.nextBoolean();

			if (child_right) {
				child.rht = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			Queue<Node> que = new LinkedList<>();
			que.offer(root);
			while(!que.isEmpty()){
				int size = que.size();
				ArrayList<Integer> level = new ArrayList<>();
				for(int i=0; i<size; i++){
					Node NOD = que.poll();
					level.add(NOD.data);
					if(NOD.lft != null){
						que.offer(NOD.lft);
					}
					if(NOD.rht != null){
						que.offer(NOD.rht);
					}
				}
				ans.add(level);
			}
			return ans;
		}

	}

}