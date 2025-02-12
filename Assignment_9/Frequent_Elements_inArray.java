package HashMap_Assignment_9;

import java.util.*;
public class Frequent_Elements_inArray {
    public static void main (String args[]) {
        Scanner scnnn = new Scanner(System.in);
        int t_lennn = scnnn.nextInt();
        int k_th = scnnn.nextInt();
        int[] arrayy = new int[t_lennn];
        for (int num = 0; num < t_lennn; num++) {
            arrayy[num] = scnnn.nextInt();
        }

        HashMap<Integer, Integer> has_MAPPP = new HashMap<>();
        for(int num : arrayy) {
            has_MAPPP.put(num, has_MAPPP.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> mAX_hp = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for(int kyy : has_MAPPP.keySet()){
            mAX_hp.add(new int[]{kyy, has_MAPPP.get(kyy)});
        }

        List<Integer> listttas = new ArrayList<>();
        while(k_th-- > 0 && !mAX_hp.isEmpty()){
            listttas.add(mAX_hp.poll()[0]);
        }
        Collections.sort(listttas);
        for(int ITM : listttas) {
            System.out.print(ITM + " ");
        }
    }
}