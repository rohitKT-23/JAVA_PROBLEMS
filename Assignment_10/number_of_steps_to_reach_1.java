import java.util.Scanner;

public class number_of_steps_to_reach_1 {

    public static int min_stps(int t_nums) {
        int t_steps =0;

        while (t_nums >1) {
            if (t_nums% 2 == 0) {
                t_nums/= 2;
            } else {
                if (
                    t_nums ==3 
                    || 
                    (t_nums% 4==1)
                    ) {
                    t_nums -=1;
                } else {
                    t_nums+= 1;
                }
            }
            t_steps++;
        }
        return t_steps;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t_nums= sc.nextInt();
        System.out.println(min_stps(t_nums));
        sc.close();
    }
}
