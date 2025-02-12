import java.util.*;

public class polite_sort {

	public static void main (String args[]) {

		Scanner scan=new Scanner(System.in);

		int array_size = scan.nextInt();

		int array[] = new int[array_size];

		int id[] = new int[array_size];

		for(int i = 0 ; i < array_size ; i++){

			array[i] = scan.nextInt();

			id[i] = array[i];

		}

		Arrays.sort(array);

		int initializtion = 0;

		int books = array_size-1;

		while(initializtion <array_size && array[initializtion] == id [initializtion] ){

			initializtion++;

		}

		while(books >= 0 && array[books] == id[books]){

			books--;

		}

		int result_2 = books - initializtion+1;

		if(initializtion > books){

			result_2 = 0 ;

		}

		System.out.print(result_2);

		scan.close();

	}

}