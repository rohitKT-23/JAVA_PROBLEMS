import java.util.*;

public class library_impose {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int array[] = new int[array_size];

        int lft[] = new int[array_size];

        int rht[] = new int[array_size];

        // i -> row

        for(int row = 0 ; row<array_size ; row++){

            array[row] = scan.nextInt();

        }

        lft[0] = 0;

        rht[0] = 0;

        for(int row = 1 ; row < array_size ; row++){

            lft[row] = lft[row-1] + array[row-1];

        }

        for(int row = array_size - 2 ; row>= 0 ; row--){

            rht[row]=rht[row+1]+array[row+1];

        }

        int idx_of_impose=-1;

        for(int row=0 ; row < array_size ; row++){

            if(lft[row]==rht[row]){

                idx_of_impose = row;

                break;

            }

        }

        System.out.print(idx_of_impose);

        scan.close();

    }

}