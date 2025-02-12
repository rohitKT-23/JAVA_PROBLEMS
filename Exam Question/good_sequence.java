import java.util.*;

public class good_sequence {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int array[] = new int[array_size];

        for(int i = 0 ; i < array_size ; i++){

            array[i] = scan.nextInt();

        }

        if(array_size == 0 || array_size == 1 || array_size == 2){

            System.out.print("true");

        }

        else{

            System.out.print(is_good_sequence(array));

        }

        scan.close();

    }

    public static boolean is_good_sequence(int array[]){

        int seq = 0;

        for(int i = 0 ; i < array.length - 1 ; i++){

            if(seq > 1){

                break;

            }

            for(int j = i + 1 ; j < array.length ; j++){

                if(array[i] > array[j]){

                    seq++;

                    break;

                }

            }

        }

        if(seq > 1){

            return false;

        }

        else{

            return true;

        }

    }

}