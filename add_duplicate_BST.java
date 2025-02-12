import java.util.*;
class add_duplicate_BST{
	public static void main (String[] args) {
	        bnrt_tree_search bnry_trii_srch=new bnrt_tree_search();
            Scanner scn=new Scanner(System.in);
	        int t_nums=scn.nextInt();
	        for(int num=0;num<t_nums;num++){
	           bnry_trii_srch.joordd(scn.nextInt()); 
	        }
		    bnry_trii_srch.is_duplicate_node();
		    bnry_trii_srch.SHOWW();
	    }
}
class bnrt_tree_search {
	public class Node {
		int DTA;
		Node lft;
		Node rht;

		public Node(int DTA, Node lft, Node rht) {
			this.DTA = DTA;
			this.lft = lft;
			this.rht = rht;
		}
	}

	private Node ROOT;
	private int size;

	public bnrt_tree_search() {
		this.ROOT = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean is_khaalii() {
		return this.size() == 0;
	}

	public void joordd(int DTA) {
		this.joordd(DTA, this.ROOT);
	}

	private void joordd(int DTA, Node node) {
		if (this.is_khaalii()) {
			Node t_nums = new Node(DTA, null, null);
			this.size++;
			this.ROOT = t_nums;
			return;
		} else {
			if (DTA > node.DTA && node.rht == null) {
				Node t_nums = new Node(DTA, null, null);
				this.size++;
				node.rht = t_nums;
			} else if (DTA < node.DTA && node.lft == null) {
				Node t_nums = new Node(DTA, null, null);
				this.size++;
				node.lft = t_nums;
			} else if (DTA > node.DTA) {
				joordd(DTA, node.rht);
			} else if (DTA < node.DTA) {
				joordd(DTA, node.lft);
			}
		}
	}

	public void SHOWW() {
		this.SHOWW(this.ROOT);
	}

	private void SHOWW(Node node) {
		if (node.lft != null) {
			System.out.print(node.lft.DTA + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.DTA);
		if (node.rht != null) {
			System.out.print(" <= " + node.rht.DTA);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.lft != null) {
			SHOWW(node.lft);
		}
		if (node.rht != null) {
			SHOWW(node.rht);
		}
	}	
	public void is_duplicate_node() {
	        this.is_duplicate_node(this.ROOT);
	    }

	    private void is_duplicate_node(Node ROOT) {
				if(ROOT == null) {
					return;
				}
				is_duplicate_node(ROOT.lft);
				Node nw_nodes =new Node(ROOT.DTA,ROOT.lft,null);
				ROOT.lft = nw_nodes;
				is_duplicate_node(ROOT.rht);

	    }
}