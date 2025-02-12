import java.util.*;

public class sort_books {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total_books = scanner.nextInt();
        scanner.nextLine();

        char[] array = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

        sortBooks(array);

        for (char subject : array) {
            System.out.print(subject + " ");
        }

        scanner.close();
    }

    public static void sortBooks(char[] array) {
        int total_books = array.length;

        int lft = 0; 
        int rht = total_books - 1; 
        int current = 0;

        while (current <= rht) {
            switch (array[current]) {
                case 'P':
                    swaping(array, lft, current);
                    lft++;
                    current++;
                    break;
                case 'C':
                    current++;
                    break;
                case 'M':
                    swaping(array, current, rht);
                    rht--;
                    break;
            }
        }
    }

    public static void swaping(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
