import java.util.*;

class lst_nd {
    int val;
    lst_nd nxt;

    lst_nd(int val) {
        this.val = val;
    }
}

public class ll_k_reverse {
    public static lst_nd rev_k_grp(lst_nd hd, int k) {
        if (hd == null || k == 1) {
            return hd;
        }

        lst_nd tmp = new lst_nd(0);
        tmp.nxt = hd;
        lst_nd pre = tmp;
        lst_nd curr = hd;
        int cnt = 0;

        while (curr != null) {
            curr = curr.nxt;
            cnt++;
        }

        curr = hd;

        while (cnt >= k) {
            lst_nd nxt_grp_start = curr.nxt;
            lst_nd pre_grp_end = pre.nxt;

            for (int i = 1; i < k; i++) {
                lst_nd temp = nxt_grp_start.nxt;
                nxt_grp_start.nxt = curr;
                curr = nxt_grp_start;
                nxt_grp_start = temp;
            }

            pre.nxt = curr;
            pre_grp_end.nxt = nxt_grp_start;
            pre = pre_grp_end;
            curr = nxt_grp_start;
            cnt -= k;
        }

        return tmp.nxt;
    }

    public static void printList(lst_nd hd) {
        while (hd != null) {
            System.out.print(hd.val + " ");
            hd = hd.nxt;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();

        lst_nd hd = new lst_nd(scanner.nextInt());
        lst_nd current = hd;
        for (int i = 1; i < N; i++) {
            current.nxt = new lst_nd(scanner.nextInt());
            current = current.nxt;
        }

        scanner.close();

        lst_nd rev_lst = rev_k_grp(hd, k);

        printList(rev_lst);
    }
}
