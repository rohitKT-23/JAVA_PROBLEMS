import java.util.*;

class last_nd {
    int val;
    last_nd nxt;

    last_nd(int val) {
        this.val = val;
        nxt = null;
    }
}

public class triplet_of_three_ll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lst_1 = scan.nextInt(); 
        int lst_2 = scan.nextInt(); 
        int lst_3 = scan.nextInt(); 

        last_nd hd_1 = rd_lst(scan, lst_1);
        last_nd hd_2 = rd_lst(scan, lst_2);
        last_nd hd_3 = rd_lst(scan, lst_3);

        int target = scan.nextInt(); 

        t_sum(hd_1, hd_2, hd_3, target);
    }

    private static last_nd rd_lst(Scanner scan, int lst_1) {
        last_nd tmp = new last_nd(-1);
        last_nd curr = tmp;
        for (int i = 0; i < lst_1; i++) {
            int val = scan.nextInt();
            curr.nxt = new last_nd(val);
            curr = curr.nxt;
        }
        return tmp.nxt;
    }

    private static void t_sum(last_nd hd_1, last_nd hd_2, last_nd hd_3, int target) {
        last_nd point_1 = hd_1;
        while (point_1 != null) {
            last_nd point_2 = hd_2;
            while (point_2 != null) {
                last_nd point_3 = hd_3;
                while (point_3 != null) {
                    if (point_1.val + point_2.val + point_3.val == target) {
                        System.out.println(point_1.val + " " + point_2.val + " " + point_3.val);
                        return;
                    }
                    point_3 = point_3.nxt;
                }
                point_2 = point_2.nxt;
            }
            point_1 = point_1.nxt;
        }
        System.out.println("No such nodes found.");
    }
}
