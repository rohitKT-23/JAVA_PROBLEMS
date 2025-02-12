import java.util.*;

public class trip_in_bus {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int size_of_array=scan.nextInt();

        int array_elements[] = new  int[ size_of_array ];

        for(int i = 0 ; i < size_of_array ; i++){

            array_elements[i] = scan.nextInt();

        }

        int k_th = scan.nextInt();

        if(size_of_array == 1){

            System.out.print(k_th * array_elements[0]);

        }

        else{

            System.out.print(oprtn(array_elements , k_th , size_of_array));

        }

        scan.close();

    }

    public static int oprtn(int array_elements[] , int k_th , int size_of_array){

        int lowest  =  1;

        int highest =  k_th  *  array_elements[0];

        int answer = 0;

        while(lowest <= highest ){

            int midest=(lowest + highest )/2;

            if(possiblity(array_elements,size_of_array , k_th , midest)){

                highest = midest-1;

                answer = midest;

            }

            else{

                lowest = midest + 1;

            }

        }

        return answer;

    }

    public static boolean possiblity(int array_elements[],int size_of_array,int k_th , int midest){

        long find = 0;

        for(int i = 0 ; i <size_of_array ; i++){

            find = find +midest/array_elements[i];

        }

        return find >= k_th ; 

    }

}