import java.util.*;

public class hoodies_at_coding_blocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T_qu = scanner.nextInt();
        Queue<Integer> qu_1 = new LinkedList<>();
        Queue<Integer> qu_2 = new LinkedList<>();
        Queue<Integer> qu_3 = new LinkedList<>();
        Queue<Integer> qu_4 = new LinkedList<>();
        Queue<Integer> grp_odr = new LinkedList<>();
        boolean valid_1 = false, valid_2 = false, valid_3 = false, valid_4 = false;

        for (int k = 0; k < T_qu; k++) {
            char chr = scanner.next().charAt(0);
            if (chr == 'E') {
                int str_1 = scanner.nextInt();
                int str_2 = scanner.nextInt();
                if (str_1 == 1) {
                    qu_1.add(str_2);
                    if (!valid_1) {
                        grp_odr.add(1);
                        valid_1 = true;
                    }
                } else if (str_1 == 2) {
                    qu_2.add(str_2);
                    if (!valid_2) {
                        grp_odr.add(2);
                        valid_2 = true;
                    }
                } else if (str_1 == 3) {
                    qu_3.add(str_2);
                    if (!valid_3) {
                        grp_odr.add(3);
                        valid_3 = true;
                    }
                } else {
                    qu_4.add(str_2);
                    if (!valid_4) {
                        grp_odr.add(4);
                        valid_4 = true;
                    }
                }
            }
            if (chr == 'D') {
                int frt = grp_odr.peek();
                if (frt == 1) {
                    if (!qu_1.isEmpty()) {
                        System.out.println("1" + " " + qu_1.peek());
                        qu_1.poll();
                    }
                    if (qu_1.isEmpty()) {
                        grp_odr.poll();
                        valid_1 = false;
                    }
                } else if (frt == 2) {
                    if (!qu_2.isEmpty()) {
                        System.out.println("2" + " " + qu_2.peek());
                        qu_2.poll();
                    }
                    if (qu_2.isEmpty()) {
                        grp_odr.poll();
                        valid_2 = false;
                    }
                } else if (frt == 3) {
                    if (!qu_3.isEmpty()) {
                        System.out.println("3" + " " + qu_3.peek());
                        qu_3.poll();
                    }
                    if (qu_3.isEmpty()) {
                        grp_odr.poll();
                        valid_3 = false;
                    }
                } else {
                    if (!qu_4.isEmpty()) {
                        System.out.println("4" + " " + qu_4.peek());
                        qu_4.poll();
                    }
                    if (qu_4.isEmpty()) {
                        grp_odr.poll();
                        valid_4 = false;
                    }
                }
            }
        }
    }
}