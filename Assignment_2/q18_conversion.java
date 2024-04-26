import java.util.Scanner;

public class q18_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourceb = sc.nextInt(); // source base the number which is being input
        int dbase = sc.nextInt(); // destination base means in witch the input number should be converted
        int snum = sc.nextInt(); // input number
        int converted = convert(snum, sourceb, dbase);// calling function
        System.out.println(converted);

        sc.close();
    }

    // first converting any base number into decimal
    public static int convert(int snum, int sourceb, int dbase) {
        int deciVal = 0;
        int baseMulti = 1;
        while (snum > 0) {
            int digit = snum % 10;
            deciVal += digit * baseMulti;
            baseMulti *= sourceb;
            snum /= 10;
        }
        // now converting the decimal number obtain from above code into the specified
        // base
        int destinationVal = 0;
        baseMulti = 1;
        while (deciVal > 0) {
            int rem = deciVal % dbase;
            destinationVal += rem * baseMulti;
            baseMulti *= 10;
            deciVal /= dbase;
        }

        return destinationVal;
    }
}
