import java.util.Scanner;

public class arrayPRODUCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_nums = sc.nextInt();

        long[] array = new long[total_nums];
        for(int i=0; i<total_nums; i++){
            int target = sc.nextInt();
            array[i] = target;
        }

        long[] array2 = PRODUCT(array);

        for(int i=0; i<array2.length; i++){
            System.out.print(array2[i]+" ");
        }
        sc.close();
    }
    public static long[] PRODUCT(long[] arr){
        int length = arr.length;

        long[] left = new long[length];
        left[0] = 1;
        for(int i=1; i<arr.length; i++){
            left[i] = left[i-1]*arr[i-1];
        }

        long[] right = new long[length];
        right[length-1] = 1;
        for(int i=length-2; i>=0; i--){
            right[i] = right[i+1]*arr[i+1];
        }

        for(int i=0; i<length; i++){
            left[i] = left[i]*right[i];
        }
        return left;   
    }
}