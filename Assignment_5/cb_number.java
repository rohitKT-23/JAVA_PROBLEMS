import java.util.*;
public class cb_number {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int str_size = sc.nextInt();
		String string = sc.next();

		System.out.println(MAX_CB_NUM(string));
	}

	public static boolean cb_PRIME(long number) {
		if(number == 0 || number == 1) {
			return false;
		}

		int []array1 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        // i => row
		for(int row = 0; row < array1.length; row++) {
			if(array1[row] == number) {
				return true;
			}
		}

		for (int row = 0; row < array1.length; row++) {
			if(number % array1[row] == 0) {
				return false;
			}
		}
		return true;
	}
	public static int MAX_CB_NUM(String str) {
		int cnt = 0;

		boolean [] visted = new boolean[str.length()];

		for(int length = 1; length <= str.length(); length++) {
			for(int col = length; col <= str.length(); col++) {

				int row = col - length;
				String string = str.substring(row,col);

				if(cb_PRIME(Long.parseLong(string)) && VISTED(visted, row, col - 1)) {
					cnt++;

					for(int k = row; k <= col - 1; k++) {

						visted[k] = true;
					}
				}
			}
		}
		return cnt;
	}
	public static boolean VISTED(boolean [] visted, int starting, int ending) {
		for (int row = starting; row <= ending; row++) {
			if(visted[row] == true) {
				return false;
			}
		}
		return true;
	}
}