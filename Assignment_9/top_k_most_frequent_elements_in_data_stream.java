import java.util.*;
class Pair{
    int DTA;
    int FRQ;
    public Pair(int DTA, int FRQ){
        this.DTA = DTA;
        this.FRQ = FRQ;
    }
    public String toString(){
        return this.DTA + ":" + this.FRQ;
    }
}

public class top_k_most_frequent_elements_in_data_stream {
    public static void main(String[] args) {
        Scanner scnnn = new Scanner(System.in);
        int tst_cases = scnnn.nextInt();
        while(tst_cases-- > 0) {
            int t_n = scnnn.nextInt();
            int t_k = scnnn.nextInt();
            int[] strm = new int[t_n];
            for (int n = 0; n < t_n; n++) {
                strm[n] = scnnn.nextInt();
            }
            HashMap<Integer, Integer> has_mapp = new HashMap<>();
            for (int n = 0; n < t_n; n++) {
                int item = strm[n];
                has_mapp.put(item, has_mapp.getOrDefault(item, 0) + 1);
                PriorityQueue<Pair> max_HP = new PriorityQueue<Pair>(new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        if (o1.FRQ != o2.FRQ) {
                            return o2.FRQ - o1.FRQ;
                        } else {
                            return o1.DTA - o2.DTA;
                        }
                    }
                });
                for (Map.Entry<Integer, Integer> etry : has_mapp.entrySet()) {
                    max_HP.add(new Pair(etry.getKey(), etry.getValue()));
                }
                int ginoo = t_k;
                while (ginoo-- > 0) {
                    Pair joprdee = max_HP.poll();
                    if (joprdee != null) {
                        System.out.print(joprdee.DTA + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
