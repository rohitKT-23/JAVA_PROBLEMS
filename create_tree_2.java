import java.util.*;
public class create_tree_2 {

	static Scanner sccnnn = new Scanner(System.in);

	public static void main(String[] args) {
		create_tree_2 m = new create_tree_2();
		int[] pst = takeInput();
		int[] in_odr = takeInput();
		BinaryTree bnry_trii = m.new BinaryTree(pst, in_odr);
		bnry_trii.display();
	}

	public static int[] takeInput() {
		int t_nums = sccnnn.nextInt();

		int[] reverse = new int[t_nums];
		for (int num = 0; num < reverse.length; num++) {
			reverse[num] = sccnnn.nextInt();
		}

		return reverse;
	}

	private class BinaryTree {
		private class Node {
			int DTA;
			Node lft;
			Node rht;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pst, int[] in_odr) {
			this.root = this.BuildTree(pst,0,pst.length-1,in_odr, 0, in_odr.length - 1);
		}

		private Node BuildTree(int[] pst,int ploooo,int phiii ,int[] in_odr, int illooo, int ihiii ) {
			if(ploooo>phiii || illooo>ihiii) return null;
			Node meri_new_node = new Node();
			meri_new_node.DTA = pst[phiii];
			int num = niww_function(in_odr,illooo,ihiii,pst[phiii]);
			int ele = num-illooo;

			meri_new_node.lft = BuildTree(pst,ploooo,ploooo+ele-1,in_odr,illooo,num-1);
			meri_new_node.rht = BuildTree(pst,ele,phiii-1,in_odr,num+1,ihiii);
			return meri_new_node;
			// write your code here
			
		}
		public int niww_function(int[] in_odr,int illooo,int ihiii,int iittem){
        for(int num = illooo;num<=ihiii;num++){
            if(in_odr[num] == iittem)return num;
        }
        return 0;
    }

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
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

			this.display(node.lft);
			this.display(node.rht);
		}

	}

}