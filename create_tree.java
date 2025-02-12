import java.util.*;
public class create_tree {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		create_tree m = new create_tree();
		int[] pr_odr = takeInput();
		int[] in_odr = takeInput();
		BTree bnry_tri = m.new BTree(pr_odr, in_odr);
		bnry_tri.show();
	}

	public static int[] takeInput() {
		int t_nums = scn.nextInt();

		int[] rvs = new int[t_nums];
		for (int num = 0; num < rvs.length; num++) {
			rvs[num] = scn.nextInt();
		}

		return rvs;
	}

	private class BTree {
		private class nod {
			int DTA;
			nod lft;
			nod rht;
		}

		private nod root;
		private int size;

		public BTree(int[] pr_odr, int[] in_odr) {
			this.root = this.CreateTree(pr_odr, in_odr, 0, pr_odr.length - 1, 0, in_odr.length - 1);

		}

		private nod CreateTree(int[] pr_odr, int[] in_od, int pre_od, int phi, int ilo, int ihi) {
			if (pre_od > phi || ilo > ihi) {
				return null;
			}
			nod node = new nod();
			node.DTA = pr_odr[pre_od];

			int IDX = Search(in_od, ilo, ihi, pr_odr[pre_od]);
			int c = IDX - ilo;
			node.lft = CreateTree(pr_odr, in_od, pre_od + 1, pre_od + c, ilo, IDX - 1);
			node.rht = CreateTree(pr_odr, in_od, pre_od + c + 1, phi, IDX + 1, ihi);
			return node;
		}

		public void show() {
			this.show(this.root);
		}

		private void show(nod node) {
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

	}
	public int Search(int[] in_odr, int loww, int highh, int ITM) {
		for (int num = loww; num <= highh; num++) {
			if (in_odr[num] == ITM) {
				return num;
			}
		}
		return 0;

	}

}