import java.util.*;

public class kartik_bhahiya_and_signum_function {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int[] array = new int[array_size];

        int val_1 = 1;

        int val_2 = 0;

        for(int i=0 ; i < array_size ; i++){

            array[i] = scan.nextInt();

            if(array[i] == 0){

                val_1 = 0;

            }

            else if(array[i] < 0){

                val_2++;

            }

        }

        if(val_1 == 0){

            System.out.print("0");

        }

        else if(val_2%2 == 1){

            System.out.print("-1");

        }

        else{

            System.out.print("1");

        }

        scan.close();

    }

}