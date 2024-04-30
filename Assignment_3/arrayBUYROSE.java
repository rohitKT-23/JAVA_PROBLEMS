import java.util.Scanner;

public class arrayBUYROSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CASES = sc.nextInt();
        for(int i=0; i<CASES; i++){
            int total_rose = sc.nextInt();
            int[] cost = new int[total_rose];
            for(int j=0; j<total_rose; j++){
                int target = sc.nextInt();
                cost[j] = target;
            }
            Sort(cost);
            int amt = sc.nextInt();
            ROSES(cost, amt);
            System.out.println();
        }
        sc.close();
    }
    public static void ROSES(int[] array, int amt){
        int n = array.length;
        int lft = 0;
        int rht = n - 1;
        int start = 0;
        int stop = 0;
        while (lft < rht){
            int sum = array[lft] + array[rht];
            if (sum > amt){
                rht--;
            }
            else if (sum < amt){
                lft++;
            }
            else if(sum == amt){
                start = array[lft];
                stop = array[rht];
                lft++;
                rht--;
            }
        }
        System.out.println("Deepak should buy roses whose cost are " + start +" and "+ stop +".");
    }
    public static void Sort(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=1; j<array.length-i; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}