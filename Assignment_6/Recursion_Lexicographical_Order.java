import java.util.*;
public class Recursion_Lexicographical_Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();

        List<Integer> answer = new ArrayList<>();

        lexico_cnt(answer, nums, 0);

        for(int item : answer){
            System.out.print(item + " ");
        }
        scan.close();
    }
    public static void lexico_cnt(List<Integer> answer, int n, int main_num){
        if(main_num > n){
            return;
        }
        answer.add(main_num);
        
        int i=0;

        if(main_num == 0){
            i=1;
        }
        for(; i<=9; i++){
            lexico_cnt(answer, n, main_num*10+i);
        }
    }
}
