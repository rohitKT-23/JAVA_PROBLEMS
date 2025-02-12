import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Median_in_a_stream_of_running_integers {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t_cases = scn.nextInt();
        
        while (t_cases-- > 0) {
            int data_len = scn.nextInt(); 
            int[] strm = new int[data_len];
            
            for (int str = 0; str < data_len; str++) {
                strm[str] = scn.nextInt();
            }
            
            PriorityQueue<Integer> min_HP = new PriorityQueue<>();
            
            PriorityQueue<Integer> max_HP = new PriorityQueue<>(Collections.reverseOrder());

            for (int str = 0; str < data_len; str++) {
                num_add(strm[str], min_HP, max_HP);
                blnc_HP(min_HP, max_HP);
                System.out.print(median(min_HP, max_HP) + " ");
            }
            System.out.println(); 
        }
        scn.close();
    }

    private static void num_add(int number, PriorityQueue<Integer> min_HP, PriorityQueue<Integer> max_HP) {
        if (max_HP.isEmpty() || number <= max_HP.peek()) {
            max_HP.offer(number);
        } else {
            min_HP.offer(number);
        }
    }

    private static void blnc_HP(PriorityQueue<Integer> min_HP, PriorityQueue<Integer> max_HP) {
        if (max_HP.size() > min_HP.size() + 1) {
            min_HP.offer(max_HP.poll());
        } else if (min_HP.size() > max_HP.size()) {
            max_HP.offer(min_HP.poll());
        }
    }

    private static int median(PriorityQueue<Integer> min_HP, PriorityQueue<Integer> max_HP) {
        if (max_HP.size() == min_HP.size()) {
            return (max_HP.peek() + min_HP.peek()) / 2;
        } else {
            return max_HP.peek();
        }
    }
}
