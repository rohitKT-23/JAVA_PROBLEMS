import java.util.Scanner;

class lst_nd {
    int dta;
    lst_nd nxt;

    lst_nd(int d) {
        dta = d;
        nxt = null;
    }
}

public class Main {
    static Scanner ssccn = new Scanner(System.in);

    public static void main(String[] args) {
        int t_cases = ssccn.nextInt();
        while (t_cases-- > 0) {
            lst_nd h_1 = null;
            lst_nd h_2 = null;
            h_1 = bld_lst(h_1);
            h_2 = bld_lst(h_2);

            lst_nd mrg_hd = mrg(h_1, h_2);

            print(mrg_hd);
        }
    }

    static lst_nd bld_lst(lst_nd h_1) {
        int t_nums = ssccn.nextInt();
        while (t_nums-- > 0) {
            int dta = ssccn.nextInt();
            h_1 = insrt_tail(h_1, dta);
        }
        return h_1;
    }

    static lst_nd insrt_tail(lst_nd h_1, int dta) {
        if (h_1 == null) {
            h_1 = new lst_nd(dta);
            return h_1;
        }
        lst_nd tail = h_1;
        while (tail.nxt != null) {
            tail = tail.nxt;
        }
        tail.nxt = new lst_nd(dta);
        return h_1;
    }

    static lst_nd mrg(lst_nd head_1, lst_nd head_2) {
        if (head_1 == null)
            return head_2;
        if (head_2 == null)
            return head_1;

        lst_nd c;
        if (head_1.dta < head_2.dta) {
            c = head_1;
            c.nxt = mrg(head_1.nxt, head_2);
        } else {
            c = head_2;
            c.nxt = mrg(head_1, head_2.nxt);
        }
        return c;
    }

    static void print(lst_nd h_1) {
        while (h_1 != null) {
            System.out.print(h_1.dta + " ");
            h_1 = h_1.nxt;
        }
        System.out.println();
    }
}