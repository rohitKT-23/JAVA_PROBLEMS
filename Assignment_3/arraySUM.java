import java.util.Scanner;

public class arraySUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt();

        long[] array = new long[total_nums];
        for(int i=0; i<total_nums; i++){
            int target = sc.nextInt();
            array[i] = target;
        }

        int operations = sc.nextInt();
        while(operations>0){
            int x = sc.nextInt();
            if(x==1){
                PART1(array);
            }
            else{
                PART2(array);
            }
            operations--;
        }
        long S = 0;
        for(int i=0; i<total_nums; i++){
            S += array[i];
        }
        long ans = S % (long)(Math.pow(10,9)+7);
        System.out.println(ans);
        sc.close();
    }
    public static void PART1(long[] array){
        long[] new_array = new long[array.length];
        for(int i=0; i<array.length; i++){
            new_array[i] = array[i];
        }
        for(int i=0; i<array.length; i++){
            if(i==0){
                array[0] = new_array[0]+new_array[array.length-1];
            }
            else{
                array[i] = new_array[i-1] + new_array[i];
            }
        }
    }
    public static void PART2(long[] array){
        int numbers = array.length;
        for(int i=0; i<numbers; i++){
            array[i] = 2*array[i];
        }
    }
}