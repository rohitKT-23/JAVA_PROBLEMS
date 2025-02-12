import java.util.*;

public class the_ramayan {

    public static void main (String args[]) {

        Scanner scan=new Scanner(System.in);

        long arrow_capacity = scan.nextLong();

        long arrows = arrow_capacity;

        long total_arrow_added_everyday = scan.nextLong();

        long total_days = total_arrow_added_everyday - 1;

        if (total_arrow_added_everyday > arrow_capacity) {

            System.out.print( arrow_capacity );

        }

        else{

            while( arrow_capacity > 0 ){

                if( arrow_capacity + total_arrow_added_everyday > arrows ){

                    arrow_capacity = arrows;

                }

                else{

                    arrow_capacity = arrow_capacity + total_arrow_added_everyday;

                }

                total_days++;

                arrow_capacity = arrow_capacity - total_days;

            }

            System.out.print(total_days);

        }

    }

}
