import java.util.*;

public class ll_even_odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t_elements = scan.nextInt(); 
        int[] array = new int[t_elements]; 
        for (int element = 0; element < t_elements; element++) {
            array[element] = scan.nextInt(); 
        }
        ArrayList<Integer> odd_num = new ArrayList<>();
        ArrayList<Integer> even_num = new ArrayList<>();
        for (int element = 0; element < t_elements; element++) {
            if (array[element] % 2 == 0) {
                even_num.add(array[element]);
            } else {
                odd_num.add(array[element]);
            }
        }
        ArrayList<Integer> nw_lst = new ArrayList<>(odd_num);
        nw_lst.addAll(even_num);
        for (int element = 0; element < nw_lst.size(); element++) {
            System.out.print(nw_lst.get(element) + " ");
        }
        scan.close();
    }
}
