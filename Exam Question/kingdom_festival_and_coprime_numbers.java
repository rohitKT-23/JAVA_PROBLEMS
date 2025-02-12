import java.util.*;

public class kingdom_festival_and_coprime_numbers {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int array_size = scan.nextInt();

        int array[] = new int[array_size];

        // i -> row

        for(int row = 0 ; row < array_size ; row++){

            array[row] = scan.nextInt();

        }

        possiblitiy_of_coPrime(array);

        scan.close();

    }

    public static void possiblitiy_of_coPrime(int[] array){

        int array_size = array.length;

        for (int row = 1 ; row < array_size ; row++){

            if(!find_GCD ( array[row] , array[row-1] ) ) {

                array[row] = lowest_common_multiple(array[row],array[row-1]);


                for (int j=row-1;j<array_size-1;j++){

                    array[j] = array[j+1];

                }


                array_size--;

                row=Math.max(row-2,0);

            }

        }        

        int[] arrr= new int[array_size];

        System.arraycopy(array,0,arrr,0,array_size);

        for(int row=0;row<arrr.length;row++){

            System.out.print(arrr[row]+" ");

        }

    }

    public static boolean find_GCD(int x,int y){

        return greates_common_divisor(x,y)==1;

    }


    public static int greates_common_divisor(int x, int y){

        while(y != 0){

            int temp = y;

            y = x % y;

            x = temp;

        }

        return x;

    }

    public static int lowest_common_multiple(int x,int y){

        return x * ( y / greates_common_divisor(x , y));

    }

}