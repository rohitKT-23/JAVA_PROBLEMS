import java.util.Scanner;

public class arraySHOPING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt();

        int[] array = new int[total_nums];
        for(int i=0; i<total_nums; i++){
            int itm = sc.nextInt();
            array[i] = itm;
        }

    
        int no_of_queries = sc.nextInt();

        for(int i=0; i<no_of_queries; i++){
            int money = sc.nextInt();
            int kitem = sc.nextInt();
            System.out.println(func(array, money, kitem));
        }
        sc.close();
    }
    public static String func(int[] array, int money, int kitems){
        int cnt = 0;
        for(int i=0; i<array.length; i++){
            if(money % array[i] == 0){
                cnt++;
            }
        }
        if(cnt >= kitems){
            return "Yes";
        }
        else{
            return "No";
        }
    }

}