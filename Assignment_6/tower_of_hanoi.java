import java.util.Scanner;

public class tower_of_hanoi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of rings (N): ");
        int rings = scan.nextInt();

        char src = 'A';
        char target = 'B';
        char auxillary = 'C';

        TOH(rings, src, target, auxillary);

        scan.close();
    }
    
    public static void TOH(int rings, char source, char target, char auxiliary) {
        if (rings == 1) {
            System.out.println("Moving ring 1 from " + source + " to " + target);
            return;
        }
        TOH(rings - 1, source, auxiliary, target);
        System.out.println("Moving ring " + rings + " from " + source + " to " + target);
        TOH(rings - 1, auxiliary, target, source);
    }
}
