import java.util.*;

public class kartik_sir_and_coding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int qu = scn.nextInt();

        Stack<pir> stk = new Stack<>();
        
        for (int i = 0; i < qu; i++) {
            int qry_typ = scn.nextInt();
            if (qry_typ == 1) {
                if (!stk.isEmpty()) {
                    pir module = stk.pop();
                    System.out.println(module.cst);
                } else {
                    System.out.println("No Code");
                }
            } else if (qry_typ == 2) {
                int cst = scn.nextInt();
                stk.push(new pir(cst, i));
            }
        }
    }
    
    static class pir {
        int cst;
        int idx;
        
        public pir(int cst, int idx) {
            this.cst = cst;
            this.idx = idx;
        }
    }
}
