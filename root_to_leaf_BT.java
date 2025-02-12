import java.util.*;
class bnry_tree{
	public class Node{
        int DTA;
        Node lft;
        Node rht;
    }
    private Node ROOT;
    public bnry_tree(){
        this.ROOT  = createtree();
    }

    Scanner scn = new Scanner(System.in);
    private Node createtree(){
        int ITM  = scn.nextInt();
        Node new_NODE = new Node();
        new_NODE.DTA = ITM;
        boolean lft_child = scn.nextBoolean();
        if(lft_child == true){
            new_NODE.lft = createtree();
        }
        boolean rht_CHILD = scn.nextBoolean();
        if(rht_CHILD == true){
            new_NODE.rht = createtree();
        }
        return new_NODE;
    }

	public void show_node(){
		int main_sum = scn.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		sum_path_algo(ans,this.ROOT,main_sum);
	}
	public void sum_path_algo(ArrayList<Integer> ans,Node ROOT,int main_sum){
		if(ROOT == null) return;
		if(ROOT.lft == null && ROOT.rht == null){
			if(main_sum-ROOT.DTA==0){
				ans.add(ROOT.DTA);
				for(int i = 0;i<ans.size();i++){
					System.out.print(ans.get(i)+" ");
				}
			}
			return;
        }
		ans.add(ROOT.DTA);
		sum_path_algo(ans,ROOT.lft,main_sum-ROOT.DTA);
		sum_path_algo(ans,ROOT.rht,main_sum-ROOT.DTA);
		ans.remove(ans.size()-1);
	}
}
public class root_to_leaf_BT {
    public static void main(String args[]) {
		bnry_tree bt = new bnry_tree();
		bt.show_node();
    }
}