import java.util.Scanner;

class nd {
    int dta;
    nd nxt;
    
    nd(int dta) {
        this.dta = dta;
        nxt = null;
    }
}

public class kth_element_from_last_ll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        nd hd = null;
        nd tl = null;
        
        int input = scan.nextInt();
        while (input != -1) {
            nd newNode = new nd(input);
            if (hd == null) {
                hd = newNode;
                tl = newNode;
            } else {
                tl.nxt = newNode;
                tl = newNode;
            }
            input = scan.nextInt();
        }
        
        int kth = scan.nextInt();         
        nd num_1 = hd;
        nd num_2 = hd;
        
        for (int i = 0; i < kth; i++) {
            if (num_2 == null) {
                System.out.println("Invalid input: kth is larger than the number of nodes");
                return;
            }
            num_2 = num_2.nxt;
        }
        
        while (num_2 != null) {
            num_1 = num_1.nxt;
            num_2 = num_2.nxt;
        }
        
        if (num_1 != null) {
            System.out.println(num_1.dta);
        } else {
            System.out.println("Invalid input: kth is larger than the number of nodes");
        }
    }
}
