import java.util.Scanner;

class lst_nd {
    int val;
    lst_nd nxt;

    lst_nd(int val) {
        this.val = val;
    }
}

public class ll_k_append {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        lst_nd hd = new lst_nd(scan.nextInt());
        lst_nd current = hd;
        for (int i = 1; i < N; i++) {
            current.nxt = new lst_nd(scan.nextInt());
            current = current.nxt;
        }

        int K = scan.nextInt();
        scan.close();

        lst_nd new_list = apnd_lst_k_frst(hd, K);

        prt_lst(new_list);
    }
    public static lst_nd apnd_lst_k_frst(lst_nd hd, int k) {
        if (hd == null || k == 0) {
            return hd;
        }

        lst_nd curr = hd;
        int cnt = 0;

        while (curr != null) {
            curr = curr.nxt;
            cnt++;
        }

        k %= cnt;

        if (k == 0) {
            return hd; 
        }

        curr = hd;
        for (int i = 1; i < cnt - k; i++) {
            curr = curr.nxt;
        }

        lst_nd nw_hd = curr.nxt;
        curr.nxt = null; 

        curr = nw_hd;
        while (curr.nxt != null) {
            curr = curr.nxt;
        }
        curr.nxt = hd;

        return nw_hd;
    }

    public static void prt_lst(lst_nd hd) {
        while (hd != null) {
            System.out.print(hd.val + " ");
            hd = hd.nxt;
        }
    }

}
