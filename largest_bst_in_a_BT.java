import java.util.Scanner;

class Main {
	static class bnry_trii {

		private class Node {
			int DTA;
			Node lft;
			Node rht;

			Node(int DTA, Node lft, Node rht) {
				this.DTA = DTA;
				this.lft = lft;
				this.rht = rht;
			}
		}

		private Node root;
		private int size;

		public int size() {
			return this.size;
		}

		public boolean is_khalii() {
			return this.size == 0;
		}

		public bnry_trii() {
			Scanner scnnn = new Scanner(System.in);
			this.root = this.INPUT(scnnn, null, false);
		}

		private Node INPUT(Scanner scnnn, Node papa, boolean lft_or_rht) {
			if (papa == null) {
				System.out.println("Enter the DTA for root");
			} else {
				if (lft_or_rht) {
					System.out.println("Enter the DTA for lft chld of" + papa.DTA);
				} else {
					System.out.println("Enter the DTA for rht chld of" + papa.DTA);
				}
			}
			int c_DTA = scnnn.nextInt();
			Node chld = new Node(c_DTA, null, null);
			this.size++;
			boolean choice = false;
			System.out.println("Do you want have lft chld for" + chld.DTA);
			choice = scnnn.nextBoolean();
			if (choice) {
				chld.lft = this.INPUT(scnnn, chld, true);
			}
			System.out.println("Do you have a rht chld");
			choice = scnnn.nextBoolean();
			if (choice) {
				chld.rht = this.INPUT(scnnn, chld, false);
			}
			return chld;
		}

		public void SHOW() {
			this.SHOW(this.root);
		}

		private void SHOW(Node node) {
			if (node.lft != null) {
				System.out.print(node.lft.DTA + " =>");
			} else {
				System.out.print("END =>");
			}
			System.out.print(node.DTA + "<= ");
			if (node.rht != null) {
				System.out.print(node.rht.DTA);
			} else {
				System.out.print("END");
			}
			System.out.println();
			if (node.lft != null) {
				this.SHOW(node.lft);
			}
			if (node.rht != null) {
				this.SHOW(node.rht);
			}
		}

		/////////////////// New Constructor//////////

		public bnry_trii(int[] pree, int[] inn) {
			// this.root = this.construct(pree, 0, pree.length - 1, inn, 0, inn.length -
			// 1);//for preorder
			this.root = this.construct(pree, inn, 0, inn.length - 1);// for
																	// postorder

		}

		private static int preIndex = 0;

		private Node construct(int[] pree, int[] inn, int isi, int iei) {
			if (isi > iei) {
				return null;
			}
			Node tNode = new Node(pree[preIndex++], null, null);

			if (isi == iei) {
				return tNode;
			}

			int in_IDX = dhundoo(inn, isi, iei, tNode.DTA);
			tNode.lft = construct(pree, inn, isi, in_IDX - 1);
			tNode.rht = construct(pree, inn, in_IDX + 1, iei);
			return tNode;

		}

		private int dhundoo(int[] arr, int si, int ei, int DTA) {
			for (int num = si; num <= ei; num++) {
				if (arr[num] == DTA)
					return num;
			}
			return -1;
		}

		class Info {
			int size;
			int max;
			int min;
			int ans;
			boolean isBST;

			Info() {

			}

			Info(int s, int max, int min, int ans, boolean isBST) {
				this.size = s;
				this.max = max;
				this.min = min;
				this.ans = ans;
				this.isBST = isBST;
			}
		}

		public int largestBSTinBT() {
			return this.largestBSTinBT(this.root).ans;
		}

		//Complete this
		 private Info largestBSTinBT(Node root) {
            if (root == null) {
                return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
            }

            Info leftInfo = largestBSTinBT(root.lft);
            Info rightInfo = largestBSTinBT(root.rht);

            Info currentInfo = new Info(0, 0, 0, 0, false);

            if (leftInfo.isBST && rightInfo.isBST &&
                root.DTA > leftInfo.max && root.DTA < rightInfo.min) {

                currentInfo.min = Math.min(root.DTA, leftInfo.min);
                currentInfo.max = Math.max(root.DTA, rightInfo.max);

                currentInfo.size = leftInfo.size + rightInfo.size + 1;
                currentInfo.ans = currentInfo.size;
                currentInfo.isBST = true;

                return currentInfo;
            }

            currentInfo.ans = Math.max(leftInfo.ans, rightInfo.ans);
            currentInfo.isBST = false;

            return currentInfo;
        }
    }

	public static void main(String[] args) {
		Scanner scnnn = new Scanner(System.in);
		int t_nums = scnnn.nextInt();
		int[] pree = new int[t_nums];
		int[] inn = new int[t_nums];
		for (int num = 0; num < t_nums; num++) {
			pree[num] = scnnn.nextInt();
		}
		for (int num = 0; num < t_nums; num++) {
			inn[num] = scnnn.nextInt();
		}

		bnry_trii bt = new bnry_trii(pree, inn);
//		bt.SHOW();
		System.out.println(bt.largestBSTinBT());
	}
}
